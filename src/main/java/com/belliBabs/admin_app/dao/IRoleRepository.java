package com.belliBabs.admin_app.dao;

import com.belliBabs.admin_app.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Integer> {
}
