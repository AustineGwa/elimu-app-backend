package com.elimu.elimuappbackend.model;

public class Topic {
    private Long topicId;
    private String subjectId;
    private String  topicName;
    private String topicDescription;
    private String topicImageUrl;
    private List<SubTopic> subTopics;
    private List<TopicQuiz> TopicQuizes;
}
