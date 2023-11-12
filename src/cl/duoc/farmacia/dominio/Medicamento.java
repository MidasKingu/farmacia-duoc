/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.farmacia.dominio;

/**
 *
 * @author saave
 */
public class Medicamento {
    private int id;
    private String nombre;
    private String laboratorio;
    private String tipo;
    private int precio;
    
    public Medicamento() {
        
    }
    
    public Medicamento(String nombre, String laboratorio, String tipo, int precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
