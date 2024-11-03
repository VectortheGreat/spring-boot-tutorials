package com.kadir.service;

import com.kadir.dto.DtoEmployee;

public interface IEmployeeService {
    DtoEmployee findEmployeeById(Long id);
}
