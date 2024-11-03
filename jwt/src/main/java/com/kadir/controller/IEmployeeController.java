package com.kadir.controller;

import com.kadir.dto.DtoEmployee;

public interface IEmployeeController {
    public DtoEmployee findEmployeeById(Long id);
}
