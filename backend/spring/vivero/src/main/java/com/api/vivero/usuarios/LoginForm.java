package com.api.vivero.usuarios;

public class LoginForm {
    private Long dni;
    private String clave;

    public LoginForm(Long dni, String clave) {
        this.dni = dni;
        this.clave = clave;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
