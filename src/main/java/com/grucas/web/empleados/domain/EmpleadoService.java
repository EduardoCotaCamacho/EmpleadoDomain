/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.empleados.domain;


import com.grucas.web.empleados.DAO.EmpleadoDAO;
import com.grucas.web.empleados.model.Empleado;
import java.util.List;

/**
 *
 * @author GrucasDev
 */
public class EmpleadoService {
    
    private Empleado object;
    private List<Empleado> objects;
    private EmpleadoDAO dao;
    private String notification;
    private Boolean ok;
    private Integer total_result;
 
    public EmpleadoService() {
        dao = new EmpleadoDAO("local");
    }

    public Empleado getObject() {
        return object;
    }

    public void setObject(Empleado object) {
        this.object = object;
    }

    public List<Empleado> getObjects() {
        return objects;
    }

    public void setObjects(List<Empleado> objects) {
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
    
    public void EmpleadoInsert(Empleado empleado){
        object = empleado;
        dao.EmpleadoInsert(object);
        
        setOk(dao.getOk());
        
        if(getOk()){
            notification = "Alta exitosa del Empleado " + empleado.getNombre();
        }else{
            notification = "Error al dar de alta el Empleador " + empleado.getNombre();
        }
    }
    
    public void EmpleadoUpdate(Empleado empleado){
        object = empleado;
        dao.EmpleadoUpdate(object);
        
        setOk(dao.getOk());
        
        if(getOk()){
            notification = "Modificacion exitosa del Empleado " + empleado.getNombre();
        }else{
            notification = "Ha ocurrido un error al modificar el Empleado " + empleado.getNombre();
        }
    }
    
    public void EmpleadoDelete(Empleado empleado){
        object = empleado;
        dao.EmpleadoDelete(object.getId());
        
        setOk(dao.getOk());
        
        if(getOk()){
            notification = "El Empleado " + empleado.getNombre()+ " fue eliminado correctamente.";
        }else{
            notification = "Ha ocurrido un error al eliminar el Empleado " + empleado.getNombre();
        }
    }
    
    public void getEmpleado(String where, String group, String order){
        
        dao.getEmpleado(where, group, order);
        
        setOk(dao.getOk());
        
        if(getOk()){
            
            objects = dao.getObjects();
            total_result = objects.size();
            
            if(!objects.isEmpty()){
                
                if(objects.size()==1){
                    object = objects.get(0);
                }
                
                notification = "Empleados leidos correctamente.";
            } else {
                notification = "No se encontraron Empleados dados de alta.";
            }
            
        }else{
            notification = "Ha ocurrido un error al obtener los Empleados de la base de datos.";
        }
        
    }
    
    public Integer getMaxID(){
        dao.getEmpleadoID();
        return dao.getId();
    }
    
}