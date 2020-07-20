package com.elimu.elimuappbackend.controllers;

import com.elimu.elimuappbackend.model.*;
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


        //create video content
        VideoContent videoContent = new VideoContent();
        videoContent.setVideoId("vid-1");
        videoContent.setVideoSubTopicId(Long.valueOf(1));
        videoContent.setVideoTitle("Vid-1");
        videoContent.setVideoDescription("Our first video content");

        //create text content
        TextContent textContent = new TextContent();
        textContent.setTextContentId(Long.valueOf(1));
        textContent.setSubTopicId(Long.valueOf(1));

        //create sub topic
        SubTopic subTopic = new SubTopic();
        subTopic.setSubTopicId(Long.valueOf(1));
        subTopic.setTopicId(Long.valueOf(1));
        subTopic.setSubTopicName("Disease");
        subTopic.setSubTopicDescription("Study of human and natural disaeses");
        subTopic.setTextContent(Arrays.asList(textContent));
        subTopic.setVideoContent(Arrays.asList(videoContent));


        Subject subject = new Subject();
        subject.setSubjectId(Long.valueOf(1));
        subject.setSubjectIcon("https://img.icons8.com/search");
        subject.setSubjectName("Test Lesson");
        subject.setSubjectDescription("This a lesson for testing app functionality");

        TopicQuizQuestion topicQuizQuestion = new TopicQuizQuestion();
        topicQuizQuestion.setQuizQuestionId(Long.valueOf(1));
        topicQuizQuestion.setTopicQuizId(Long.valueOf(1));


        TopicQuiz topicQuiz = new TopicQuiz();
        topicQuiz.setTopicQuizId(Long.valueOf(1));
        topicQuiz.setTopicId(Long.valueOf(1));
        topicQuiz.setTopicName("Science Quize");
        topicQuiz.setQuizQuestions(Arrays.asList(topicQuizQuestion));

        //Create topic object
        Topic topic = new Topic();
        topic.setSubjectId(Long.valueOf(1));
        topic.setTopicId(Long.valueOf(1));
        topic.setSubTopics(Arrays.asList(subTopic));
        topic.setTopicQuizes(Arrays.asList(topicQuiz));

        topicQuiz.setTopic(topic);
        topic.setTopicName("science");
        topic.setTopicDescription("A topic about scientific occurencess");


        subject.setTopics(Arrays.asList(topic));
        return Arrays.asList(subject);
    }

    @PostMapping("/subjects")
    public void postSubject(Subject subject){
        System.out.println(subject.toString());
    }
}
