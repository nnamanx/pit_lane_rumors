package com.namanx.pit_lane_rumors.repository;

import com.namanx.pit_lane_rumors.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
