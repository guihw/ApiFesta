package com.cesu.apiFesta.dto;

import com.cesu.apiFesta.model.UserRole;

public record AuthenticationDTO(String login, String password, UserRole role) {
}
