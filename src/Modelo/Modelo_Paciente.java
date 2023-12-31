/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Franklin Aguirre
 */
public class Modelo_Paciente {
    
    private String Identificacion;
    private String Nombres;
    private String Apellido;
    private String Telefono;
    private String Direccion;

    public Modelo_Paciente(String Identificacion, String Nombres,String Apellido,String Telefono,String Direccion) {
        this.Identificacion = Identificacion;
        this.Nombres = Nombres;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }
    
    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    @Override
    public String toString() {
        return "{" + "Id: " + this.getIdentificacion()+ ", Nombre: " + this.getNombres() + ", Apellidos: " + this.getApellido() + ", telefono: " + this.getTelefono() + ", direccion: " + this.getDireccion() +  "}";
    }
    
}
