/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        hospital.pacientes   = 200;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f - %d\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto,hospital.pacientes);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas+ "-" +hospital.pacientes);
        /* %s(string) - %d(entero) - %.2f(double con 2 decimales el 2 explica cantidad de decimales) - %d */
    }
}
