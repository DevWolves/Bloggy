package com.moonface.bloggy;

import android.graphics.drawable.Drawable;

public class Category {

    private String title;
    private String backImageUrl;
    private String iconUrl;

    public Category(String title, String backImageUrl, String iconUrl){
        this.title = title;
        this.backImageUrl = backImageUrl;
        this.iconUrl = iconUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBackImageUrl(String backImageUrl) {
        this.backImageUrl = backImageUrl;
    }

    public String getBackImageUrl() {
        return backImageUrl;
    }

    public void setIcon(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getIcon() {
        return iconUrl;
    }
}
