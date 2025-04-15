create table if not exists all_cves_2024 (
    cve_id long not null,
    description varchar not null,
    cvss_score varchar not null,
    attack_vector varchar not null,
    affected_os varchar not null,
    primary key (cve_id)
);