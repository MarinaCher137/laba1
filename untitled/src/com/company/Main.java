package com.company;

import java.util.Scanner;


class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.max(a, b);

        System.out.println(Math.max(c, d));


        sc.close();

    }


}