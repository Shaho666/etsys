package com.etsys.orm.pojo;

public class TbTestPaper {
    private String tpId;

    private String tpName;

    private Integer tpState;

    private String stuId;

    private String courseId;

    private String tpContent;

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId == null ? null : tpId.trim();
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName == null ? null : tpName.trim();
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

    public String getTpContent() {
        return tpContent;
    }

    public void setTpContent(String tpContent) {
        this.tpContent = tpContent == null ? null : tpContent.trim();
    }
}