package com.kadir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kadir.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
