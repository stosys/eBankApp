package com.ebankapp.models;

import java.util.Date;


public class Cont {

    private String bcode, nrCont, nrCard, nume, prenume, cnp, ci, domiciliu, mail, telefon;
    private Date dataCr;
    private int tip;
    private double sold;

    public Cont() {}

    public long getIdc() {
        return idc;
    }

    public void setIdc(long idc) {
        this.idc = idc;
    }

    private long idc;

    public String getNrCont() {
        return nrCont;
    }

    public void setNrCont(String nrCont) {
        this.nrCont = nrCont;
    }

    public String getNrCard() {
        return nrCard;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getDataCr() {
        return dataCr;
    }

    public void setDataCr(Date dataCr) {
        this.dataCr = dataCr;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}

