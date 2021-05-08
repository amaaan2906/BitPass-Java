package com.atawakl;

import com.atawakl.utils.VaultBuilder;
import com.atawakl.vault.VaultItem;
import com.atawakl.vault.Vault;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        VaultItem fb = new VaultItem("Facebook", "aman.tawakley", "secret", "fb.com");
        one.insert(fb);
        fb = new VaultItem("Facebook2", "aman.tawakley", "secrdet", "fb.com");
        one.insert(fb);
        one.print();
        System.out.println(one.remove("facebook"));
        one.print();

        Vault two = new Vault();
        VaultBuilder vb = VaultBuilder.getInstance();
        vb.buildVault(two, new File("example.txt"));
        two.print();

        Vault three = new Vault();
        VaultBuilder vb2 = VaultBuilder.getInstance();
        vb2.buildVault(three, new File("example.txt"));
    }
}
