/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author aludba
 */
public class GestorPacientes {
    private LinkedList<Paciente> pacientes;
    
    public GestorPacientes()
    {
        pacientes=new LinkedList();
    }
    
    public boolean addPaciente(Paciente p)
    {
        return pacientes.add(p);
    }
    
    public String ordenarPor(int crit)
    {
        /*crit=0 -> ordenamiento natural (apellido)
          crit=1 -> por nombre
          crit=2 -> edad
          crit=3 -> altura
          crit=4 -> peso
        */
        switch(crit)
        {
            case 0:Collections.sort(pacientes);
                   break;
            case 1:Collections.sort(pacientes, new ComparacionPorNombre());
                   break;
            case 2:Collections.sort(pacientes, new ComparacionPorEdad());
                   break;
            case 3:Collections.sort(pacientes, new ComparacionPorAltura());
                   break;
            case 4:Collections.sort(pacientes, new ComparacionPorPeso());
                   break;
            default:Collections.sort(pacientes);
        }
        return toString();
    }
    
    public String toString()
    {
        String aux="";
        for(int i=0;i<pacientes.size();i++)
        {
            aux=aux+"\n"+pacientes.get(i).toString();
        }
        return aux;
    }
}
