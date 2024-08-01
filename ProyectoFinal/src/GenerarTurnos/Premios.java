/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenerarTurnos;

import Modelo.Bill;
import Modelo.Cliente;
import Modelo.Turn;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author DIANA CAROLINA
 */
public class Premios {
       public PriorityQueue<Turn> generarPremios(List<Bill> facturas) {
        PriorityQueue<Turn> colaPremios = new PriorityQueue<>(Collections.reverseOrder());

        for (Bill factura : facturas) {
            if (factura.getValor() > 1000000) {
                int prioridad = calcularPrioridad(factura.getCliente());
                Turn premio = new Turn(factura.getCliente(), factura.getValor(), factura.getId(),
                        "5 Entradas para Cine y un iPhone 15 Pro Max", prioridad);
                colaPremios.add(premio);
            }
        }

        return colaPremios;
    }

    private int calcularPrioridad(Cliente cliente) {
        int prioridad = cliente.getEdad();
        if (cliente.getGenero().equalsIgnoreCase("F")) {
            prioridad += 10; // Mayor prioridad a mujeres
        }
        return prioridad;
    }

    public void mostrarOrdenPremios(PriorityQueue<Turn> colaPremios) {
        while (!colaPremios.isEmpty()) {
            Turn premio = colaPremios.poll();
            System.out.println(premio);
        }
    }
}

