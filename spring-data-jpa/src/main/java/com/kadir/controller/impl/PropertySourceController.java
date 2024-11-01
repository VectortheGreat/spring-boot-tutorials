package com.kadir.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadir.configuration.DataSource;
import com.kadir.configuration.GlobalProperties;

@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/datasource")
    public DataSource getDataSources() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(globalProperties.getUrl());
        dataSource.setUserName(globalProperties.getUserName());
        dataSource.setPassword(globalProperties.getPassword());
        return dataSource;
    }
}
