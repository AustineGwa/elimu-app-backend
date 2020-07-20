package com.elimu.elimuappbackend.model;

public class TopicQuizQuestion {
    private Long  quizQuestionId;
    private Long  topicQuizId;
    private Long  skillId;
    private String quizQuestionText;
    private String quizAnswerTextA;
    private String quizAnswerTextB;
    private String quizAnswerTextC;
    private String quizAnswerTextD;
    private String correctResponse;
    private String correctResponseExplanation;

    public TopicQuizQuestion() {
    }

    public Long getQuizQuestionId() {
        return quizQuestionId;
    }

    public void setQuizQuestionId(Long quizQuestionId) {
        this.quizQuestionId = quizQuestionId;
    }

    public Long getTopicQuizId() {
        return topicQuizId;
    }

    public void setTopicQuizId(Long topicQuizId) {
        this.topicQuizId = topicQuizId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getQuizQuestionText() {
        return quizQuestionText;
    }

    public void setQuizQuestionText(String quizQuestionText) {
        this.quizQuestionText = quizQuestionText;
    }

    public String getQuizAnswerTextA() {
        return quizAnswerTextA;
    }

    public void setQuizAnswerTextA(String quizAnswerTextA) {
        this.quizAnswerTextA = quizAnswerTextA;
    }

    public String getQuizAnswerTextB() {
        return quizAnswerTextB;
    }

    public void setQuizAnswerTextB(String quizAnswerTextB) {
        this.quizAnswerTextB = quizAnswerTextB;
    }

    public String getQuizAnswerTextC() {
        return quizAnswerTextC;
    }

    public void setQuizAnswerTextC(String quizAnswerTextC) {
        this.quizAnswerTextC = quizAnswerTextC;
    }

    public String getQuizAnswerTextD() {
        return quizAnswerTextD;
    }

    public void setQuizAnswerTextD(String quizAnswerTextD) {
        this.quizAnswerTextD = quizAnswerTextD;
    }

    public String getCorrectResponse() {
        return correctResponse;
    }

    public void setCorrectResponse(String correctResponse) {
        this.correctResponse = correctResponse;
    }

    public String getCorrectResponseExplanation() {
        return correctResponseExplanation;
    }

    public void setCorrectResponseExplanation(String correctResponseExplanation) {
        this.correctResponseExplanation = correctResponseExplanation;
    }
}
