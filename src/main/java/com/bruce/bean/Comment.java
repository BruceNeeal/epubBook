package com.bruce.bean;

public class Comment {
    private Integer commentid;

    private String commentbody;

    private Integer commentuserid;

    private Integer commentpostid;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommentbody() {
        return commentbody;
    }

    public void setCommentbody(String commentbody) {
        this.commentbody = commentbody == null ? null : commentbody.trim();
    }

    public Integer getCommentuserid() {
        return commentuserid;
    }

    public void setCommentuserid(Integer commentuserid) {
        this.commentuserid = commentuserid;
    }

    public Integer getCommentpostid() {
        return commentpostid;
    }

    public void setCommentpostid(Integer commentpostid) {
        this.commentpostid = commentpostid;
    }
}