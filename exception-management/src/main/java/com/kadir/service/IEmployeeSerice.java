package com.kadir.service;

import com.kadir.dto.DtoEmployee;

public interface IEmployeeSerice {

    public DtoEmployee findEmployeeById(Long id);
}
