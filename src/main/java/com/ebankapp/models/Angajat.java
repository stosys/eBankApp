package com.ebankapp.models;


public class Angajat {

    private String nume, prenume, rang, parola, mail;
    private int ida;
    private float salar;

    Angajat() {

    }

    Angajat(int ida, String nume, String prenume, String rang, String parola, String mail, float salar) {
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

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
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

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public float getSalar() {
        return salar;
    }

    public void setSalar(float salar) {
        this.salar = salar;
    }
}
