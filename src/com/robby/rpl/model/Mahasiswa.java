package com.robby.rpl.model;

public class Mahasiswa {

    private String nrp;
    private String nama;
    private String password;
    private Dosen dosenWali;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama, String password, Dosen dosenWali) {
        this.nrp = nrp;
        this.nama = nama;
        this.password = password;
        this.dosenWali = dosenWali;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
}
