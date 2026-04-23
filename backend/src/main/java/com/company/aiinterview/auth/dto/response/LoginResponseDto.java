package com.company.aiinterview.auth.dto.response; import lombok.Data; @Data public class LoginResponseDto { private String accessToken; private String tokenType; private UserResponseDto user; }
