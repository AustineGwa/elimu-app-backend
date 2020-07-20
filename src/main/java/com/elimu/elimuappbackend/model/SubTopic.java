package com.elimu.elimuappbackend.model;

import java.util.List;

public class SubTopic {
    private Long subTopicId;
    private Long topicId;
    private String subTopicName;
    private String subTopicDescription;
    private List<VideoContent> videoContent;
    private List<TextContent>   textContent;
}
