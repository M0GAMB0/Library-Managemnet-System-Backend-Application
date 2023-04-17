package com.springProjects.libararyManagementSystem.controller;

import com.springProjects.libararyManagementSystem.DTOs.ReqDto.AuthorReqDto;
import com.springProjects.libararyManagementSystem.model.Author;
import com.springProjects.libararyManagementSystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add-author")
    public String addAuthor(@RequestBody AuthorReqDto authorReqDto){
        return authorService.addAuthor(authorReqDto);
    }

}
