package com.infosys.cloudmonitoring.repository;

import com.infosys.cloudmonitoring.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
}