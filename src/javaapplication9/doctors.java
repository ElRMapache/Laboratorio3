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
public class doctors {
    
    
    
    
    
    public int getDoctor(int button){
        
        return button;
    
}
    
    public void getChar(int button){
        String nombre = " ";
        String nit = " ";
        String dpi = " ";
        String colegiado = " ";
        int salario = 0;
        boolean especialista = false;
        
        
        
        if(button == 1){
            nombre = "Juan Perez";
            nit = "6799652-3";
            dpi = "12345567870101";
            colegiado = "89098";
            salario = 15000;
            especialista = true;
        }
        if(button == 2){
            nombre = "Luis Gutierrez";
            nit = "8964547-3";
            dpi = "9876543260101";
            colegiado = "98554";
            salario = 12000;
            especialista = false;
        }
        if(button == 3){
            nombre = "Eduardo Gonzales ";
            nit = "8786456-6";
            dpi = "5642871750101";
            colegiado = "5653";
            salario = 17000;
            especialista = true;
        }
        if(button == 4){
            nombre = "Guadalupe Torres";
            nit = "5684873-1";
            dpi = "4562973920101";
            colegiado = "10098";
            salario = 17000;
            especialista = true;
        }
        if(button == 5){
            nombre = "Maria Castillo";
            nit = "8765485-7";
            dpi = "569395290101";
            colegiado = "67965";
            salario = 13000;
            especialista = false;
        }
        
    }
    
}
