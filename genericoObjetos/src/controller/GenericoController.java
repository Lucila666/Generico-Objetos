/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;




/**
 *
 * @author Valentina
 */
public class GenericoController {
        /*
	 * Esta clase es el GenericoController de emprendimientos
	 */
    
	private static GenericoController emprendimientoController;
	private static ArrayList<claseContribuyente> contribuyentes = new ArrayList<claseContribuyente>();
	
	// constructor singletton
	public static GenericoController getControllerEmprendimientos()throws org.json.simple.parser.ParseException{
		if (emprendimientoController == null) {
			emprendimientoController = new GenericoController();
			addContribuyente();
			
		}
		return emprendimientoController;
	}
public ArrayList<String> obtenerNombreContribuyentes() {
		ArrayList<String> nombreContribuyentes = new ArrayList<String>();
		if (contribuyentes != null && !contribuyentes.isEmpty()) {
			for (Iterator iterator = contribuyentes.iterator(); iterator.hasNext();) {
				claseContribuyente socio = (claseContribuyente) iterator.next();
				if (socio.getNombre() != null && socio.getNombre().length() > 0) {
					nombreContribuyentes.add(socio.getNombre());
				}
			}
		}
		return nombreContribuyentes;
	}
    public static void setEmprendimientoController(GenericoController emprendimientoController) {
        GenericoController.emprendimientoController = emprendimientoController;
    }

    public static void setContribuyentes(ArrayList<claseContribuyente> contribuyentes) {
        GenericoController.contribuyentes = contribuyentes;
    }

    public static ArrayList<claseContribuyente> getContribuyentes() {
        return contribuyentes;
    }
        private static void addContribuyente(){
            claseContribuyente contribuyente1= new claseContribuyente("Pedro Perez");
            contribuyentes.add(contribuyente1);
            claseContribuyente contribuyente2= new claseContribuyente("Juan Juarez");
            contribuyentes.add(contribuyente2);
            
            
        }
        public void agregarContribuyente(String nombre){
            claseContribuyente contribuyente1= new claseContribuyente(nombre);
            contribuyentes.add(contribuyente1);
           
        }
        public int traerImporte(String nombre){
            for (Iterator iterator = contribuyentes.iterator(); iterator.hasNext();) {
			claseContribuyente contribuyenteIn = (claseContribuyente) iterator.next();
			if (contribuyenteIn.getNombre() != null && contribuyenteIn.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
				return contribuyenteIn.calcularImpuesto();
			}
		}
            return 0;
        }
//	private static void addPrincipal(JSONParser parser, Gson g) throws org.json.simple.parser.ParseException {
//		try {
//                    //Tener cuidado con la rutas de los json, verificar que sean correctas
//			String emprendimiento1 = parser.parse(new FileReader("D:\\Documentos\\GitHub\\Generico-Objetos\\genericoObjetos\\src\\informacion\\emprendimiento1.json"))
//					.toString();
//			Principal emp1 = g.fromJson(emprendimiento1, Principal.class);
//                        emprendimientos.add(emp1);
//                        
//                        String emprendimiento2 = parser.parse(new FileReader("D:\\Documentos\\GitHub\\Generico-Objetos\\genericoObjetos\\src\\informacion\\emprendimiento2.json"))
//					.toString();
//			Principal emp2 = g.fromJson(emprendimiento2, Principal.class);
//			emprendimientos.add(emp2);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//
//	}

    
}
