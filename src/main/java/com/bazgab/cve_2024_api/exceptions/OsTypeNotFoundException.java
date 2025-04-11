package com.bazgab.cve_2024_api.exceptions;


public class OsTypeNotFoundException extends RuntimeException {

    public OsTypeNotFoundException() {
        super("CVE Id not found.");
    }

    public OsTypeNotFoundException(String message) {
        super(message);
    }

}
