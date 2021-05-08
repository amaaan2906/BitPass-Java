/*
 * AUTHOR: Aman Tawakley
 * DATE: March 24, 2021
 * DESC: Builds and populated a vault object from a given file with login item details
 */

package com.atawakl.utils;

import com.atawakl.errors.NoFileFound;
import com.atawakl.vault.Vault;
import com.atawakl.vault.VaultItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VaultBuilder {
    private static VaultBuilder instance = null;

    public static VaultBuilder getInstance() {
        if (instance == null) {
            System.out.println("--> Vault builder initialized!");
            instance = new VaultBuilder();
        }
        return instance;
    }

    public void buildVault(Vault v, File f) {
        if (f.canRead()) {
            try {
                Scanner fs = new Scanner(f);
                while(fs.hasNextLine()) {
                    StringTokenizer tk = new StringTokenizer(fs.nextLine(), ",");
                    // title, username, password, url
                    v.insert(new VaultItem(tk.nextToken(), tk.nextToken(), tk.nextToken(), tk.nextToken()));
                }
            } catch(FileNotFoundException e) {
                System.out.println("--> Unable to read file!");
                System.exit(-1);
            }

        } else {
            throw new NoFileFound();
        }   
    }   

    private VaultBuilder() {}
}