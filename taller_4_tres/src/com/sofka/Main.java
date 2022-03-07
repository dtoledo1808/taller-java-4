package com.sofka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int cont = 0;
    public static void main(String[] args) {
        List num = new ArrayList<>();
        for(int i = 1; i<=1000; i++){
            cont = 0;
            for(int x=1; x<=i; x++){
                if(i%x==0){
                    cont ++;
                }
            }
            if(cont==2){
                num.add(i);
            }
        }
        System.out.println(num);
    }
}
