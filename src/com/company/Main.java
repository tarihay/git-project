package com.company;

public class Main {

    public static void main(String[] args) {
        int res = 0;
        int number = 0;
        char sign;
        for (int i = 1; i < args.length; i = i+2) {
            char[] sim = args[i].toCharArray();
            number = Integer.valueOf(sim[i]);
            sign = char.valueOf(sim[i+1]);

            if (sign == '+') {
                res = res + number;
            } else if (sign == '-') {
                res = res - number;
            } else if (sign == '*') {
                res = res * number;
            } else {
                res = res / number;
            }
            System.out.println(res);
        }
    }
}

