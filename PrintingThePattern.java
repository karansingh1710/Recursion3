package Recursion;

import java.util.Scanner;

public class PrintingThePattern {

    static void Print(int n, int m, boolean flag){
        System.out.print(m+" ");
//  If we are moving back towards n and we have reached there then we are done
        if (!flag &&n==m) return;
//        If we are moving towards 0 and negative
        if (flag){//If m is greater than 5,recur with true flag else recur with false flag
            Print(n,m-5, m - 5 > 0);
        }
        else {//If flag false
            Print(n,m+5,false);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Print(N,N,true);
    }
}
