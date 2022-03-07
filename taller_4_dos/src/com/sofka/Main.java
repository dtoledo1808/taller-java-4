package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static int x;

    public static void main(String[] args) {
        List  pairs = new ArrayList<>();
        List odd  = new ArrayList<>();
        Random r = new Random();

        for(int i=0; i<20 ; i++){
            int x = r.nextInt(100)+1;
            if(x%2==0){
                pairs.add(x);
            }
            else{
                odd.add(x);
            }
        }
        System.out.println("Números pares "+ pairs);
        System.out.println("Números impares "+odd);

    }
}
