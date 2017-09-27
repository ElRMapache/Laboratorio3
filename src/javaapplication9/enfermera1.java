/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author andyq
 */

public class enfermera1 {

    String nombre = " ";
    String nit = " ";
    String dpi = " ";
    String intensivo = " ";
    String aniosXP = " ";
    String salario = " ";

    public enfermera1() {

    }

    public int getEnfermera(int button) {
        return button;
    }

    public void getChar(int button) {

        if (button == 5) {
            nombre = "Juana Lopez";
            nit = "563269-K";
            dpi = "5643213450101";
            intensivo = "no";
            aniosXP = "2";
            salario = "6000";
        }

        if (button == 6) {
            nombre = "Lidia Mendez";
            nit = "7654376-6";
            dpi = "1246547850101";
            intensivo = "Si";
            aniosXP = "2";
            salario = "9000";
        }

        if (button == 7) {
            nombre = "Miriam Garcia";
            nit = "9876456-8";
            dpi = "6547854370101";
            intensivo = "no";
            aniosXP = "14";
            salario = "8000";
        }

        if (button == 8) {
            nombre = "Lorna Suarez";
            nit = "4567865-8";
            dpi = "569374160101";
            intensivo = "Si";
            aniosXP = "12";
            salario = "10000";
        }

        if (button == 9) {
            nombre = "Mariela Rodriguez";
            nit = "6789654-8";
            dpi = "3254786540101";
            intensivo = "no";
            aniosXP = "2";
            salario = "8000";
        }
    }

    public String getName() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getDPI() {
        return dpi;
    }

    public String getInt() {
        
        return intensivo;
    }

    public String getSAL() {
        return salario;
    }

    public String getAge() {
        return aniosXP;
    }

}

