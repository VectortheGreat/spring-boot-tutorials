package com.kadir.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadir.controller.RestEmployeeController;
import com.kadir.dto.DtoEmployee;
import com.kadir.model.RootEntity;
import com.kadir.service.IEmployeeSerice;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
    private IEmployeeSerice employeeService;

    @GetMapping(path = "/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }

}
