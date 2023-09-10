package com.ram.myblogsmongo.dto;

import com.ram.myblogsmongo.collection.Gender;
import com.ram.myblogsmongo.collection.User;
import lombok.Data;

@Data
public class UserRequestDto {

    private String name;
    private String email;
    private Gender gender;
    private String avatar;
    private String mobile;
    private String password;
    private String confirmPassword;
    private String job;
    private String company;
}
