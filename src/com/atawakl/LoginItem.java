package com.atawakl;

public class LoginItem {
    private String TITLE;
    private String URL;
    private String USERNAME;
    private String PWD;

    public LoginItem(String t, String u, String n, String p) {
        this.TITLE = t;
        this.PWD = p;
        this.URL = u;
        this.USERNAME = n;
    }
    public String getTitle() {
        return this.TITLE;
    }

    public void print() {
        System.out.println("-> " + this.TITLE + " (" + this.URL +")\n\t" +
                this.USERNAME + "\n\t" + this.PWD);
    }
}
