package com.elimu.elimuappbackend.model;

import java.util.List;

public class SubTopic {
    private Long subTopicId;
    private Long topicId;
    private String subTopicName;
    private String subTopicDescription;
    private List<VideoContent> videoContent;
    private List<TextContent>   textContent;

    public SubTopic() {
    }

    public Long getSubTopicId() {
        return subTopicId;
    }

    public void setSubTopicId(Long subTopicId) {
        this.subTopicId = subTopicId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getSubTopicName() {
        return subTopicName;
    }

    public void setSubTopicName(String subTopicName) {
        this.subTopicName = subTopicName;
    }

    public String getSubTopicDescription() {
        return subTopicDescription;
    }

    public void setSubTopicDescription(String subTopicDescription) {
        this.subTopicDescription = subTopicDescription;
    }

    public List<VideoContent> getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(List<VideoContent> videoContent) {
        this.videoContent = videoContent;
    }

    public List<TextContent> getTextContent() {
        return textContent;
    }

    public void setTextContent(List<TextContent> textContent) {
        this.textContent = textContent;
    }
}
