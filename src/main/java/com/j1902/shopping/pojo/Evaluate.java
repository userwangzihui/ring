package com.j1902.shopping.pojo;

import java.util.Date;

public class Evaluate {
    private Integer evalId;

    private Integer evalUserId;

    private Integer evalItemId;

    private String evalItemName;

    private Date evalCreateTime;

    private String evalInfo;

    public Integer getEvalId() {
        return evalId;
    }

    public void setEvalId(Integer evalId) {
        this.evalId = evalId;
    }

    public Integer getEvalUserId() {
        return evalUserId;
    }

    public void setEvalUserId(Integer evalUserId) {
        this.evalUserId = evalUserId;
    }

    public Integer getEvalItemId() {
        return evalItemId;
    }

    public void setEvalItemId(Integer evalItemId) {
        this.evalItemId = evalItemId;
    }

    public String getEvalItemName() {
        return evalItemName;
    }

    public void setEvalItemName(String evalItemName) {
        this.evalItemName = evalItemName == null ? null : evalItemName.trim();
    }

    public Date getEvalCreateTime() {
        return evalCreateTime;
    }

    public void setEvalCreateTime(Date evalCreateTime) {
        this.evalCreateTime = evalCreateTime;
    }

    public String getEvalInfo() {
        return evalInfo;
    }

    public void setEvalInfo(String evalInfo) {
        this.evalInfo = evalInfo == null ? null : evalInfo.trim();
    }
}