package com.sanvalero.clinica.domain;

public class Gato {

    public String nombre;
    public float peso;
    public String raza;
    public int edad;
    public int numChip;
    public String color;

    public Gato(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumChip() {
        return numChip;
    }

    public void setNumChip(int numChip) {
        this.numChip = numChip;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", numChip=" + numChip +
                ", color='" + color + '\'';
    }



}
