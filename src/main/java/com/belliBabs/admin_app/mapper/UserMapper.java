package com.belliBabs.admin_app.mapper;


import com.belliBabs.admin_app.dto.User;
import com.belliBabs.admin_app.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User toUser(UserEntity user);
    UserEntity fromUser(User user);
}
