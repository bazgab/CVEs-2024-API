package com.bazgab.cve_2024_api.exceptions;

public class CveNotFoundException extends RuntimeException {

    public CveNotFoundException() {
        super("CVE Id not found.");
    }

    public CveNotFoundException(String message) {
        super(message);
    }

}
