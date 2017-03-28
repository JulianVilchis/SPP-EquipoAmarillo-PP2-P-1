/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipoamarillo.pp2.p.pkg1;
import java.util.Scanner;
/**
 *
 * @author Julián
 */
public class SPPEquipoAmarilloPP2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int dec, dec2, x, a=1, b=2;
        x = decTamaño();
        System.out.println("Matriz 1: ");
        int [][] matrizA = matriz(x);
        System.out.println("Matriz 2: ");
        int [][] matrizB = matriz(x);
        System.out.println("Bienvenido al menu de matrices");
        System.out.println("Porfavor elija la opcion deseada");
        System.out.println("1. Suma de Matrices");
        System.out.println("2. Resta de Matrices");
        System.out.println("3. Multiplicacion de Matrices");
        System.out.println("4. Salir del programa");
        System.out.print("Decision: ");
        dec = kb.nextInt();
        switch (dec) {
            case 1:
                System.out.println("Bienvenido a la suma de matrices");
                sumaMatriz(matrizA, matrizB);
                break;
            case 2:
                System.out.println("Bienvenido a la resta de matrices");
                restaMatriz(matrizA, matrizB);
                break;
            case 3:
                System.out.println("Bienvenido a la multiplicacion de matrices");
                System.out.println("1. Matriz #1 * Matriz #2");
                System.out.println("2. Matriz #2 * Matriz #1");
                dec2 = kb.nextInt();
                switch (dec2) {
                    case 1:
                        multiplicacionMatrizAB(matrizA, matrizB);
                        break;
                    case 2:
                        multiplicacionMatrizBA(matrizA, matrizB);
                        break;
                }
                break;
            case 4:
                System.out.println("Adios!");
                break;
                
        }
        
    }
    
    public static int decTamaño(){
        Scanner kb = new Scanner (System.in);
        boolean flag;
        int x = 0;
        do{
            try {
                System.out.print("Porfavor introduzca el tamaño de la matriz: ");
                x = kb.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("El numero no es entero");
                flag = true;
            }   
        } while (flag);
        return x;
    }
    
    public static int [][] matriz (int x){
        int [][] matriz = new int [x][x];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = solicita();
        }}
        return matriz;
    }
    
    public static int solicita (){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int x = 0;
        do{
            try {
                System.out.println("Porfavor introduzca un numero entero");
                x = kb.nextInt();
                flag = false;
            } catch (Exception e){
                System.out.println("El numero no es un numerto entero");
                flag = true;
            }
        }while (flag);
        return x;
    }
    
    public static int [][] sumaMatriz (int [][] matrizA, int [][] matrizB){
       int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La suma es: ");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
    
    public static int [][] restaMatriz (int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La resta es: ");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
    
    public static int [][] multiplicacionMatrizAB(int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La multiplicacion es: ");
        for (int i=0; i<matrizC.length; i++){
            for (int j=0; j<matrizC.length; j++){
                for (int k=0; k<matrizC.length; k++){
        matrizC[i][j]+=(matrizA[i][k]*matrizB[k][j]);
        System.out.println(matrizC[i][j]);
    }System.out.println("");
            }
        }return matrizC;
    }
    
    public static int [][] multiplicacionMatrizBA(int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La multiplicacion es: ");
        for (int i=0; i<matrizC.length; i++){
            for (int j=0; j<matrizC.length; j++){
                for (int k=0; k<matrizC.length; k++){
        matrizC[i][j]+=(matrizB[i][k]*matrizA[k][j]);
        System.out.println(matrizC[i][j]);
    }System.out.println("");
            }
        }return matrizC;
    }
}
