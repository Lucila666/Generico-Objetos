/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Principal;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Valentina
 */
public class GenericoController {
        /*
	 * Esta clase es el GenericoController de emprendimientos
	 */
    
	private static GenericoController emprendimientoController;
	private static ArrayList<Principal> emprendimientos = new ArrayList<Principal>();
	
	// constructor singletton
	public static GenericoController getControllerEmprendimientos()throws org.json.simple.parser.ParseException{
		if (emprendimientoController == null) {
			emprendimientoController = new GenericoController();
			JSONParser parser = new JSONParser();
			Gson g = new GsonBuilder().serializeNulls().create();
			addPrincipal(parser, g);
			
		}
		return emprendimientoController;
	}

	private static void addPrincipal(JSONParser parser, Gson g) throws org.json.simple.parser.ParseException {
		try {
                    //Tener cuidado con la rutas de los json, verificar que sean correctas
			String emprendimiento1 = parser.parse(new FileReader("D:\\Documentos\\GitHub\\Generico-Objetos\\genericoObjetos\\src\\informacion\\emprendimiento1.json"))
					.toString();
			Principal emp1 = g.fromJson(emprendimiento1, Principal.class);
                        emprendimientos.add(emp1);
                        
                        String emprendimiento2 = parser.parse(new FileReader("D:\\Documentos\\GitHub\\Generico-Objetos\\genericoObjetos\\src\\informacion\\emprendimiento2.json"))
					.toString();
			Principal emp2 = g.fromJson(emprendimiento2, Principal.class);
			emprendimientos.add(emp2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

    
}
