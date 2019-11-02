package com.sxf.entity;

public class StudentClass {
    private Integer id;
    private Integer cid;
    private Integer sid;
    private String sname;
    private String cname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", cid=" + cid +
                ", sid=" + sid +
                ", sname='" + sname + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
