package com.kadir.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadir.dto.DtoAddress;
import com.kadir.dto.DtoCustomer;
import com.kadir.entities.Address;
import com.kadir.repository.AddressRepository;
import com.kadir.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id) {
        DtoAddress dtoAddress = new DtoAddress();
        Optional<Address> optional = addressRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        System.out.println("optional: " + optional.get());
        Address address = optional.get();
        BeanUtils.copyProperties(address, dtoAddress);
        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
        // dtoCustomer.setAddress(dtoAddress); //! Sonsuz döngüye sebep olur.
        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;
    }

}
