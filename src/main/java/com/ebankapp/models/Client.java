package com.ebankapp.models;


public class Client {

    private String id, mail, pass;
    private long idc, bcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getIdc() {
        return idc;
    }

    public void setIdc(long idc) {
        this.idc = idc;
    }

    public long getBcode() {
        return bcode;
    }

    public void setBcode(long bcode) {
        this.bcode = bcode;
    }
}
