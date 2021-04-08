package com.codeclan.example.SGNNNewsApp.controller;


import com.codeclan.example.SGNNNewsApp.repository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;
}
