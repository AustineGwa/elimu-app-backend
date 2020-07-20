package com.elimu.elimuappbackend.model;

public class TextContent {
    private Long textContentId;
    private Long subTopicId;
    private String textContentResource;
    private String textImageURL;
    private LearnerType contentType;

    public TextContent() {
    }

    public Long getTextContentId() {
        return textContentId;
    }

    public void setTextContentId(Long textContentId) {
        this.textContentId = textContentId;
    }

    public Long getSubTopicId() {
        return subTopicId;
    }

    public void setSubTopicId(Long subTopicId) {
        this.subTopicId = subTopicId;
    }

    public String getTextContentResource() {
        return textContentResource;
    }

    public void setTextContentResource(String textContentResource) {
        this.textContentResource = textContentResource;
    }

    public String getTextImageURL() {
        return textImageURL;
    }

    public void setTextImageURL(String textImageURL) {
        this.textImageURL = textImageURL;
    }

    public LearnerType getContentType() {
        return contentType;
    }

    public void setContentType(LearnerType contentType) {
        this.contentType = contentType;
    }
}
