package com.ronn.basis.argumentpassing;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArgumentPassing {

    private void hoolaPriitive(){
        int x = 5;

        System.out.println("Primer valor: " + x);
        cambiarValorPrimitive(x);

        System.out.println("Segundo valor: " + x);
    }

    private void cambiarValorPrimitive(int x){

        x = 9;
    }

    private void comprobarLisa(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        integers.forEach(System.out::print);

        modificarLista(integers);

        System.out.println("-------------------");
        integers.forEach(System.out::print);
    }

    private void modificarLista(List<Integer> lista){
        lista.set(1, 30);
    }

    @Test
    public void probar(){
        hoolaPriitive();
        comprobarLisa();
    }
}