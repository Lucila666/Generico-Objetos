/*
 *Aca se debe manejar la informacion de nuestro emprendimiento 
 */
package clases;

import enumeraciones.Enumeracion1;
import java.util.ArrayList;

/**
 *
 * @author Valentina
 */
public class Principal {
    //ATRIBUTOS
    private String nombreEmprendimiento;
    //Si hay una relacion de composicion de 1 a 1 voy a tener un atributo unico.
    private Otro1 otraClase1;
    //Si hay una relacion de composicion de 1 a muchos, voy a tener una lista de la otra clase.
    private ArrayList<Otro2> otraClase2;
    
    
	
  public void verDisenosDisponibles(){}
  public void elegirDiseno(){}
  public void informacionContacto(){}
    
}
