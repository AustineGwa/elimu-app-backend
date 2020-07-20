package com.elimu.elimuappbackend.model;

import java.util.List;

public class TopicQuiz {
    private Long topicQuizId;
    private Long topicId;
    private String topicQuizName;
    private String topicQuizDescription;
    private int quizTimeLimit;
    private String quizImageURL;
    private Topic topic;
    private int no_of_questions;
    private List<TopicQuizQuestion> quizQuestions;
    private String topicName;

    public TopicQuiz() {
    }

    public Long getTopicQuizId() {
        return topicQuizId;
    }

    public void setTopicQuizId(Long topicQuizId) {
        this.topicQuizId = topicQuizId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicQuizName() {
        return topicQuizName;
    }

    public void setTopicQuizName(String topicQuizName) {
        this.topicQuizName = topicQuizName;
    }

    public String getTopicQuizDescription() {
        return topicQuizDescription;
    }

    public void setTopicQuizDescription(String topicQuizDescription) {
        this.topicQuizDescription = topicQuizDescription;
    }

    public int getQuizTimeLimit() {
        return quizTimeLimit;
    }

    public void setQuizTimeLimit(int quizTimeLimit) {
        this.quizTimeLimit = quizTimeLimit;
    }

    public String getQuizImageURL() {
        return quizImageURL;
    }

    public void setQuizImageURL(String quizImageURL) {
        this.quizImageURL = quizImageURL;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public int getNo_of_questions() {
        return no_of_questions;
    }

    public void setNo_of_questions(int no_of_questions) {
        this.no_of_questions = no_of_questions;
    }

    public List<TopicQuizQuestion> getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(List<TopicQuizQuestion> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
