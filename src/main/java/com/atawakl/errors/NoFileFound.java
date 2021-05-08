package com.atawakl.errors;

public class NoFileFound extends RuntimeException {
    public NoFileFound() {
        super("Unable to read file");
    }
}
