/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aryangitejava;
import java.util.*;

/**
 *
 * @author Aryan Gite
 */
public class arr {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter number of phone no: ");
        int ppl = cin.nextInt();
        int PhoneNumber[] = new int[ppl];
        for(int i=0;i<ppl;i++){
            System.out.println("Enter phone no: ");
            PhoneNumber[i] = cin.nextInt();
        }
        for(int i=0;i<ppl;i++){
            System.out.println(PhoneNumber[i]);
        }
    }
}