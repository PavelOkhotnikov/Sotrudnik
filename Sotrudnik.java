package com.company;

public class Sotrudnik {
    private String FIO;
    private String doljnost;
    private String mail;
    private String phone;
    private float zp;
    private int age;

    public Sotrudnik(String FIO, String doljnost, String mail, String phone, float zp, int age) {
        this.FIO = FIO;
        this.doljnost = doljnost;
        this.mail = mail;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String Info(){
        return String.format("Sotrudnik{FIO=%s, doljnost=%s, mail=%s, phone=%s, zp=%s, age=%s}", FIO, doljnost, mail, phone, zp, age);
    }
}
