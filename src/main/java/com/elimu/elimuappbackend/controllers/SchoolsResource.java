package com.elimu.elimuappbackend.controllers;

import com.elimu.elimuappbackend.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SchoolsResource {

    @GetMapping("/schools")
    public List<School> getAllSchools(){
        return Arrays.asList(new School(1, "mmust", "masinde Muliro"), new School(2, "uon" ,
                "University Of Nairobi"));
    }
}
