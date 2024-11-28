/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Cuadrado implements FiguraGeometrica {
//1.ATRIBUTO
private double lado;
//2. CONTRUCTORES
    public Cuadrado(double lado) {
        this.lado = lado;
    }
//3. ENCAPSULAMIENTOS
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }
//METODOS DE REGLA DE NEGOCIO
    @Override
    public String toString() {
    return "DATOS DEl CUADRADO\n"+
            "LADOS:"+getLado();}


    


    @Override
    public void area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 }