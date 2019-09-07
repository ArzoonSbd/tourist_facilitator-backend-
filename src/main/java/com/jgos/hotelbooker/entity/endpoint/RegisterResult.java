package com.jgos.hotelbooker.entity.endpoint;



public enum RegisterResult {
    USEREXIST(0), OK(1);

    private final double id;

    RegisterResult(int id) {
        this.id = id;
    }
}
