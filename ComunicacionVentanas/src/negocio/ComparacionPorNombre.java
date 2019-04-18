/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Comparator;
/**
 *
 * @author Aldo
 */
public class ComparacionPorNombre implements Comparator<Paciente>{

    @Override
    public int compare(Paciente p1, Paciente p2) {

        return p1.getNombre().compareTo(p2.getNombre());
        
    }
   
}
