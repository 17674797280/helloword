package com.yidu.ssmdemo007.bean;

public class Menuinfo {
    private String menuid;
    private String title;
    private int state;
    private String url;
    private String parentId;
    private String iconCls;
    public Menuinfo(){}

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Override
    public String toString() {
        return "Menuinfo{" +
                "menuid='" + menuid + '\'' +
                ", title='" + title + '\'' +
                ", state=" + state +
                ", url='" + url + '\'' +
                ", parentId='" + parentId + '\'' +
                ", iconCls='" + iconCls + '\'' +
                '}';
    }

    public Menuinfo(String menuid, String title, int state, String url, String parentId, String iconCls) {
        this.menuid = menuid;
        this.title = title;
        this.state = state;
        this.url = url;
        this.parentId = parentId;
        this.iconCls = iconCls;
    }
}
