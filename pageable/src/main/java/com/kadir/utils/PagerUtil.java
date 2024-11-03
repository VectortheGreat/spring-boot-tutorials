package com.kadir.utils;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.kadir.dto.DtoPersonel;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PagerUtil {

    public boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public Pageable toPageable(RestPageableRequest request) {
        if (!isNullOrEmpty(request.getColumnName())) {
            Sort sortBy = request.isAsc() ? Sort.by(Direction.ASC, request.getColumnName())
                    : Sort.by(Direction.DESC, request.getColumnName());

            return PageRequest.of(request.getPageNumber(), request.getPageSize(), sortBy);
        }
        return PageRequest.of(request.getPageNumber(), request.getPageSize());
    }

    public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<DtoPersonel> content) {
        RestPageableEntity<T> pagebleEntity = new RestPageableEntity<>();
        pagebleEntity.setContent(content);
        pagebleEntity.setPageNumber(page.getPageable().getPageNumber());
        pagebleEntity.setPageSize(page.getPageable().getPageSize());
        pagebleEntity.setTotalElements(page.getTotalElements());

        return pagebleEntity;
    }
}
