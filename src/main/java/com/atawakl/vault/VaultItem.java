/*
 * AUTHOR: Aman Tawakley
 * DATE: March 24, 2021
 * DESC:
 */

package com.atawakl.vault;

public class VaultItem {
    private String TITLE;
    private String URL;
    private String USERNAME;
    private String PWD;

    public VaultItem(String t, String n, String p, String u) {
        this.TITLE = t;
        this.USERNAME = n;
        this.PWD = p;
        this.URL = u;
    }
    public String getTitle() {
        return this.TITLE;
    }

    public void print() {
        System.out.println("-> " + this.TITLE + " (" + this.URL +")\n\t" +
                this.USERNAME + "\n\t" + this.PWD);
    }
}