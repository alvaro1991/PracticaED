package com.sanvalero.clinica;

import com.sanvalero.clinica.domain.Gato;
import com.sanvalero.clinica.domain.Perro;
import com.sanvalero.clinica.domain.Veterinario;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class classesTests {

    private static Perro perro;
    private static Gato gato;
    private static Veterinario veterinario;
    private static ArrayList<Perro> perros;

    @BeforeAll
    public static void setupAll() {
        perro = new Perro();
        gato = new Gato();
        veterinario = new Veterinario();
        perros = new ArrayList<>();
    }

    @Test
    public void testCreatePerro() {
        perro.setNombre("toby"); ;
        perro.setColor("marron");
        perro.setEdad(2);
        perro.setNumChip(123);
        perro.setPeso(20);
        perro.setRaza("pastor");



        assertEquals("toby", perro.nombre);
        assertEquals("marron", perro.color);
        assertEquals(2, perro.edad);
        assertEquals(123, perro.numChip);
        assertEquals(20, perro.peso);
        assertEquals("pastor", perro.raza);

        assertNotEquals("bobby", perro.nombre);
        assertNotEquals("blanco", perro.color);
        assertNotEquals(4, perro.edad);
        assertNotEquals(456, perro.numChip);
        assertNotEquals(18, perro.peso);
        assertNotEquals("beagle", perro.raza);


        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    @Test
    public void testComparePerro() {

        perro.setNombre("toby"); ;
        perro.setColor("marron");
        perro.setEdad(2);
        perro.setNumChip(123);
        perro.setPeso(20);
        perro.setRaza("pastor");

        //Añadimos al array el perro creado en el test
        perros.add(perro);


        if(!perros.isEmpty()){
            for (Perro perros: perros) {
                if (perro.equals(perros)) {
                    System.out.println("Método equals funciona correctamente: OK");
                }

                else{
                    System.out.println("Método equals ha fallado: ERROR");
                }
            }
        }



        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }



}
