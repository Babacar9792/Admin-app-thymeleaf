package com.belliBabs.admin_app.mapper;

import com.belliBabs.admin_app.dto.Role;
import com.belliBabs.admin_app.entity.RoleEntity;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {
    Role toRole(RoleEntity role);
    RoleEntity fromRole(Role role);
}
