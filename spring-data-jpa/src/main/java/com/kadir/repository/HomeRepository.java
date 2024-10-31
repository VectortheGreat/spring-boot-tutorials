package com.kadir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kadir.entities.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

}
