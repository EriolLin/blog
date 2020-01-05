package com.eriol.blog.business.controller;

import com.eriol.blog.business.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

}
