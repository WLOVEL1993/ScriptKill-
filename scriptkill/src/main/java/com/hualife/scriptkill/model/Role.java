package com.hualife.scriptkill.model;

public class Role {
    private Integer roleId;

    private Integer scriptId;

    private String roleName;

    private String roleBrief;

    private String roleScript;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleBrief() {
        return roleBrief;
    }

    public void setRoleBrief(String roleBrief) {
        this.roleBrief = roleBrief;
    }

    public String getRoleScript() {
        return roleScript;
    }

    public void setRoleScript(String roleScript) {
        this.roleScript = roleScript;
    }
}