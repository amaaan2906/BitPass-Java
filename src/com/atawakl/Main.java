package com.atawakl;

public class Main {

    public static void main(String[] args) {
        Vault one = new Vault();
        LoginItem fb = new LoginItem("Facebook", "fb.com", "aman.tawakley", "secret");
        one.insert(fb);
        fb = new LoginItem("Facebook2", "fb.com", "aman.tawakley", "secrdet");
        one.insert(fb);
        one.print();
        System.out.println(one.remove("facebook"));
        one.print();
    }
}
