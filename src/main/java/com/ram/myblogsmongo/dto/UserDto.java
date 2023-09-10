package com.ram.myblogsmongo.dto;

import com.ram.myblogsmongo.collection.Gender;
import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String name;
    private String email;
    private Gender gender;
    private String avatar;
    private String mobile;
    private String job;
    private String company;
}
