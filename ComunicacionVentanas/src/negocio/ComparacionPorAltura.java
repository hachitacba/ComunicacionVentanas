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
public class ComparacionPorAltura implements Comparator<Paciente>{
    
    public int compare(Paciente p1,Paciente p2)
    {
        double dif=p1.getAltura()-p2.getAltura();
        int res=0;
        if(dif>0)
            res=1;
        else
            if(dif<0)
                res=-1;
        return res;
    }
}
