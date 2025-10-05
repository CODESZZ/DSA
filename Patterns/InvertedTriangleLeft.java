package Patterns;

import java.util.Scanner;

public class InvertedTriangleLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}

/*
i+j=n+1
j=n+1-i
j(max value)=n+1-i
 */