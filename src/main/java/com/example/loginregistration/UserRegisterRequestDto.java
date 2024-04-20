package com.example.loginregistration;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegisterRequestDto {
    String firstname;
    String lastname;
    String phoneNumber;
    String email;
    String password;

}
