package com.elimu.elimuappbackend.model;

import java.util.List;

public class Topic {
    private Long topicId;
    private String subjectId;
    private String  topicName;
    private String topicDescription;
    private String topicImageUrl;
    private List<SubTopic> subTopics;
    private List<TopicQuiz> TopicQuizes;

    public Topic() {
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public String getTopicImageUrl() {
        return topicImageUrl;
    }

    public void setTopicImageUrl(String topicImageUrl) {
        this.topicImageUrl = topicImageUrl;
    }

    public List<SubTopic> getSubTopics() {
        return subTopics;
    }

    public void setSubTopics(List<SubTopic> subTopics) {
        this.subTopics = subTopics;
    }

    public List<TopicQuiz> getTopicQuizes() {
        return TopicQuizes;
    }

    public void setTopicQuizes(List<TopicQuiz> topicQuizes) {
        TopicQuizes = topicQuizes;
    }
}
