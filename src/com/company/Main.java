package com.company;

public class Main {

    public static void main(String[] args) {
        String a = args[1].toUpperCase(); //В строковую переменную a записываю значение 2-го элемента строкового массива args(Заглавная буква)
        String a1 = args[1].toLowerCase();//В строковую переменную a записываю значение 2-го элемента строкового массива args(Строчная буква)
        String res = args[0]; //Записываю входную строку, которую мне надо будет изменить
        String res1 = res.replace(a, args[2]);//Записываю в строковую переменную res1, измененное значение переменной res, в которой изменил заглавные буквы
        res1 = res1.replace(a1, args[2]);//Обновляю res1, заменяя строчные буквы

        System.out.println(res1);

        }
    }


