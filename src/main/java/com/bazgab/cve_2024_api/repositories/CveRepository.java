package com.bazgab.cve_2024_api.repositories;

import com.bazgab.cve_2024_api.models.CveModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CveRepository extends JpaRepository<CveModel, String> {

}
