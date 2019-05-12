package com.sda.algorytmy;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        int a = scannner.nextInt();
        int b = scannner.nextInt();
        int licznik = 0;

        while (a != b){
            if(a > b){
                a = a- b;
            }else{
                b = b -a;
            }
            licznik++;
        }
        System.out.println("Liczba interacji: " +licznik);
        System.out.println("NWD: " +a);
    }

}
