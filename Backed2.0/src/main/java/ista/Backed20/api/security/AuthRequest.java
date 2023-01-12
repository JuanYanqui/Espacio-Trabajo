package ista.Backed20.api.security;

import javax.validation.constraints.NotNull;

public class AuthRequest {
    @NotNull
    private String username;

    @NotNull
    private String contrasenia;

    public AuthRequest(String username, String contrasenia) {
        this.username = username;
        this.contrasenia = contrasenia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // getters and setters are not shown...
}
