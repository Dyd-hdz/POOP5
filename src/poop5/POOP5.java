/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Archivo princial, instancias de las clases
 * @author poo08alu23
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno=new Alumno();
        //alumno.nombre="Luis";//de esta manera no es posible ya que la variable nombre esta en privado
        alumno.setNombre("Jorge");//esta es la forma correcta de inicializar una variable ya que esta en modo privado
        alumno.setApellido("Medina");
        Fecha fecha=new Fecha(29,9,2023);
        Alumno alu2=new Alumno("Luis","Hernandez","Ingenieria en Computacion","Facultal de Ingenieria", 2024,fecha);
        System.out.println(alumno);//toString del objeto alumno
        System.out.println(alu2);//toString del objeto alu2
    }
    
}
