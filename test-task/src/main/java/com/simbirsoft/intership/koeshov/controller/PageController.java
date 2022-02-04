package com.simbirsoft.intership.koeshov.controller;

import com.simbirsoft.intership.koeshov.dto.PageDTO;
import com.simbirsoft.intership.koeshov.dto.WordCountDTO;
import com.simbirsoft.intership.koeshov.service.PageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/page/")
public class PageController {

    public final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @PostMapping
    public WordCountDTO countUniqueWord (PageDTO pageDTO){
        return pageService.uniqueWodCount(pageDTO);
    }
}
