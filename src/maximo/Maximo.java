/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pc-Gpr
 */
public class Maximo {

    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int x, y, z, max;

        System.out.println("Introduce x, y, z:");
        x = Integer.parseInt(entrada.readLine());
        y = Integer.parseInt(entrada.readLine());
        z = Integer.parseInt(entrada.readLine());

        if (x > y && x > z) {
            max = x;
        } else if (z > y) {
            max = z;
        } else {
            max = y;
        }
        System.out.println("El máximo es " + max);
    }
}

