package com.codeclan.example.SGNNNewsApp.controller;


import com.codeclan.example.SGNNNewsApp.model.Journalist;
import com.codeclan.example.SGNNNewsApp.repository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;

    @GetMapping(value = "/admin/journalists")
    public ResponseEntity<List<Journalist>> getAllJournalists(){
        return  new ResponseEntity<>(journalistRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/journalists/{id}")
    public ResponseEntity getJournalist(@PathVariable Long id){
        return  new ResponseEntity<>(journalistRepository.findById(id),HttpStatus.OK);
    }



    @PostMapping(value = "/admin/journalists")
    public ResponseEntity<Journalist> postJournalist(@RequestBody Journalist journalist){
        journalistRepository.save(journalist);
        return new ResponseEntity<>(journalist, HttpStatus.CREATED);
    }

    @PatchMapping(value = "admin/journalists/{id}")
    public ResponseEntity<Journalist> updateJournalist(@RequestBody Journalist journalist){
        journalistRepository.save(journalist);
        return new ResponseEntity<>(journalist, HttpStatus.OK);
    }

    @DeleteMapping(value = "admin/journalists/{id}")
    public ResponseEntity<Journalist> deleteJournalist(@PathVariable Long id) {
        Journalist found = journalistRepository.getOne(id);
        journalistRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
