package org.iesvdm.tienda;

public class Usuario {

    private String login_id; //UNIQUE
    private String contraseña;

    private EstadoUsuario estado;

    public Usuario(String login_id, String contraseña, EstadoUsuario estado ) {
        this.login_id = login_id;
        this.contraseña= contraseña;
        this.estado=estado;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }

    public String getContraseña() {
        return contraseña;
    }


    public String getLogin_id() {
        return login_id;
    }


}
