package com.bazgab.cve_2024_api.controllers;


import com.bazgab.cve_2024_api.models.CveModel;
import com.bazgab.cve_2024_api.repositories.CveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import java.util.Optional;
import java.util.List;


@RestController
public class MainController {

    @Autowired
    private CveRepository cveRepository;


    @GetMapping("/findCveById/{cve_id}")
    public ResponseEntity<CveModel> findCveById(@PathVariable String cve_id) {
        Optional<CveModel> cveModelOptional =  cveRepository.findById(cve_id);
            return new ResponseEntity<>(cveModelOptional.get(), HttpStatus.OK);

    }


    @GetMapping("/findCveByAffectedOs/{os_type}")
    public ResponseEntity<List<CveModel>> findCveByAffectedOs(@PathVariable String os_type) {
        List<CveModel> results = switch (os_type) {
            case "Windows" -> cveRepository.findCveByAffected_OS("windows");
            case "Ubuntu" -> cveRepository.findCveByAffected_OS("ubuntu");
            case "Fedora" -> cveRepository.findCveByAffected_OS("fedora");
            case "RedHat" -> cveRepository.findCveByAffected_OS("redhat");
            case "Qualcomm" -> cveRepository.findCveByAffected_OS("qualcomm");
            case "MacOs" -> cveRepository.findCveByAffected_OS("macos");
            case "IphoneOS" -> cveRepository.findCveByAffected_OS("iphone");
            case "Android" -> cveRepository.findCveByAffected_OS("android");
            default -> throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        };

        return ResponseEntity.ok(results);
    }



}
