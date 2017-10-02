package com.etsys.orm.pojo;

public class TbQuestionBankWithBLOBs extends TbQuestionBank {
    private String queContent;

    private String queAnswer;

    public String getQueContent() {
        return queContent;
    }

    public void setQueContent(String queContent) {
        this.queContent = queContent == null ? null : queContent.trim();
    }

    public String getQueAnswer() {
        return queAnswer;
    }

    public void setQueAnswer(String queAnswer) {
        this.queAnswer = queAnswer == null ? null : queAnswer.trim();
    }
}