package com.atawakl;

import java.util.HashMap;
import java.util.Locale;

public class Vault {
    private HashMap<Integer, LoginItem> VAULT;
    private int SIZE;

    public Vault() {
        this.VAULT = new HashMap<>();
        this.SIZE = 0;
    }

    public int getSize() {
        return this.SIZE;
    }

    public int insert(LoginItem value) {
        try {
            VAULT.put(value.getTitle().toUpperCase().hashCode(), value);
            this.SIZE++;
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
            this.SIZE = VAULT.size();
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
