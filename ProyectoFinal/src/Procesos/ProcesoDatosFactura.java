/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Modelo.Bill;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DIANA CAROLINA
 */
public class ProcesoDatosFactura {
   
    public Map<String, Bill> cargarFacturasDesdeCSV(String rutaArchivo) throws IOException {
        Map<String, Bill> mapaDeFacturas = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                String idFactura = valores[0];
                String fecha = valores[1];
                String ciudad = valores[2];
                String vendedorNombre = valores[3];
                String idVendedor = valores[4];
                String comprador = valores[5];
                String idComprador = valores[6];
                String compradorFN = valores[7];
                String compradorG = valores[8];
                String idDetalleFactura = valores[9];
                String codigoProduc = valores[10];
                String nombreProduc = valores[11];
                String valorUnitario = valores[12];
                String  cantidad = valores[13];
                String categoria = valores[14];
                 
                Bill factura = new Bill( idFactura, idVendedor, idComprador, valorUnitario,
                         fecha, vendedorNombre,comprador ,compradorFN,compradorG, idDetalleFactura, codigoProduc, nombreProduc,cantidad, categoria, ciudad);

                
                mapaDeFacturas.put(idFactura, factura);
    }
            
            
}
         return mapaDeFacturas;
    }
}
        