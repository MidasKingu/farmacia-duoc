/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.farmacia.control;

import cl.duoc.farmacia.dominio.Medicamento;
import cl.duoc.farmcia.dAO.MedicamentoDao;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author saave
 */
public class MedicamentoControl {
    MedicamentoDao dao = new MedicamentoDao();
    
    public MedicamentoControl(){
        
    }
    
    public boolean crearMedicamento(String nombre, String laboratorio, String tipo, int precio) {
        boolean res = false;
        System.out.println("control crear");
        System.out.println("Nombre: "+ nombre);
        System.out.println("lab: "+ laboratorio);
        System.out.println("tipo: "+tipo);
        System.out.println("precio: "+ precio);
        
        if((!nombre.trim().contains("") && nombre.length() > 3) && (laboratorio.trim().equals("") && laboratorio.length() > 3) && (tipo.trim().equals("") && tipo.length() > 0) && precio > 0) {
            
            try {
                dao.crearMedicamento(nombre, laboratorio, tipo, precio);
                res = true;
            }
            catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        return res;
    }
    public ArrayList<Medicamento> listaMedicamentos() {
        ArrayList<Medicamento> lista = new ArrayList<Medicamento>();
        try {
            lista = dao.listarMedicamentos();
        }
        catch(Exception e) {
            System.out.println("Error al buscar medicamentos");
        }
        return lista;
    }

    public Medicamento buscarPorNombre(String nombre) {
        Optional<Medicamento> opt = dao.obtenerMedicamento(nombre);
            
        if(opt.isPresent()) {
            return opt.get();
        }
        else {
            return null;
        }
        
    }
    
    public boolean actualizar(String nombre, String laboratorio, String tipo, int precio, int id) {
        boolean res = false;
        if(!nombre.isBlank() && !laboratorio.isBlank() && precio > 0 && !tipo.isBlank()) {
            Medicamento m = new Medicamento();
            m.setId(id);
            m.setLaboratorio(laboratorio);
            m.setNombre(nombre);
            m.setPrecio(precio);
            m.setTipo(tipo);
            res = dao.actualizarMedicamento(m);
        }       
        return res;
    }
}
