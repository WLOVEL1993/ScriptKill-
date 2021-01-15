package com.hualife.scriptkill.model;

import java.util.Date;

public class TaskClue {
    private Integer taskId;

    private Integer roleId;

    private Integer clueId;

    private String isPublic;

    private Date tearingTime;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getClueId() {
        return clueId;
    }

    public void setClueId(Integer clueId) {
        this.clueId = clueId;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public Date getTearingTime() {
        return tearingTime;
    }

    public void setTearingTime(Date tearingTime) {
        this.tearingTime = tearingTime;
    }
}