package com.bazgab.cve_2024_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "all_cves_2024")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CveModel {

    @Id
    @Column(name = "cve_id")
    private String cve_id;

    @Column(name = "description")
    private String description;

    @Column(name = "cvss_score")
    private float cvss_score;

    @Column(name = "attack_vector")
    private String attack_vector;

    @Column(name = "affected_os")
    private String affected_os;


}
