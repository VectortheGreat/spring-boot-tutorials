package com.kadir.services;

import java.util.List;

import com.kadir.dto.DtoEmployee;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();
}
