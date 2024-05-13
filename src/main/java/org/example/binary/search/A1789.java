package org.example.binary.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1789 {
    public static void main(String[] args) throws IOException {
        //백준1789 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());

        int n = 1;
        while(true) {
            if (s >= n) {
                s -= n;
            } else {
                break;
            }
            n++;
        }
        System.out.println(n-1);
    }
}