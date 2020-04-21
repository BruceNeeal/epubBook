package com.bruce.bean;

public class Progress {
    private Integer progressid;

    private Integer progressuserid;

    private String progressbookid;

    private Integer page;

    public Integer getProgressid() {
        return progressid;
    }

    public void setProgressid(Integer progressid) {
        this.progressid = progressid;
    }

    public Integer getProgressuserid() {
        return progressuserid;
    }

    public void setProgressuserid(Integer progressuserid) {
        this.progressuserid = progressuserid;
    }

    public String getProgressbookid() {
        return progressbookid;
    }

    public void setProgressbookid(String progressbookid) {
        this.progressbookid = progressbookid == null ? null : progressbookid.trim();
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}