package com.etsys.orm.pojo;

public class TbScore {
    private String scoId;

    private String tpId;

    private String scoMark;

    private String scoDetail;

    public String getScoId() {
        return scoId;
    }

    public void setScoId(String scoId) {
        this.scoId = scoId == null ? null : scoId.trim();
    }

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId == null ? null : tpId.trim();
    }

    public String getScoMark() {
        return scoMark;
    }

    public void setScoMark(String scoMark) {
        this.scoMark = scoMark == null ? null : scoMark.trim();
    }

    public String getScoDetail() {
        return scoDetail;
    }

    public void setScoDetail(String scoDetail) {
        this.scoDetail = scoDetail == null ? null : scoDetail.trim();
    }
}