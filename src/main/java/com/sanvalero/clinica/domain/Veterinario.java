package com.sanvalero.clinica.domain;

public class Veterinario {

    public String nombre;
    public int edad;
    public float añosExperiencia;
    public boolean tituladoUniversitario;
    public String sexo;

    public Veterinario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(float añoExperiencia) {
        this.añosExperiencia = añoExperiencia;
    }

    public boolean isTituladoUniversitario() {
        return tituladoUniversitario;
    }

    public void setTituladoUniversitario(boolean tituladoUniversitario) {
        this.tituladoUniversitario = tituladoUniversitario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return 
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", años de experiencia=" + añosExperiencia +
                ", titulado universitario=" + tituladoUniversitario +
                ", sexo='" + sexo + '\'';
    }
}
