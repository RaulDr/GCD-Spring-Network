package com.dragoiu.gdcspringnetwork.Util;

public class Gdc {

    public static int gdc(int a, int b){
        while (a != b)
        if (a > b) {
            a = a - b;
        }
        else {
            b = b - a;
        }
        return a;
    }
}
