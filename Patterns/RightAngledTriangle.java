package Patterns;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+"_");
            }
            System.out.println();
        }

    }
}


/*
numbers---> sout(j+" ")
SameNUmbers----> sout(i+" ")
alpahbets---. sout((char)(j+64))
alpahbets---. sout((char)(i+64))
 */