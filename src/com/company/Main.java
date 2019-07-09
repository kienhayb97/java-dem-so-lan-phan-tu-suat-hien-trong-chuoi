package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String array = "mot ngay dep troi";
        char nhap;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu muon dem");
        nhap = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < array.length(); i++) {
            if (nhap == array.charAt(i)) {
                count++;
            }
        }
        System.out.println("so phan tu" + nhap + "la: " + count);
    }
}
