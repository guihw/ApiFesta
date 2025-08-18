package com.cesu.apiFesta.dto;

import com.cesu.apiFesta.model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
