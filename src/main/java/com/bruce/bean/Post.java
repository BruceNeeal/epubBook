package com.bruce.bean;

public class Post {
    private Integer postid;

    private String posttitle;

    private String postbody;

    private Integer postuserid;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle == null ? null : posttitle.trim();
    }

    public String getPostbody() {
        return postbody;
    }

    public void setPostbody(String postbody) {
        this.postbody = postbody == null ? null : postbody.trim();
    }

    public Integer getPostuserid() {
        return postuserid;
    }

    public void setPostuserid(Integer postuserid) {
        this.postuserid = postuserid;
    }
}