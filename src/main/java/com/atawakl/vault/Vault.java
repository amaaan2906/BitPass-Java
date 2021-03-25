/*
 * AUTHOR: Aman Tawakley
 * DATE: March 24, 2021
 * DESC:
 */

package com.atawakl.vault;

import java.util.HashMap;

public class Vault {
    private HashMap<Integer, LoginItem> VAULT;

    public Vault() {
        this.VAULT = new HashMap<>();
    }

    public int getSize() {
        return VAULT.size();
    }

    public int insert(LoginItem value) {
        try {
            VAULT.put(value.getTitle().toUpperCase().hashCode(), value);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int remove(String key) {
        key = key.toUpperCase();
        try {
            VAULT.remove(key.hashCode());
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public LoginItem get(String key) {
        key = key.toUpperCase();
        try {
            return VAULT.get(key.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void print() {
        for (int i : this.VAULT.keySet()) {
            this.VAULT.get(i).print();
        }
    }
}
