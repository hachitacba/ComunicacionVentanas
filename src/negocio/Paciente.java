/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
//import java.util.Comparator;

/**
 *
 * @author aludba
 */
public class Paciente implements Comparable<Paciente>{
    private String nombre, apellido;
    private int codigo, edad;
    private double altura, peso;
    private static int cod=1;
    
    public Paciente(String ape, String nom, int ed, double al, double pe)
    {
        codigo = cod;
        cod=cod+1;
        apellido = ape;
        nombre = nom;
        edad = ed;
        altura = al;
        peso = pe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Definición del método compareTo()
    public int compareTo(Paciente obj)
    {
        return this.apellido.compareTo(obj.apellido);
    }
    
    public String toString()
    {
        return "Código: "+codigo+"  Apellido y nombre: "+apellido+", "
               +nombre+"\t   Edad: "+edad+"años"+
               "\t  Altura: "+altura+"mts"+"\t Peso: "+peso+" kg";
    }
           
    
}
