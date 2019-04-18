/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Aldo
 */
public class GestorPaciente {

    private LinkedList<Paciente> pacientes;

    public GestorPaciente(LinkedList<Paciente> pacientes) {
        pacientes = new LinkedList();
    }

    public boolean addPaciente(Paciente p) {

        return pacientes.add(p);
    }

    public String ordenarPor(int crit) {
        /*  crit=0 ordenamiento natural
            crit = POR NOMBRE
            crit = POR EDAD
            crit = por altura
            crit = por peso
         */

        switch (crit) {
            case 0:
                Collections.sort(pacientes);
                break;
            case 1:
                Collections.sort(pacientes, new ComparacionPorNombre());
                break;
            case 2:
                Collections.sort(pacientes, new ComparacionPorEdad());
                break;
            case 3:
                Collections.sort(pacientes, new ComparacionPorAltura());
                break;
            case 4:
                Collections.sort(pacientes, new ComparacionPorPeso());
                break;
            default:
                Collections.sort(pacientes);
        }
        return toString();
    }
    
    public String toString(){
        String aux = "";
        for (int i = 0; i < pacientes.size(); i++) {
            aux = aux + "\n" + pacientes.get(i).toString();
        }

        return aux;
    }

}
