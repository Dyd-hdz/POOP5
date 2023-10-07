/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Esta clase almacena los datos de la fecha
 * @author poo08alu23
 */
public class Fecha {
    /**
     * Zona de atributos
     * Buena practica que todos tengan la visibilida privada
     */
    private int dia, mes, año;

    /**
     * Constructor vacio
     */
    public Fecha() {//constructor vacio
    }

    /**
     * Cosntructor lleno
     * @param dia Numero de dia en int
     * @param mes Mes en int
     * @param año Año en int
     */
    public Fecha(int dia, int mes, int año) {//constructor con parametros
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    /**
     * Metodo que devuelve el dia de la fecha
     * @return dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Metodo que modifica el dia de la fecha
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Metodo que devuelve el mes de la fecha
     * @return mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Metodo que modifica el mes de la fecha
     * @param mes 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Metodo que devuelve el año de la fecha
     * @return año
     */
    public int getAño() {
        return año;
    }

    /**
     * Metodo que modifica el año de la fecha
     * @param año 
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
}
