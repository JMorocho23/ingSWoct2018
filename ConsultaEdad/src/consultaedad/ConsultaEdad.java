/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaedad;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anticlutch
 */
public class ConsultaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese su año de nacimiento: ");
            int anioNacimiento = scan.nextInt();
            calcularEdad(anioNacimiento);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsultaEdad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Se calcula la edad de la persona usando su año de nacimiento
        y se guarda en un archivo externo
    */
    public static void calcularEdad(int anioNacimiento) throws FileNotFoundException{
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int edad =  anioActual - anioNacimiento;
        String edadActual = String.valueOf(edad);
        
        try (PrintWriter out = new PrintWriter("tuEdad.txt")) {
            out.println(edadActual);
            System.out.println("Su edad ha sido calculada! Revise el archivo");
        }
    }
    
}
