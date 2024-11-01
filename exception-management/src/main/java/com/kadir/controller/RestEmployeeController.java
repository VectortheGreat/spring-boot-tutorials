package com.kadir.controller;

import com.kadir.dto.DtoEmployee;
import com.kadir.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
