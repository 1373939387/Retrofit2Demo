package com.haoruigang.retrofit.retrofit2;

/**
 * Android 提交的数据
 * Created by 13739 on 2018/1/10.
 */

public class Info {

    private int scope;
    private String format;
    private int appid;
    private String bk_key;
    private int bk_length;

    public Info(int scope, String format, int appid, String bk_key, int bk_length) {
        this.scope = scope;
        this.format = format;
        this.appid = appid;
        this.bk_key = bk_key;
        this.bk_length = bk_length;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getAppid() {
        return appid;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public String getBk_key() {
        return bk_key;
    }

    public void setBk_key(String bk_key) {
        this.bk_key = bk_key;
    }

    public int getBk_length() {
        return bk_length;
    }

    public void setBk_length(int bk_length) {
        this.bk_length = bk_length;
    }
}
