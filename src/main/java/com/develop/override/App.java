/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.develop.override;

public class App {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Javier", 5000, "Contabilidad");
        System.out.println(gerente.obtenerDetalles());

        Empleado empleado = new Empleado("Danioel", 200);
        System.out.println(empleado.obtenerDetalles());
    }
}
