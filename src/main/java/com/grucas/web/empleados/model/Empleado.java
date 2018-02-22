/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.empleados.model;

import java.util.Date;

/**
 *
 * @author EduardoC
 */
public class Empleado {
   
    Integer id;
    Date fecha_elaboracion;
    Date fecha_modificacion;
    Integer empresa_id;
    String empresa; // Grupo Castañeda, Mallorca etc
    Integer unidad_id;
    String unidad; // Dac tampico, Dac Veracruz etc
    Integer usuario_id;
    String usuario; //que dio de alta
    Boolean activo; // boleano
    Date fecha_ingreso;
    Date fecha_baja;
    String razon_baja;
    String nss;
    String nombre;
    String apellido_paterno;
    String apellido_materno;
    String rfc;
    String curp;
    String correo_grucas; // Castañeda
    String correo_personal; //personal
    String numero_de_telefono;
    String celular;
    String direccion;
    String colonia;
    String ciudad;
    String estado;
    String pais;
    Integer cp;
    Date fecha_nacimiento;
    String puesto;
    String departamento;
    Integer dias_vacaciones_restantes;
    Integer dias_vacaciones_usados;
    String accesos_sistemas; // String que se colocara el nombre de usuario y el sistema al que tiene acceso

    public Empleado() {
    }

    public Empleado(Integer id, Date fecha_elaboracion, Date fecha_modificacion, Integer empresa_id, String empresa, Integer unidad_id, String unidad, Integer usuario_id, String usuario, Boolean activo, Date fecha_ingreso, Date fecha_baja, String razon_baja, String nss, String nombre, String apellido_paterno, String apellido_materno, String rfc, String curp, String correo_grucas, String correo_personal, String numero_de_telefono, String celular, String direccion, String colonia, String ciudad, String estado, String pais, Integer cp, Date fecha_nacimiento, String puesto, String departamento, Integer dias_vacaciones_restantes, Integer dias_vacaciones_usados, String accesos_sistemas) {
        this.id = id;
        this.fecha_elaboracion = fecha_elaboracion;
        this.fecha_modificacion = fecha_modificacion;
        this.empresa_id = empresa_id;
        this.empresa = empresa;
        this.unidad_id = unidad_id;
        this.unidad = unidad;
        this.usuario_id = usuario_id;
        this.usuario = usuario;
        this.activo = activo;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_baja = fecha_baja;
        this.razon_baja = razon_baja;
        this.nss = nss;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.rfc = rfc;
        this.curp = curp;
        this.correo_grucas = correo_grucas;
        this.correo_personal = correo_personal;
        this.numero_de_telefono = numero_de_telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.cp = cp;
        this.fecha_nacimiento = fecha_nacimiento;
        this.puesto = puesto;
        this.departamento = departamento;
        this.dias_vacaciones_restantes = dias_vacaciones_restantes;
        this.dias_vacaciones_usados = dias_vacaciones_usados;
        this.accesos_sistemas = accesos_sistemas;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getUnidad_id() {
        return unidad_id;
    }

    public void setUnidad_id(Integer unidad_id) {
        this.unidad_id = unidad_id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public String getRazon_baja() {
        return razon_baja;
    }

    public void setRazon_baja(String razon_baja) {
        this.razon_baja = razon_baja;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCorreo_grucas() {
        return correo_grucas;
    }

    public void setCorreo_grucas(String correo_grucas) {
        this.correo_grucas = correo_grucas;
    }

    public String getCorreo_personal() {
        return correo_personal;
    }

    public void setCorreo_personal(String correo_personal) {
        this.correo_personal = correo_personal;
    }

    public String getNumero_de_telefono() {
        return numero_de_telefono;
    }

    public void setNumero_de_telefono(String numero_de_telefono) {
        this.numero_de_telefono = numero_de_telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getDias_vacaciones_restantes() {
        return dias_vacaciones_restantes;
    }

    public void setDias_vacaciones_restantes(Integer dias_vacaciones_restantes) {
        this.dias_vacaciones_restantes = dias_vacaciones_restantes;
    }

    public Integer getDias_vacaciones_usados() {
        return dias_vacaciones_usados;
    }

    public void setDias_vacaciones_usados(Integer dias_vacaciones_usados) {
        this.dias_vacaciones_usados = dias_vacaciones_usados;
    }

    public String getAccesos_sistemas() {
        return accesos_sistemas;
    }

    public void setAccesos_sistemas(String accesos_sistemas) {
        this.accesos_sistemas = accesos_sistemas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", fecha_elaboracion=" + fecha_elaboracion + ", fecha_modificacion=" + fecha_modificacion + ", empresa_id=" + empresa_id + ", empresa=" + empresa + ", unidad_id=" + unidad_id + ", unidad=" + unidad + ", usuario_id=" + usuario_id + ", usuario=" + usuario + ", activo=" + activo + ", fecha_ingreso=" + fecha_ingreso + ", fecha_baja=" + fecha_baja + ", razon_baja=" + razon_baja + ", nss=" + nss + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", rfc=" + rfc + ", curp=" + curp + ", correo_grucas=" + correo_grucas + ", correo_personal=" + correo_personal + ", numero_de_telefono=" + numero_de_telefono + ", celular=" + celular + ", direccion=" + direccion + ", colonia=" + colonia + ", ciudad=" + ciudad + ", estado=" + estado + ", pais=" + pais + ", cp=" + cp + ", fecha_nacimiento=" + fecha_nacimiento + ", puesto=" + puesto + ", departamento=" + departamento + ", dias_vacaciones_restantes=" + dias_vacaciones_restantes + ", dias_vacaciones_usados=" + dias_vacaciones_usados + ", accesos_sistemas=" + accesos_sistemas + '}';
    }
  
    
}
