package com.kadir.utils;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class RestRootEntity<T> {

    private Integer status;

    private T payload;

    private String errorMessage;

    public static <T> RestRootEntity<T> ok(T payload) {
        RestRootEntity<T> restRootEntity = new RestRootEntity<>();
        restRootEntity.setStatus(HttpStatus.OK.value());
        restRootEntity.setPayload(payload);
        restRootEntity.setErrorMessage(null);
        return restRootEntity;
    }
}
