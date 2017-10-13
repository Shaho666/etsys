package com.etsys.orm.pojo;

import java.util.Date;

public class TbTest {
    private String testId;

    private Date created;

    private String courseId;

    private String teacherId;

    private String templateId;

    private Integer testDegree;

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId == null ? null : testId.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public Integer getTestDegree() {
        return testDegree;
    }

    public void setTestDegree(Integer testDegree) {
        this.testDegree = testDegree;
    }
}