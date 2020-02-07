package com.gaurav.gcd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
    public String[] input() throws IOException {
        FileReader fin = new FileReader("input.txt");
        BufferedReader bf = new BufferedReader(fin);
        String str[] = bf.readLine().split(" ");
        return str;
    }
}
