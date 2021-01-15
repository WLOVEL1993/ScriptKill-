package com.hualife.scriptkill.model;

public class Clue {
    private Integer clueId;

    private Integer scriptId;

    private String clueType;

    private Integer clueValue;

    private String clueName;

    private String clueContent;

    public Integer getClueId() {
        return clueId;
    }

    public void setClueId(Integer clueId) {
        this.clueId = clueId;
    }

    public Integer getScriptId() {
        return scriptId;
    }

    public void setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
    }

    public String getClueType() {
        return clueType;
    }

    public void setClueType(String clueType) {
        this.clueType = clueType;
    }

    public Integer getClueValue() {
        return clueValue;
    }

    public void setClueValue(Integer clueValue) {
        this.clueValue = clueValue;
    }

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName;
    }

    public String getClueContent() {
        return clueContent;
    }

    public void setClueContent(String clueContent) {
        this.clueContent = clueContent;
    }
}