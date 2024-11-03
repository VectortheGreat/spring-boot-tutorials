package com.kadir.utils;

import java.util.List;

import com.kadir.dto.DtoPersonel;

import lombok.Data;

@Data
public class RestPageableEntity<T> {

    private List<DtoPersonel> content;

    private int pageNumber;

    private int pageSize;

    private Long totalElements;
}
