package com.bazgab.cve_2024_api.services;


import com.bazgab.cve_2024_api.repositories.CveRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class CveService {

    @Autowired
    private CveRepository cveRepository;



}
