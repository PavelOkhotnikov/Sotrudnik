package com.company;

public class Main {
    public static void main(String[] args) {
        Sotrudnik [] sotrudnik = {
                new Sotrudnik("Семёнов Семён Семёнович", "Электрик", "SSS@mail.ru", "111-11-11", 35000, 40),
                new Sotrudnik("Петров Пётр Петрович", "Сантехник", "PPP@mail.ru", "222-22-22", 45000, 42),
                new Sotrudnik("Васильев Василий Васильевич", "Инженер", "VVV@mail.ru", "333-33-33", 15000, 26),
                new Sotrudnik("Андреев Андрей Андреевич", "Охранник", "AAA@mail.ru", "444-44-44", 55000, 36),
                new Sotrudnik("Александров Сан Саныч", "Свой человек", "GoodBoy777@mail.ru", "777-77-77", 100000, 63),
        };
        for (int i = 0; i < sotrudnik.length ; i++) {
            if(sotrudnik[i].getAge()>=40){
            System.out.println(sotrudnik[i].Info());
        }
    }
}}
