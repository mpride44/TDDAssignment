package com.gaurav.gcd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class GCDoftwonumber {
    private static FileInput fin;
    public void setFin(FileInput fin) {
        this.fin = fin;
    }
    public int fun() throws IOException{
        String[] str=fin.input();

        try {
            return gcdCalculation(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }
        catch (Exception e){
            System.out.println("erro " + e.getMessage());
            return 0;
        }
    }
//    public static void main(String[] args) throws IOException {
//        String[] str=fin.input();
//        System.out.println();
//    }

    public static int gcdCalculation(int x,int y){
        if(x<0 || y<0)
            return -1;
        if(x==0)
            return y;
        return gcdCalculation(y%x,x);
    }

}
