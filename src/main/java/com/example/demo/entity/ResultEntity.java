package com.example.demo.entity;

public class ResultEntity {
    private int resultCode;
    private String resultMsg;
    private String returnUrl;

    public ResultEntity() {
        this.resultCode = 0;
        this.resultMsg = "";
        this.returnUrl = "";
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "resultCode=" + resultCode +
                ", resultMsg='" + resultMsg + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                '}';
    }
}
