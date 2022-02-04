package com.simbirsoft.intership.koeshov.service;

import com.simbirsoft.intership.koeshov.dto.PageDTO;
import com.simbirsoft.intership.koeshov.dto.WordCountDTO;

public interface PageService {

    WordCountDTO uniqueWodCount (PageDTO pageDTO);

}
