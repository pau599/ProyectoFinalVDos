/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import Repositorio.CSVNuevo;
import Repositorio.ManipularCSV;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DIANA CAROLINA
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            ManipularCSV archivo = new ManipularCSV();
            
            archivo.leerArchivo("C:\\Users\\DIANA CAROLINA\\Downloads\\Ejemplo en hoja de cálculo - Hoja 1.csv");
            
            CSVNuevo  nuevo= new CSVNuevo();
        String rutaArchivo = "ruta/del/archivo.csv"; 
        nuevo.crearArchivoCSV(rutaArchivo);
    
       CSVNuevo nuevo2 = new CSVNuevo();
        String archivoOrigen = "C:\\Users\\DIANA CAROLINA\\Downloads\\Ejemplo en hoja de cálculo - Hoja 1.csv"; 
        String archivoDestino = "C:\\Users\\DIANA CAROLINA\\Downloads\\Archivo vacio.csv"; 
        nuevo2.crearArchivoCSV(archivoDestino);
        nuevo2.copiarDatosCSV(archivoOrigen, archivoDestino);
        
        archivo.leerArchivo("C:\\\\Users\\\\DIANA CAROLINA\\\\Downloads\\\\Archivo vacio.csv");
        
        
       
}
}