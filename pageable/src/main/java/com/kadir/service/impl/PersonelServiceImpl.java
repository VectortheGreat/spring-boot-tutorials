package com.kadir.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kadir.dto.DtoDepartment;
import com.kadir.dto.DtoPersonel;
import com.kadir.model.Personel;
import com.kadir.repository.PersonelRepository;
import com.kadir.service.IPersonelService;

@Service
public class PersonelServiceImpl implements IPersonelService {

    @Autowired
    private PersonelRepository personelRepository;

    @Override
    public Page<Personel> findAllPageable(Pageable pageable) {
        return personelRepository.findAll(pageable);
    }

    @Override
    public List<DtoPersonel> toDTOList(List<Personel> personelList) {

        List<DtoPersonel> dtoList = new ArrayList<>();

        for (Personel personel : personelList) {
            DtoPersonel dtoPersonel = new DtoPersonel();
            DtoDepartment dtoDepartment = new DtoDepartment();

            BeanUtils.copyProperties(personel, dtoPersonel);
            BeanUtils.copyProperties(personel.getDepartment(), dtoDepartment);

            dtoPersonel.setDepartment(dtoDepartment);
            dtoList.add(dtoPersonel);
        }
        return dtoList;
    }

}
