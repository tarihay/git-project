package com.company;

public class Main {

    public static void main(String[] args) {
        String a = args[1].toUpperCase();
        String res = args[0];
        String res1 = res.replace(a, args[2]);

        if (res1 == res){
            a = args[1].toLowerCase();
            res1 = res.replace(a, args[2]);
        }
        System.out.println(res1);

        }
    }


