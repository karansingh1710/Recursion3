package Recursion;

import java.util.Scanner;

public class SUMMN {
    static int FirstNSum(int n){
        int ans = 0;
        if(n == 1){
            ans++;
            return ans;
        }
        ans += n + FirstNSum(n-1);
        return ans;
    }
    static int SumMN(int n,int m){
        if (m==1){
          return   FirstNSum(n);
        }
        int sum=SumMN(n,m-1);
        return FirstNSum(sum);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(SumMN(m,n));
    }
}
