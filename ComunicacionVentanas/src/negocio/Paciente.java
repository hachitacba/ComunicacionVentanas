/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Aldo
 */
public class Paciente implements Comparable<Paciente>{
    private String nombre, apellido;
    private int codigo, edad;
    double altura,peso;
    private static int cod=1;

    public Paciente(String nom, String ape, int ed, double al, double pe) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = ed;
        this.altura = al;
        this.peso = pe;
        this.codigo=cod;
        cod=cod+1;

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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        Paciente.cod = cod;
    }

    @Override
    public int compareTo(Paciente obj) {

        return this.apellido.compareTo(obj.apellido);
    }
    
    public String toString(){

        return "Código: "+codigo+"\nApellido: "+apellido+"\nNombre; "+nombre+
                "\nEdad: "+edad+"años"+"\nPeso"+peso+"Kgs";
        
    }
        
        
    
    
}
