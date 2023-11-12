/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.farmcia.dAO;

import cl.duoc.farmacia.conexion.Conexion;
import cl.duoc.farmacia.dominio.Medicamento;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author saave
 */
public class MedicamentoDao {
    Connection con = null;
    PreparedStatement ps = null;
    
    public MedicamentoDao () {
        con = Conexion.getInstance().getConnection();
    }
    public boolean crearMedicamento(String nombre,String laboratorio, String tipo, int precio) {
        boolean res = false;
        
        System.out.println("dao crear");
        try {
            ps = con.prepareStatement("INSERT INTO MEDICAMENTO(nombre, laboratorio, tipo, precio) VALUES(?,?,?,?);");
            ps.setString(1, nombre);
            ps.setString(2, laboratorio);
            ps.setString(3, tipo);
            ps.setInt(4, precio);
            ps.execute();
            res = true;
            con.close();
            ps.close();
        }
        catch(SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
        return res;
    }
    public ArrayList<Medicamento> listarMedicamentos() {
        ArrayList<Medicamento> lista = new ArrayList<Medicamento>();
        try {
            ps = con.prepareStatement("SELECT * FROM MEDICAMENTO;");

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Medicamento m = new Medicamento();
                m.setId(rs.getInt("id"));
                m.setNombre(rs.getString("nombre"));
                m.setLaboratorio(rs.getString("laboratorio"));
                m.setTipo(rs.getString("tipo"));
                m.setPrecio(rs.getInt("precio"));
                lista.add(m);
                
            }
        }
        catch(Exception e) {
            System.out.println("");
        }
        return lista;
    }
    
    public Optional<Medicamento> obtenerMedicamento(String nombre) {
        try {
            String sql = "SELECT * FROM MEDICAMENTO WHERE nombre = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, nombre);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Medicamento medicamento = new Medicamento();
                // Supongamos que Medicamento tiene los campos id, nombre y dosis
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNombre(resultSet.getString("nombre"));
                medicamento.setLaboratorio(resultSet.getString("laboratorio"));
                medicamento.setPrecio(resultSet.getInt("precio"));
                medicamento.setTipo(resultSet.getString("tipo"));
                return Optional.of(medicamento);
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            // Manejar la excepción
            e.printStackTrace();
            return Optional.empty();
        }
    }
    public boolean actualizarMedicamento(Medicamento medicamento) {
    boolean res = false;
    try {
        String sql = "UPDATE MEDICAMENTO SET nombre = ?, laboratorio = ?, tipo = ?, precio = ? WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, medicamento.getNombre());
        statement.setString(2, medicamento.getLaboratorio());
        statement.setString(3, medicamento.getTipo());
        statement.setInt(4, medicamento.getPrecio());
        statement.setInt(5, medicamento.getId());
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("El medicamento fue actualizado exitosamente!");
            res = true;
        }
    } catch (SQLException e) {
        // Manejar la excepción
        e.printStackTrace();
    }
    return res;
}
}
