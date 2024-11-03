package com.kadir.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kadir.dto.DtoPersonel;
import com.kadir.model.Personel;

public interface IPersonelService {

    Page<Personel> findAllPageable(Pageable pageable);

    List<DtoPersonel> toDTOList(List<Personel> personelList);

}
