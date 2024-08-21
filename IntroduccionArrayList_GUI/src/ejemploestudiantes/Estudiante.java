/*
*  Clase Estudiante
*  Creado por: Orlando Arboleda Molina
*  Fecha: 5-Marzo-2019
*
*  Descripción: 
*  Clase Estudiante para la explicación de uso de la estructura dinámica
*  ArrayList, para el curso de POO en la Universidad Autónoma de Occidente
*
*/
package ejemploestudiantes;

import java.util.ArrayList;

/**
 *
 * @author oarboleda
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private double nota;

    public Estudiante(int codigo, String nombre, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Codigo Estudiante=" + codigo + "  Nombre=" + nombre +
                "  Nota="+ nota;
    }
}
