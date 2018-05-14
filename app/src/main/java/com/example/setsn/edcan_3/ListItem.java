package com.example.setsn.edcan_3;

/**
 * Created by setsn on 2018-05-14.
 */

public class ListItem
{
    String title;
    String content;

    public ListItem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
