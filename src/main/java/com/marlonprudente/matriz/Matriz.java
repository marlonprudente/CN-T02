/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marlonprudente.matriz;

import java.util.Scanner;

/**
 *
 * @author Marlon Prudente
 */
public class Matriz {

    public Double[][] matrix = new Double[3][3];

    public void setMatriz() {
        int i, j;
        Scanner teclado = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("i = " + i + " j = " + j);
                matrix[i][j] = teclado.nextDouble();
            }

        }

    }

    public void gaussIngenuo() {
        Double[][] nm = matrix;
        Double fator;
        Double[] x = {0.0, 0.0, 0.0};
        Double soma;

        for (int k = 0; k < 2; k++) {

            for (int i = k + 1; i < 3; i++) {
                fator = nm[i][k] / nm[k][k];

                for (int j = k + 1; j < 3; j++) {
                    nm[i][j] = nm[i][j] - fator * nm[k][j];

                }
                nm[i][3] = nm[i][3] - fator * nm[k][3];
            }

        }

        System.out.println("Eliminação Progressiva: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + nm[i][j]);
            }
            System.out.println();

        }

        System.out.println("Substituição Regressiva: ");
        x[2] = nm[2][3] / nm[2][2];
        for (int i = 2; i > -1; i--) {
            soma = 0.0;
            
            for (int j = (i + 1); j < 3; j++) {
                soma = soma + nm[i][j] * x[j];
                               x[i] = (nm[i][3] - soma) / nm[i][i]; 
            }
            
        }


            System.out.println("X" + " = " + x[0]);
            System.out.println("Y" + " = " + x[1]);
            System.out.println("Z" + " = " + x[2]);

    }

    public void gaussJordan() {
        
        Double[][] nm = matrix;
        Double[] x = {0.0, 0.0, 0.0};
        for(int k = 0; k< 3; k++){
            for(int l = k+1; l < 4; l++){
                nm[k][l] = nm[k][l]/nm[k][k];
            }
            nm[k][k] = 1.0;
            for(int i = 0; i < 3;i++){
                if(i!=k){
                    for(int j = k+1; j< 4;j++ ){
                        nm[i][j] = nm[i][j] - (nm[k][j]*nm[i][k]);
                    }
                }
            }
        }
        
        
        for(int m = 0; m<3;m++){
            x[m] = nm[m][3];
        }
            System.out.println("X" + " = " + x[0]);
            System.out.println("Y" + " = " + x[1]);
            System.out.println("Z" + " = " + x[2]);
    }

    public void gaussSeidel(Float es, Integer imax) {

    }

    public void getMatriz() {
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
