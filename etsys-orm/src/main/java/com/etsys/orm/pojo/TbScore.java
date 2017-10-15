package com.etsys.orm.pojo;

public class TbScore {
    private String scoId;

    private String testId;

    private String stuId;

    private Double scoMark;

    private Integer scoType;

    public String getScoId() {
        return scoId;
    }

    public void setScoId(String scoId) {
        this.scoId = scoId == null ? null : scoId.trim();
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId == null ? null : testId.trim();
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public Double getScoMark() {
        return scoMark;
    }

    public void setScoMark(Double scoMark) {
        this.scoMark = scoMark;
    }

    public Integer getScoType() {
        return scoType;
    }

    public void setScoType(Integer scoType) {
        this.scoType = scoType;
    }
}