/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespressoServicio;

import java.util.Scanner;
import nespressoEntidades.Cafetera;

/**
 *
 * @author Mariano
 */
public class CafeteraServicio {

    public Cafetera crearCafetera() {
        Cafetera ca1 = new Cafetera();
        ca1.setCapacidadMaxima(1000);
        ca1.setCantidadActual(0);
        return ca1;
    }

    public void llenarCafetera(Cafetera ca1) {
        ca1.setCantidadActual(ca1.getCapacidadMaxima());
        System.out.println("La cafetera se llenó correctamente");
    }

    public void servirTaza(Cafetera ca1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cual es la capacidad de la taza vacia");
        int tazaVacia = leer.nextInt();

        if (tazaVacia < ca1.getCantidadActual()) {
            System.out.println("La taza está llena");
            ca1.setCantidadActual(ca1.getCantidadActual()-tazaVacia);
        } else if (tazaVacia > ca1.getCantidadActual()) {
            ca1.setCantidadActual(0);
            System.out.println("No alcanzó el cafe para llenar la taza");
            System.out.println("La cantidad de café que tiene la taza es: " + ca1.getCapacidadMaxima());
        }
    }

    public void vaciarCafetera(Cafetera ca1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Si desea vaciar la cafetera ingrese 1. Sino ingrese 2");
        int vaciar = leer.nextInt();

        if (vaciar == 1) {
            ca1.setCantidadActual(0);
            System.out.println("Se vació correctamente la cafetera. Está en: " + ca1.getCantidadActual());
        } else {
            System.out.println("No se modificó la capidad de la cafetera, continúa en:" + ca1.getCantidadActual());
        }
    }

    public void agregarCafe(Cafetera ca1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Si desea agregar cafe a la cafetera ingrese 1. Sino ingrese 2");
        int agregar = leer.nextInt();

        if (agregar == 1) {
            System.out.println("Ingrese que cantidad desea agregar");
            int cantidadCafe = leer.nextInt();

            while (cantidadCafe > 1000) {
                System.out.println("Excede la capidad máxima, por favor ingrese una capacidad menor a 1000");
                cantidadCafe = leer.nextInt();
            }
            ca1.setCantidadActual(cantidadCafe + ca1.getCantidadActual());
            System.out.println("La cantidad de cafe actual es:" + ca1.getCantidadActual());
        } else {
            System.out.println("No se modificó la capacidad de la cafetera, continúa en:" + ca1.getCantidadActual());
        }
    }
}
    