package com.elimu.elimuappbackend.controllers;

import com.elimu.elimuappbackend.model.Subject;
import com.elimu.elimuappbackend.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SubjectResource {

    @GetMapping("/subjects")
    public List<Subject> getAllSUbject(){
        Subject subject = new Subject();
        subject.setSubjectId(Long.valueOf(1));
        subject.setSubjectIcon("https://img.icons8.com/search");
        subject.setSubjectName("Test Lesson");
        subject.setSubjectDescription("This a lesson for testing app functionality");
        subject.setTopics(Arrays.asList(new Topic()));
        return Arrays.asList(subject, subject);
    }

    @PostMapping("/subjects")
    public void postSubject(Subject subject){
        System.out.println(subject.toString());
    }
}
