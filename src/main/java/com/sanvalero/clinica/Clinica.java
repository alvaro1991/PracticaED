package com.sanvalero.clinica;


import java.util.ArrayList;
import java.util.Scanner;
import com.sanvalero.clinica.domain.Perro;
import com.sanvalero.clinica.domain.Gato;
import com.sanvalero.clinica.domain.Veterinario;

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
              
                    break;
                case "3":
                    registrarGato();
                    break;
                case "4":

                    break;
                case "5":
                    registrarNuevoTrabajador();
                    break;
                case "6":

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


        perrosclinica.add(perro);

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


        gatosclinica.add(gato);

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

        trabajadoresClinica.add(veterinario);

    }


    
    private void salir() {
        salir = true;
    } 
}
