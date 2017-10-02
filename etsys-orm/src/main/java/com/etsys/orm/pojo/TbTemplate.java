package com.etsys.orm.pojo;

import java.util.Date;

public class TbTemplate {
    private String temId;

    private String courseId;

    private String teacherId;

    private Date created;

    public String getTemId() {
        return temId;
    }

    public void setTemId(String temId) {
        this.temId = temId == null ? null : temId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}