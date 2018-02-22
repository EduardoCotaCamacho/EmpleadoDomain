/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.empleados.domain;

import com.grucas.web.empleados.DAO.UsuarioDAO;
import com.grucas.web.empleados.model.Usuario;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class UsuarioService {
    
    private Usuario object;
    private List<Usuario> objects;
    private UsuarioDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
 
    public UsuarioService() {
        dao = new UsuarioDAO("local");
    }

    public Usuario getObject() {
        return object;
    }

    public void setObject(Usuario object) {
        this.object = object;
    }

    public List<Usuario> getObjects() {
        return objects;
    }

    public void setObjects(List<Usuario> objects) {
        this.objects = objects;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public Integer getTota_result() {
        return total_result;
    }

    public void setTota_result(Integer tota_result) {
        this.total_result = tota_result;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }
    
    public void UsuarioInsert(Usuario usuario){
        object = usuario;
        dao.UsuarioInsert(object);
        
        setOk(dao.getOk());
        
        if(getOk()){
            notification = "Alta exitosa del Usuario " + usuario.getNombre();
        }else{
            notification = "Error al dar de alta el Usuario " + usuario.getNombre();
        }
    }
    
    public void UsuarioUpdate(Usuario usuario){
        object = usuario;
        dao.UsuarioUpdate(object);
        
        setOk(dao.getOk());
        
        if(getOk()){
            notification = "Modificacion exitosa del Usuario " + usuario.getNombre();
        }else{
            notification = "Ha ocurrido un error al modificar el Usuario " + usuario.getNombre();
        }
    }
    
    public void UsuarioDelete(Usuario usuario){
        object = usuario;
        dao.UsuarioDelete(object.getId());
        
        setOk(dao.getOk());
        
        if(getOk()){
            notification = "El Usuario " + usuario.getNombre()+ " fue eliminado correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar el Usuario " + usuario.getNombre();
        }
    }
    
    public void getUsuario(String where, String group, String order){
        
        dao.getUsuario(where, group, order);
        
        setOk(dao.getOk());
        
        if(getOk()){
            
            objects = dao.getObjects();
            total_result = objects.size();
            
            if(!objects.isEmpty()){
                
                if(objects.size()==1){
                    object = objects.get(0);
                }
                
                notification = "Usuarios leidos correctamente.";
            } else {
                notification = "No se encontraron Usuarios dados de alta.";
            }
            
        }else{
            notification = "Ha ocurrido un error al obtener los Usuarios de la base de datos.";
        }
        
    }
    
    public Integer getMaxID(){
        dao.getUsuarioID();
        return dao.getId();
    }

    
/**
 * Este metodo realiza el login de la aplicacion
 * @param usuario Este objeto debe coincidir en la base de datos
 * @param password Este objeto debe coincidir en la base de datos
 * @return  un boleano indicando que el login es OK
 */
    public boolean login(String usuario, String password){
        dao.getUsuario(" username = '" + usuario + "' and password = '" + password + "'", "", "");
        if (dao.getOk()) {
            
            if (dao.getObjects() != null) {

                if (dao.getObjects().size() != 0) {
                    object = dao.getObjects().get(0);
                    notification = "Bienvenido al sistema " + object.getNombre();
                    return true;
                } else {
                    object = null;
                    notification = "Nombre de Usuario o Contraseña erroneas.";
                    return false;
                }

            } else {
                object = null;
                notification = "Nombre de Usuario o Contraseña erroneas.";
                return false;
            }
            
        } else {
            notification = "Nombre de Usuario o Contraseña erroneas.";
            return false;
        }
    }
    
}