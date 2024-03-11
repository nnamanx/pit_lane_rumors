package com.namanx.pit_lane_rumors.repository;

import com.namanx.pit_lane_rumors.model.entity.Rumor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RumorRepository extends JpaRepository<Rumor, Long> {
}
