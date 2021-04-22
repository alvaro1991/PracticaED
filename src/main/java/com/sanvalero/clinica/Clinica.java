package com.sanvalero.clinica;


import com.sanvalero.clinica.domain.Gato;
import com.sanvalero.clinica.domain.Perro;
import com.sanvalero.clinica.domain.Veterinario;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
    
    private boolean salir;
    private final Scanner teclado;

    private final ArrayList<Perro> perrosclinica = new ArrayList<>();
    private final ArrayList<Gato> gatosclinica = new ArrayList<>();
    private final ArrayList<Veterinario> trabajadoresClinica = new ArrayList<>();

    public Clinica() {
        salir = false;
        teclado = new Scanner(System.in);
    }
    
    public void ejecutar() { 
        do {
            System.out.println("Aplicación Clinica Veterinaria v0.1");
            System.out.println("1. Registrar perro");
            System.out.println("2. Ver todos los perros");
            System.out.println("3. Registrar gato");
            System.out.println("4. Ver todos los gatos");
            System.out.println("5. Registrar nuevo trabajador");
            System.out.println("6. Ver todos los trabajadores");
            System.out.println("x. Salir");
            System.out.print("Selecciona: ");
            String opcion = teclado.nextLine();
            
            switch (opcion) {
                case "1":
                    registrarPerro();
                    break;
                case "2":
                    vertodoslosPerros();
                    break;
                case "3":
                    registrarGato();
                    break;
                case "4":
                    vertodoslosGatos();
                    break;
                case "5":
                    registrarNuevoTrabajador();
                    break;
                case "6":
                    vertodoslosTrabajadores();
                    break;
                case "x":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while(!salir);
    }
    
    public void registrarPerro(){

        Perro perro = new Perro();

        System.out.println("Nombre del perro?:");
        String nombrePerro = teclado.next();
        perro.setNombre(nombrePerro);

        System.out.println("Peso?:");
        float pesoPerro = teclado.nextFloat();
        perro.setPeso(pesoPerro);

        System.out.println("Raza?:");
        String razaPerro = teclado.next();
        perro.setRaza(razaPerro);

        System.out.println("Edad?:");
        int edadPerro = teclado.nextInt();
        perro.setEdad(edadPerro);

        System.out.println("Número de chip?:");
        int numChip = teclado.nextInt();
        perro.setNumChip(numChip);

        System.out.println("Color?:");
        String color = teclado.next();
        perro.setColor(color);

        //Comprobamos que en el listado que tenemos no exista uno con las mismas características ye vitamos registros repetidos
        if(!perrosclinica.isEmpty()){
            for (Perro perros: perrosclinica) {
                if (perro.equals(perros)) {
                    System.out.println("Ya existe un perro con esos datos");
                    System.out.println("Introduce otro");
                    ejecutar();
                }
            }
        }

        perrosclinica.add(perro);

    }

    public void vertodoslosPerros(){
        for (Perro perros: perrosclinica) {
            System.out.println(perros.toString());
        }
    }

    public void registrarGato(){

        Gato gato = new Gato();

        System.out.println("Nombre del gato?:");
        String nombreGato = teclado.next();
        gato.setNombre(nombreGato);

        System.out.println("Peso?:");
        float pesoGato = teclado.nextFloat();
        gato.setPeso(pesoGato);

        System.out.println("Raza?:");
        String razaGato = teclado.next();
        gato.setRaza(razaGato);

        System.out.println("Edad?:");
        int edadGato = teclado.nextInt();
        gato.setEdad(edadGato);

        System.out.println("Número de chip?:");
        int numChip = teclado.nextInt();
        gato.setNumChip(numChip);

        System.out.println("Color?:");
        String color = teclado.next();
        gato.setColor(color);

        //Comprobamos que en el listado que tenemos no exista uno con las mismas características y evitamos registros repetidos
        if(!gatosclinica.isEmpty()){
            for (Gato gatos: gatosclinica) {
                if (gato.equals(gatos)) {
                    System.out.println("Ya existe un gato con esos datos");
                    System.out.println("Introduce otro");
                    ejecutar();
                }
            }
        }

        gatosclinica.add(gato);

    }

    public void vertodoslosGatos(){
        for (Gato gatos: gatosclinica) {
            System.out.println(gatos.toString());
        }
    }

    public void registrarNuevoTrabajador(){

        Veterinario veterinario = new Veterinario();

        System.out.println("Nombre del trabajador?:");
        String nombreTrabajador = teclado.next();
        veterinario.setNombre(nombreTrabajador);

        System.out.println("Edad?:");
        int edadTrabajador = teclado.nextInt();
        veterinario.setEdad(edadTrabajador);

        System.out.println("Años de experiencia?:");
        int añosExperiencia = teclado.nextInt();
        veterinario.setAñosExperiencia(añosExperiencia);

        System.out.println("Titulo universitario?:");
        boolean tituloUniversitario = teclado.nextBoolean();
        veterinario.setTituladoUniversitario(tituloUniversitario);

        System.out.println("Sexo?:");
        String sexoTrabajador = teclado.nextLine();
        veterinario.setSexo(sexoTrabajador);

        //Comprobamos que en el listado que tenemos no exista uno con las mismas características y evitamos registros repetidos
        if(!trabajadoresClinica.isEmpty()){
            for (Veterinario veterinarios: trabajadoresClinica) {
                if (veterinario.equals(veterinarios)) {
                    System.out.println("Ya existe un trabajador con esos datos");
                    System.out.println("Introduce otro");
                    ejecutar();
                }
            }
        }

        trabajadoresClinica.add(veterinario);

    }

    public void vertodoslosTrabajadores(){
        for (Veterinario veterinarios: trabajadoresClinica) {
            System.out.println(veterinarios.toString());
        }
    }
    
    private void salir() {
        salir = true;
    } 
}
