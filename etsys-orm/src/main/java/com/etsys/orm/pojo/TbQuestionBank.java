package com.etsys.orm.pojo;

public class TbQuestionBank {
    private String queId;

    private Integer queType;

    private Integer queDegree;

    private Integer queState;

    private String courseId;

    public String getQueId() {
        return queId;
    }

    public void setQueId(String queId) {
        this.queId = queId == null ? null : queId.trim();
    }

    public Integer getQueType() {
        return queType;
    }

    public void setQueType(Integer queType) {
        this.queType = queType;
    }

    public Integer getQueDegree() {
        return queDegree;
    }

    public void setQueDegree(Integer queDegree) {
        this.queDegree = queDegree;
    }

    public Integer getQueState() {
        return queState;
    }

    public void setQueState(Integer queState) {
        this.queState = queState;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }
}