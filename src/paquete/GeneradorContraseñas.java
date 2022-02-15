/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Random;

/**
 *
 * @author CSjes
 */
public class GeneradorContraseñas {

    public String Gen() {
        int x;
        String con, car = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvxyz.,-_@/?¿!¡#";
        Random obr = new Random();
        do {
            con = "";
            for (x = 0; x <= 7; x++) {
                con += car.charAt(obr.nextInt(car.length()));
            }
            if (this.Validar(con)) {
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } while (!this.Validar(con));
        return con;
    }

    public void Mostrar(String con) {
        System.out.println(con);
    }

    private boolean Validar(String con) {
        String num = "0123456789", min = "abcdefghijklmnopqrstuvxyz", may = "ABCDEFGHIJKLMNOPQRSTUVXYZ", car = ".,-_@/?¿!¡#";
        int x, conn = 0, conm = 0, conM = 0, conc = 0;
        if (con.length() == 8) {
            for (x = 0; x < con.length(); x++) {
                if (num.contains(con.charAt(x) + "")) {
                    conn = conn + 1;
                }
                if (min.contains(con.charAt(x) + "")) {
                    conm = conm + 1;
                }
                if (may.contains(con.charAt(x) + "")) {
                    conM = conM + 1;
                }
                if (car.contains(con.charAt(x) + "")) {
                    conc = conc + 1;
                }
            }
            return conn >= 1 && conm >= 1 && conM >= 1 && conc >= 1;
        } else {
            return false;
        }
    }
}
