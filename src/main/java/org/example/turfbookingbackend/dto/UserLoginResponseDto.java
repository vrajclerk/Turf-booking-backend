package org.example.turfbookingbackend.dto;

import lombok.Data;

@Data
public class UserLoginResponseDto extends CommonApiResponse {
    private UserLoginResponse user;
}
