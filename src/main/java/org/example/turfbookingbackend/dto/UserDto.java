package org.example.turfbookingbackend.dto;

import org.example.turfbookingbackend.model.User;
import org.springframework.beans.BeanUtils;

public class UserDto {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String sex;

    private String emailId;

    private String contact;

    private String street;

    private String city;

    private String pincode;

    private String role;

    private int groundId;

    public static UserLoginResponse toUserLoginResponse(User user) {
        UserLoginResponse userLoginResponse=new UserLoginResponse();
        BeanUtils.copyProperties(user, userLoginResponse, "password");
        return userLoginResponse;
    }
}
