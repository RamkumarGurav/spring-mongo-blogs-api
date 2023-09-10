package com.ram.myblogsmongo.dto;

import com.ram.myblogsmongo.collection.Gender;
import lombok.Data;

import java.util.List;

@Data
public class UserWithRoleNameDto {

    private String id;
    private String name;
    private String email;
    private Gender gender;
    private String avatar;
    private String mobile;
    private String job;
    private String company;
    private String roleName;

}
