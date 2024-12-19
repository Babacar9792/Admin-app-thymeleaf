package com.belliBabs.admin_app.dao;

import com.belliBabs.admin_app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
}
