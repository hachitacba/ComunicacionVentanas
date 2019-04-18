/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import presentacion.VentanaPrincipal;

/**
 *
 * @author aludba
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorPacientes gestor=new GestorPacientes();
        VentanaPrincipal vp=new VentanaPrincipal(gestor);
        vp.setVisible(true);
    }
    
}
