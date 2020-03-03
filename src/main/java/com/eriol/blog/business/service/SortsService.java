package com.eriol.blog.business.service;

import com.eriol.blog.business.dto.SortsDto.Option;
import com.eriol.blog.business.model.Sorts;
import com.eriol.blog.common.base.Service.BfService;

public interface SortsService extends BfService<Sorts> {
    public Option sortOption();
}
