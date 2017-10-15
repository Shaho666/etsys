package com.etsys.orm.pojo;

public class TbTemplateEntry {
    private Integer temEntryId;

    private String temId;

    private Integer temType;

    private Integer temNum;

    private Double temScore;

    public Integer getTemEntryId() {
        return temEntryId;
    }

    public void setTemEntryId(Integer temEntryId) {
        this.temEntryId = temEntryId;
    }

    public String getTemId() {
        return temId;
    }

    public void setTemId(String temId) {
        this.temId = temId == null ? null : temId.trim();
    }

    public Integer getTemType() {
        return temType;
    }

    public void setTemType(Integer temType) {
        this.temType = temType;
    }

    public Integer getTemNum() {
        return temNum;
    }

    public void setTemNum(Integer temNum) {
        this.temNum = temNum;
    }

    public Double getTemScore() {
        return temScore;
    }

    public void setTemScore(Double temScore) {
        this.temScore = temScore;
    }
}