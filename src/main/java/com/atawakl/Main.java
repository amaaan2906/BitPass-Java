package com.atawakl;

import com.atawakl.vault.LoginItem;
import com.atawakl.vault.Vault;

public class Main {
    /**
     * Init
     * 1. Get user secret key
     * 2. validate secret key
     * 3. <Login success>
     *
     * Login success
     * 1. decrypt file
     * 2. create vault object
     *
     * New login item
     * 1. create loginitem object
     * 2. add to vault object
     * 3. update in decoded File
     * 4. encrypt Filex
     *
     * Exit
     * 1. Clear vault object
     */

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
