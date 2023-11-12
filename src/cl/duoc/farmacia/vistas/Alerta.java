/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.farmacia.vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author saave
 */
public class Alerta {
    public static void mostrarDialogo(Component parent, String mensaje, String titulo, int tipoMensaje) {
        JOptionPane optionPane = new JOptionPane(mensaje, tipoMensaje);
        optionPane.setBackground(Color.white);
        JDialog dialog = optionPane.createDialog(parent,titulo);
        
        // Centrar el diálogo.
        dialog.setLocationRelativeTo(parent);
        // Mostrar el diálogo.
        dialog.setVisible(true);
    }
}
