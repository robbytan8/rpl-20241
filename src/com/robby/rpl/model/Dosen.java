package com.robby.rpl.model;

public class Dosen {

    private String nik;
    private String nama;
    private String password;

    public Dosen() {
    }

    public Dosen(String id, String nama, String password) {
        this.nik = id;
        this.nama = nama;
        this.password = password;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
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
}
