package com.bazgab.cve_2024_api.repositories;

import com.bazgab.cve_2024_api.models.CveModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface CveRepository extends JpaRepository<CveModel, String> {

    @Query(value = "SELECT c FROM CveModel c WHERE c.affected_os LIKE CONCAT('%', :os_type, '%')")
    List<CveModel> findCveByAffected_OS(@Param("os_type") String os_type);

}
