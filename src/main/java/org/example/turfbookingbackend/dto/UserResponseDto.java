package org.example.turfbookingbackend.dto;

import org.example.turfbookingbackend.model.User;

import java.util.List;

public class UserResponseDto extends CommonApiResponse {
    private List<User> users;
}
