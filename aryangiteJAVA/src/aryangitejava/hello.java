/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aryangitejava;
import java.util.*;
/**
 *
 * @author PC 6
 */
public class hello {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter A: ");
            int a = cin.nextInt();
            System.out.println("Enter C: ");
            char c = cin.next().charAt(0);
            System.out.println("Enter B: ");
            int b = cin.nextInt();
            switch (c){
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b==0){
                        System.out.println("Can't divide by 0");
                }
                else{
                    System.out.println(a / b);
                    break;
                }
        }
    }
}