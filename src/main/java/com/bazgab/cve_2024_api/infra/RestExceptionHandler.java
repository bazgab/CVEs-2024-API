package com.bazgab.cve_2024_api.infra;


import com.bazgab.cve_2024_api.exceptions.CveNotFoundException;
import com.bazgab.cve_2024_api.exceptions.OsTypeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CveNotFoundException.class)
    private ResponseEntity<String> cveNotFoundHandler(CveNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CVE Id not found.");
    }

    @ExceptionHandler(OsTypeNotFoundException.class)
    private ResponseEntity<String> osTypeNotFoundException(OsTypeNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("OS Type not found.");
    }


}
