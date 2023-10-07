/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Esta clase almacena datos de alumno
 * @author poo08alu23
 */
public class Alumno {
    /**
     * Zona de atributos
     * Una buena practica es colocar a los atributos de una clase la regla de visibilidad private,
     */
    private String nombre, apellido, carrera, escuela;
    private int semestre;
    private Fecha fNacimiento; 

    /**
     * Constructor vacio
     */
    public Alumno() {//zona de constructores
    }

    /**
     * Cosntructor lleno
     * @param nombre Nombre del alumno en String
     * @param apellido Apellido del alumno en String
     * @param carrera Carrera del alumno en String
     * @param escuela Escuela del alumno en String
     * @param semestre Semestre del alumno en int
     * @param fNacimiento Fecha de nacimiento del alumno en dato Fecha (Clase Fecha)
     */
    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }

    /**
     * Zona de metodos
     * get devuelve/regresa informacion
     * set modifica informacion
     * debe de haber un metodo get y set por cada atributo ya que con esto se podra hacerder y modificar la informacion de un atributo con
     * la regla de visibilidad private, sin estos metodos el compilador arrojara un error al no encontrar el dato al que se refiere
     */
    
    /**
     * Metodo que devuelve el nombre del alumno
     * @return nombre Nombre del alumno
     */
    public String getNombre() {//zona de getters y setters o de servicio
        return nombre;
    }
    
    /**
     * Metodo que modifica el nombre del alumno
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que devuelve el apellido del alumno
     * @return apellido Apellido del alumno
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que modifica el apellido del alumno
     * @param apellido Apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo que devuelve la carrera del alumno
     * @return carrera Carrera del alumno
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Metodo que modifica la carrera del alumno
     * @param carrera Carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Metodo que regresa la escuela del alumno
     * @return escuela Escuela del alumno
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * Metodo que modifica la escuela del alumno
     * @param escuela Escuela del alumno
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /**
     * Metodo que regresa el semestre del alumno
     * @return semestre Semestre del alumno
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Metodo que modifica el semestre del alumno
     * @param semestre Semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Metodo que regresa la fecha de nacimiento del alumno
     * @return fNacimiento Fecha de nacimiento del alumno
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     * Metodo que modifica la fecha de nacimiento del alumno
     * @param fNacimiento Fecha de nacimiento del alumno
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    
    /**
     * Metodo devuelve un mensaje
     */
    public void dormir(){
        System.out.println("zzz...");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void comer(){
        System.out.println("Estoy comiendo una torta de guajolota");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void trabajar(){
        System.out.println("Ya me quiero ir...");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void jugar(){
        System.out.println("piu piu");
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {//toString()
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
}
