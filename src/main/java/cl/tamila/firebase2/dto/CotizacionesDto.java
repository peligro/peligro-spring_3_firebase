package cl.tamila.firebase2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class CotizacionesDto {
    @NotEmpty(message = "El campo nombre es obligatorio")
    private String nombre;
    @NotEmpty(message = "El campo nombre es obligatorio")
    private String telefono;
    @NotEmpty(message = "El campo nombre es obligatorio")
    @Email(message = "El correo ingresado no es válido")
    private String correo;
    @NotEmpty(message = "El campo nombre es obligatorio")
    private String ciudad;
    @NotEmpty(message = "El campo nombre es obligatorio")
    private String direccion;
    @NotEmpty(message = "El campo nombre es obligatorio")
    private String detalle;

    public CotizacionesDto( ) {

    }

    public CotizacionesDto(String nombre, String detalle, String direccion, String ciudad, String correo, String telefono) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
