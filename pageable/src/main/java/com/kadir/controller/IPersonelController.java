package com.kadir.controller;

import com.kadir.dto.DtoPersonel;
import com.kadir.utils.RestPageableEntity;
import com.kadir.utils.RestPageableRequest;
import com.kadir.utils.RestRootEntity;

public interface IPersonelController {

    RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest restPageableRequest);
}
