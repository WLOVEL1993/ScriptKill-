package com.hualife.scriptkill.model;

import java.util.Date;

public class Task {
    private Integer taskId;

    private Integer scriptId;

    private String taskState;

    private String taskPass;

    private Date createTime;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getScriptId() {
        return scriptId;
    }

    public void setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public String getTaskPass() {
        return taskPass;
    }

    public void setTaskPass(String taskPass) {
        this.taskPass = taskPass;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}