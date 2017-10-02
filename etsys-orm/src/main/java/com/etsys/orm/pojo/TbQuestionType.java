package com.etsys.orm.pojo;

public class TbQuestionType {
    private Integer qtId;

    private String qtName;

    public Integer getQtId() {
        return qtId;
    }

    public void setQtId(Integer qtId) {
        this.qtId = qtId;
    }

    public String getQtName() {
        return qtName;
    }

    public void setQtName(String qtName) {
        this.qtName = qtName == null ? null : qtName.trim();
    }
}