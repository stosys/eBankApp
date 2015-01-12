package com.ebankapp.models;


public class Angajat {

    private String nume, prenume,parola, mail;
    private long ida ;
    private double salar;
    private int rang;

    public Angajat() {

    }

    Angajat(long ida, String nume, String prenume, int rang, String parola, String mail, double salar) {
        this.ida = ida;
        this.nume = nume;
        this.prenume = prenume;
        this.rang = rang;
        this.parola = parola;
        this.mail = mail;
        this.salar = salar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getIda() {
        return ida;
    }

    public void setIda(long ida) {
        this.ida = ida;
    }

    public double getSalar() {
        return salar;
    }

    public void setSalar(double salar) {
        this.salar = salar;
    }
}
