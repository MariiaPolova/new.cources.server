package com.softgroup.common.protocol;

/**
 * Created by polev on 05.04.2017.
 */
public enum HTTPStatusCode {
    OK(200, "OK"),
    BAD_REQUEST (400, "BAD REQUEST"),
    FORBIDDEN (403, "FORBIDDEN"),
    NOT_FOUND (404, "NOT FOUND"),
    NOT_IMPLEMENTED (501, "NOT IMPLEMENTED"),
    NOT_ACCEPTABLE (406, "Not acceptable"),
    UNPROCESSABLE_ACCESS (422, "Unprocessable Entity"),
    TOO_MANY_REQUESTS (429, "Too Many Requests"),
    INTERNAL_ERROR(500, "INTERNAL SERVER ERROR");

    private int id;
    private String str;

    HTTPStatusCode(int id, String str) {
        this.id = id;
        this.str = str;
    }

    public int getId() {
        return id;
    }

    public String getStr() {
        return str;
    }
}
