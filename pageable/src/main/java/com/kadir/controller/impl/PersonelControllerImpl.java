package com.kadir.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadir.controller.IPersonelController;
import com.kadir.dto.DtoPersonel;
import com.kadir.model.Personel;
import com.kadir.service.IPersonelService;
import com.kadir.utils.RestPageableEntity;
import com.kadir.utils.RestPageableRequest;
import com.kadir.utils.RestRootEntity;

@RestController
@RequestMapping("/rest/api/personel")
public class PersonelControllerImpl extends RestBaseController implements IPersonelController {

    @Autowired
    private IPersonelService personelService;

    @GetMapping("/list/pageable")
    @Override
    public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(
            @ModelAttribute RestPageableRequest pageable) {
        Page<Personel> page = personelService.findAllPageable(toPageable(pageable));
        RestPageableEntity<DtoPersonel> pageableResponse = toPageableResponse(page,
                personelService.toDTOList(page.getContent()));
        return ok(pageableResponse);
    }

}
