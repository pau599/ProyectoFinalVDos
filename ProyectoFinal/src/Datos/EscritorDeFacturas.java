/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.Bill;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.General;
import Modelo.Producto;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DIANA CAROLINA
 */

public class EscritorDeFacturas {
    public static void escribirFacturasEnCSV(List<Bill> facturas) {
        // Archivo para datos básicos de la factura
        escribirDatosBasicosDeFacturaEnCSV(facturas, "facturas.csv");

        // Archivo para datos del vendedor
        escribirDatosDelVendedorEnCSV(facturas, "vendedores.csv");

        // Archivo para datos del comprador
        escribirDatosDelCompradorEnCSV(facturas, "compradores.csv");

        // Archivo para datos del detalle vendido
        escribirDatosDelDetalleVendidoEnCSV(facturas, "detalles.csv");

        // Archivo para datos del producto vendido
        escribirDatosDelProductoVendidoEnCSV(facturas, "productos.csv");
    }

    private static void escribirDatosBasicosDeFacturaEnCSV(List<Bill> facturas, String nombreArchivo) {
        try {
            CSVWriter escritor = new CSVWriter(new FileWriter(nombreArchivo));
            escritor.writeNext(new String[] {"id", "fecha", "total", "ciudad"});
            for (Bill factura : facturas) {
                escritor.writeNext(new String[] {
                        factura.getId().toString(),
                        factura.getFecha(),
                        String.valueOf(factura.getTotal()),
                        factura.getCiudad().getNombre(),
                });
            }
        } catch (IOException e) {
           System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static void escribirDatosDelVendedorEnCSV(List<Bill> facturas, String nombreArchivo) {
        try{
            CSVWriter escritor = new CSVWriter(new FileWriter(nombreArchivo));
            escritor.writeNext(new String[] {"id", "nombre", "correo"});
            for (Bill factura : facturas) {
                Empleado vendedor = factura.getEmpleado();
                escritor.writeNext(new String[] {
                        String.valueOf(vendedor.getId()),
                        vendedor.getNombre(),
                        vendedor.getGmail()
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escribirDatosDelCompradorEnCSV(List<Bill> facturas, String nombreArchivo) {
        try {
            CSVWriter escritor = new CSVWriter (new FileWriter(nombreArchivo));
            escritor.writeNext(new String[] {"id", "nombre", "correo"});
            for (Bill factura : facturas) {
                Cliente comprador = factura.getCliente();
                escritor.writeNext(new String[] {
                        String.valueOf(comprador.getId()),
                        comprador.getNombre(),
                      
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escribirDatosDelDetalleVendidoEnCSV(List<Bill> facturas, String nombreArchivo) {
        try {
            CSVWriter escritor = new CSVWriter(new FileWriter(nombreArchivo)); 
            escritor.writeNext(new String[] {"id_factura", "id_producto", "cantidad", "precio_unitario"});
            for (Bill factura : facturas) {
                for (General detalle : factura.getGeneral()) {
                    escritor.writeNext(new String[] {
                            factura.getId().toString(),
                            detalle.getProductId().toString(),
                            String.valueOf(detalle.getQuantity()),
                            String.valueOf(detalle.getUnitPrice())
                    });
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escribirDatosDelProductoVendidoEnCSV(List<Bill> facturas, String nombreArchivo) {
        try {
            CSVWriter escritor = new CSVWriter(new FileWriter(nombreArchivo));
            escritor.writeNext(new String[] {"id", "nombre", "descripcion"});
            Set<Producto> productos = new HashSet<>();
            for (Bill factura : facturas) {
                for (General general : factura.getGeneral()) {
                    Producto.add(general.getProducto());
                }
            }
            for (Producto producto : productos) {
                escritor.writeNext(new String[] {
                        producto.getId().toString(),
                        producto.getName(),
                        producto.getDescription()
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}