package com.bazgab.cve_2024_api.controllers;


import com.bazgab.cve_2024_api.models.CveModel;
import com.bazgab.cve_2024_api.repositories.CveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class MainController {

    @Autowired
    private CveRepository cveRepository;


    @GetMapping("/findCveById/{cve_id}")
    public ResponseEntity<CveModel> findCveById(@PathVariable String cve_id) {
        Optional<CveModel> cveModelOptional =  cveRepository.findById(cve_id);
        try {
            if (cveModelOptional.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(cveModelOptional.get(), HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/findCveByAffected_OS/{affected_os}")
//    public ResponseEntity<CveModel> findCveByAffected_OS(@PathVariable String affected_os) {
//        List<CveModel> cveModelList =  cveRepository.findAll();
//        try {
//            if (cveModelList.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            } else {
//                 return new ResponseEntity<>(cveModelList.addAll(cveModelList::add), HttpStatus.OK);
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }



}
