package com.zhaowq.leetcode; /**
 * Created by zhaowq on 2015/6/3.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        in.nextLine();
        int []num = new int[N];
        for(int m=0;m<N;m++){
            num[m]=in.nextInt();
        }
        in.nextLine();

        for(int n=0;n<T;n++){
            int i=in.nextInt();
            int j=in.nextInt();
            int res=minServiceLane(i,j,num);
            System.out.println(res);
            in.nextLine();
        }
    }

    public static int minServiceLane(int a,int b,int s[]){
        int result=s[a];
        for(int k=a;k<b;k++){
            if(s[k]>s[k+1]) result=s[k+1];
        }
        return result;
    }
}

