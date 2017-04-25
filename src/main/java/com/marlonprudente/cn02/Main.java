/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marlonprudente.cn02;

import com.marlonprudente.matriz.Matriz;

/**
 *
 * @author marlon
 */
public class Main {

    public static void main(String[] args) {
        Matriz m1 = new Matriz(), m2 = new Matriz();

        Double[][] ma1 = {{3.0, -0.1, -0.2, 7.85}, {0.1, 7.0, -0.3, -19.3}, {0.3, -0.2, 10.0, 71.4}};
        //Double[][] ma1 = {{0.5, -1.0, 1.0, 6.0}, {3.0, 2.0, 1.0, 8.0}, {5.0, -1.0, -3.0, -1.0}};
        m1.matrix = ma1;
        m1.getMatriz();
        System.out.println("M1=>GI---");
        m1.gaussIngenuo();
        System.out.println("M1=>GJ---");
        m1.gaussJordan();
        System.out.println("M1=>GS---");
        m1.gaussSeidel(0.05, 100);
        
        System.out.println("---");

        Double[][] ma2 = {{1.0, 1.0, -1.0, -3.0}, {6.0, 2.0, 2.0, 2.0}, {-3.0, 4.0, 1.0, 1.0}};
        m2.matrix = ma2;
        m2.getMatriz();
        System.out.println("M2=>GI---");
        m1.gaussIngenuo();
        System.out.println("M2=>GJ---");
        m1.gaussJordan();
        System.out.println("M2=>GS---");
        m1.gaussSeidel(0.05, 100);

    }
}
