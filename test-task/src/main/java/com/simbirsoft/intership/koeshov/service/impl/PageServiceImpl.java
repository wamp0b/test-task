package com.simbirsoft.intership.koeshov.service.impl;

import com.simbirsoft.intership.koeshov.dto.PageDTO;
import com.simbirsoft.intership.koeshov.dto.WordCountDTO;
import com.simbirsoft.intership.koeshov.service.PageService;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl implements PageService {

    @Override
    public WordCountDTO uniqueWodCount(PageDTO pageDTO) {
        return new WordCountDTO();
    }
}
