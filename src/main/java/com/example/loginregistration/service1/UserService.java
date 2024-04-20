package com.example.loginregistration.service1;

import com.example.loginregistration.UserDto;
import com.example.loginregistration.UserEntity;
import com.example.loginregistration.UserMapper;
import com.example.loginregistration.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> getUsers(){
        List<UserEntity> list=userRepository.findAll();
        return UserMapper.INSTANCE.mapEntityListToDtoList(list);
    }

}
