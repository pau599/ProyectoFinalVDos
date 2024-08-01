/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DIANA CAROLINA
 */
public class CSVNuevo {

    public CSVNuevo(FileWriter fileWriter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CSVNuevo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  public void crearArchivoCSV(String rutaArchivo) {
    File archivo = new File(rutaArchivo);
    File directorio = archivo.getParentFile();
    
    if (directorio != null && !directorio.exists()) {
        if (directorio.mkdirs()) {
            System.out.println("Directorio creado: " + directorio.getAbsolutePath());
        } else {
            System.err.println("No se pudo crear el directorio: " + directorio.getAbsolutePath());
        }
    }
    
    try (FileWriter escritor = new FileWriter(archivo)) {
        System.out.println("Archivo CSV vacío creado en: " + rutaArchivo);
    } catch (IOException e) {
        System.err.println("Error al crear el archivo CSV: " + e.getMessage());
    }
}

    
    public void copiarDatosCSV(String archivoOrigen, String archivoDestino) {
    try (BufferedReader lector = new BufferedReader(new FileReader(archivoOrigen));
         BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDestino))) {
        
        String linea;
        while ((linea = lector.readLine()) != null) {
            escritor.write(linea);
            escritor.newLine(); 
        }
        
        System.out.println("Datos copiados al archivo CSV vacío.");
    } catch (IOException e) {
        System.err.println("Error al copiar los datos CSV: " + e.getMessage());
    }
}
    
}
