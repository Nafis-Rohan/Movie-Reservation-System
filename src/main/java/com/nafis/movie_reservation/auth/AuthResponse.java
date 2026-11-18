package com.nafis.movie_reservation.auth;

import com.nafis.movie_reservation.user.UserResponse;

public record AuthResponse(String token, String tokenType, UserResponse user) {}