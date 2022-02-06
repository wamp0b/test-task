package com.simbirsoft.intership.koeshov.service.impl;

import com.simbirsoft.intership.koeshov.entity.Page;
import com.simbirsoft.intership.koeshov.entity.WordCount;
import com.simbirsoft.intership.koeshov.repository.PageRepository;
import com.simbirsoft.intership.koeshov.service.PageService;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class PageServiceImpl implements PageService {

    private final PageRepository pageRepository;

    public PageServiceImpl(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @Override
    public Page uniqueWodCount(String url) throws IOException {
        String pageText = Jsoup.parse(new URL(url), 3000).text();

        ArrayList<String> listOfSeparators = new ArrayList<String>();
        listOfSeparators.add(" ");
        listOfSeparators.add(",");
        listOfSeparators.add(".");
        listOfSeparators.add("!");
        listOfSeparators.add("?");
        listOfSeparators.add("(");
        listOfSeparators.add(")");
        listOfSeparators.add("[");
        listOfSeparators.add("]");
        listOfSeparators.add("-");
        listOfSeparators.add(";");
        listOfSeparators.add(":");
        listOfSeparators.add("\n");
        listOfSeparators.add("\r");
        listOfSeparators.add("\t");

        String separatorsString = String.join("|\\", listOfSeparators);
        Map<String, WordCount> countMap = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(pageText.getBytes(StandardCharsets.UTF_8))));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(separatorsString);
            for (String word : words) {
                if ("".equals(word)) {
                    continue;
                }

                WordCount wordObj = countMap.get(word);
                if (wordObj == null) {
                    wordObj = new WordCount();
                    wordObj.setWord(word);
                    wordObj.setCount(0);
                    countMap.put(word, wordObj);
                }

                wordObj.setCount(wordObj.getCount() + 1);
            }
        }
        reader.close();
        List <WordCount> words = new ArrayList<>(countMap.values());
        Page page = new Page();
        page.setWordCounts(words);
        page.setUrl(url);
        words.forEach(word -> word.setPage(page));
        return pageRepository.save(page);
    }

    @Override
    public Page findById(Long id) {
        return pageRepository.findById(id).get();
    }
}
