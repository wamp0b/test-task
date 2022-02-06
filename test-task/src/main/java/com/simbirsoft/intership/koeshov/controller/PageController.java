package com.simbirsoft.intership.koeshov.controller;

import com.simbirsoft.intership.koeshov.entity.Page;
import com.simbirsoft.intership.koeshov.repository.PageRepository;
import com.simbirsoft.intership.koeshov.service.PageService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/api/v1/page/")
public class PageController {

    private final PageService pageService;
    private final PageRepository pageRepository;

    public PageController(PageService pageService, PageRepository pageRepository) {
        this.pageService = pageService;
        this.pageRepository = pageRepository;
    }

    @PostMapping
    public Page countUniqueWord (String url) throws IOException {
        return pageService.uniqueWodCount(url);
    }

    @GetMapping("/{id}")
    public Page getPageById(@PathVariable("id") Long id) {
        return pageRepository.findById(id).get();
    }
}
