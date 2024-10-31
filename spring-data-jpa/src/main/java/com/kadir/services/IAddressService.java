package com.kadir.services;

import com.kadir.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}