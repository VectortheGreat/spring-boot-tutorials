package com.kadir.controller;

import java.util.List;

import com.kadir.dto.DtoEmployee;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployees();
}
