/*
 * El presente es un ejemplo muy sencillo. Vamos a supener que se quieren gestionar emprendimientos pequeños de tatuajes
 * el generico sera el nombre del emprendimiento
 * como es una empresa chica solo tiene dueño/empleado/tatuador
 * pero tiene muchos objetos para vender, en este caso diseños
 */
package genericoobjetos;

import controller.GenericoController;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Valentina
 */
public class GenericoObjetos {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        GenericoController emprendimiento = GenericoController.getControllerEmprendimientos();
        int pepe=3;
        

    }
    
}
