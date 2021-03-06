package com.eriol.blog.business.service;

import com.eriol.blog.business.dto.ArtitleDto.Tinymce;
import com.eriol.blog.business.model.Articles;
import com.eriol.blog.common.base.Service.BfService;

public interface ArticlesService extends BfService<Articles> {
    public void insertTinymce(Tinymce tinymce);
}
