package com.simbirsoft.intership.koeshov.service;

import com.simbirsoft.intership.koeshov.entity.Page;

import java.io.IOException;

public interface PageService {

    Page uniqueWodCount (String url) throws IOException;

    Page findById (Long id);
}
