/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Comparator;
/**
 *
 * @author aludba
 */
public class ComparacionPorPeso implements Comparator<Paciente> {
    
    public int compare(Paciente p1,Paciente p2)
    {
        return (int)(p1.getPeso()-p2.getPeso());
    }
    
}
