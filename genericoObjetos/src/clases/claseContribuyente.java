/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Valentina
 */
public class claseContribuyente {
    private String Nombre;
    
    public claseContribuyente(String nombre){
        this.Nombre=nombre;
    }
    
    public int calcularImpuesto(){
        return 5;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
