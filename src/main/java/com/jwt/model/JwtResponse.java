package com.jwt.model;

public class JwtResponse {

    private String jwtToken;
    private String username;

    // private constructor
    private JwtResponse() {
    }

    // getters

    public String getJwtToken() {
        return jwtToken;
    }

    public String getUsername() {
        return username;
    }

    // builder class
    public static class Builder {
        private JwtResponse jwtResponse;

        public Builder() {
            jwtResponse = new JwtResponse();
        }

        public Builder jwtToken(String jwtToken) {
            jwtResponse.jwtToken = jwtToken;
            return this;
        }

        public Builder username(String username) {
            jwtResponse.username = username;
            return this;
        }

        public JwtResponse build() {
            return jwtResponse;
        }
    }

    // static method to obtain a new builder instance
    public static Builder builder() {
        return new Builder();
    }
}
