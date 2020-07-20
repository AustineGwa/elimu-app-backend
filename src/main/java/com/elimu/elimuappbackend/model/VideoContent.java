package com.elimu.elimuappbackend.model;

public class VideoContent {
    private String  videoId;
    private Long videoSubTopicId;
    private String videoTitle;
    private String videoDescription;
    private LearnerType  contentType;

    public VideoContent() {
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Long getVideoSubTopicId() {
        return videoSubTopicId;
    }

    public void setVideoSubTopicId(Long videoSubTopicId) {
        this.videoSubTopicId = videoSubTopicId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public LearnerType getContentType() {
        return contentType;
    }

    public void setContentType(LearnerType contentType) {
        this.contentType = contentType;
    }
}
