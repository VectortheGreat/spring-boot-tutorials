package com.kadir.controller.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kadir.dto.DtoPersonel;
import com.kadir.utils.PagerUtil;
import com.kadir.utils.RestPageableEntity;
import com.kadir.utils.RestPageableRequest;
import com.kadir.utils.RestRootEntity;

public class RestBaseController {

    public Pageable toPageable(RestPageableRequest request) {
        return PagerUtil.toPageable(request);
    }

    public <T> RestPageableEntity<DtoPersonel> toPageableResponse(Page<?> page, List<DtoPersonel> content) {
        return PagerUtil.toPageableResponse(page, content);
    }

    public <T> RestRootEntity<T> ok(T payload) {
        return RestRootEntity.ok(payload);
    }
}
