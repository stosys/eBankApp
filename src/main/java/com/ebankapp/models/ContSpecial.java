package com.ebankapp.models;


public class ContSpecial {

    private long idcs;
    private String nrCont, numeFirma, adresa, tel, mail;
    private double sold;

    public long  getIdcs() {
        return idcs;
    }

    public void setIdcs(long idcs) {
        this.idcs = idcs;
    }

    public String getNrCont() {
        return nrCont;
    }

    public void setNrCont(String nrCont) {
        this.nrCont = nrCont;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
