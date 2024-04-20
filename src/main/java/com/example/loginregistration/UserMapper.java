package com.example.loginregistration;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract UserEntity mapRequestDtoToEntity(UserRequestDto userRequestDto);

    public abstract List<UserDto> mapEntityListToDtoList(List<UserEntity> userEntityList);

}
