package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List list = new ArrayList();
        for(int i = 0; i<5; i++){
            System.out.println("ingrese un numero");
            list.add(entrada.nextInt());
        }
        for(int i=0; i<5 ;i++){
            System.out.println("["+ i +"] = "+list.get(i));
        }

    }
}
