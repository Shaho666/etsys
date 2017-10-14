package com.etsys.orm.pojo;

public class TbTestPaper {
    private String tpId;

    private Integer tpType;

    private Integer tpState;

    private String stuId;

    private String courseId;

    private String testId;

    private String tpContent;

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId == null ? null : tpId.trim();
    }

    public Integer getTpType() {
        return tpType;
    }

    public void setTpType(Integer tpType) {
        this.tpType = tpType;
    }

    public Integer getTpState() {
        return tpState;
    }

    public void setTpState(Integer tpState) {
        this.tpState = tpState;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId == null ? null : testId.trim();
    }

    public String getTpContent() {
        return tpContent;
    }

    public void setTpContent(String tpContent) {
        this.tpContent = tpContent == null ? null : tpContent.trim();
    }
}