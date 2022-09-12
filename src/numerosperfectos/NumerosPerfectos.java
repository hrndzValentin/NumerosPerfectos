/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosperfectos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import numeros.Numeros;

public class NumerosPerfectos {
    static List<Integer> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        
        try {
            Scanner escaner = new Scanner(System.in);
        
        System.out.print("Ingrese su primer valor: ");
        int primerValor = escaner.nextInt();
        
        System.out.print("Ingrese su segundo valor: ");
        int segundoValor = escaner.nextInt();
        
        NumerosPerfectos.lista = listar(primerValor, segundoValor);
        
        if(primerValor <= 0 || segundoValor <= 0){
            
            System.out.println("Por favor restringir el rango a numeros naturales");
        }else{
            for(int i: lista){
            System.out.print(i + "\n");
        }
        }
        } catch (Exception e) {
            System.out.println("Por favor restringir el rango a numeros naturales");
        }
    }
    
    public static ArrayList listar(int a, int b){
        List<Integer> perfectos = new ArrayList<>();
        for(int i = a; i<b; i++){
            
            int divisor = 0;
            
            for(int x = 1; x < i; x++){
                if(i % x == 0){
                    divisor += x;
                }
            }
            if (i == divisor){
                perfectos.add(i);
            }
        }
        return (ArrayList) perfectos;
    }
}
