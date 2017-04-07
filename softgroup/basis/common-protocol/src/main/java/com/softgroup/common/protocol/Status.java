package com.softgroup.common.protocol;

/**
 * Created by polev on 05.04.2017.
 */
public enum Status {
    OK(200),
    Bad_request (400),
    Forbidden (403),
    Not_found (404),
    not_implemented (501);

    private int id;

    Status(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}
