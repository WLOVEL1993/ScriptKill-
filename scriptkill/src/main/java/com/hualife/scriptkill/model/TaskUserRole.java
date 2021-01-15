package com.hualife.scriptkill.model;

public class TaskUserRole {
    private Integer taskId;

    private Integer userId;

    private Integer roleId;

    private Integer scriptId;

    private String roleMoney;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getScriptId() {
        return scriptId;
    }

    public void setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
    }

    public String getRoleMoney() {
        return roleMoney;
    }

    public void setRoleMoney(String roleMoney) {
        this.roleMoney = roleMoney;
    }
}