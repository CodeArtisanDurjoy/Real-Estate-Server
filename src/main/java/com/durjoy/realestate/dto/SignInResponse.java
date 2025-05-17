package com.durjoy.realestate.dto;

import com.durjoy.realestate.model.User;
import jakarta.servlet.http.Cookie;

public record SignInResponse(boolean success, String message, User user, Cookie cookie) {

}
