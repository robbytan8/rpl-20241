package com.robby.rpl.model;

public class Jadwal {

    private Dosen dosen;
    private MataKuliah mataKuliah;
    private Periode periode;

    public Jadwal() {
    }

    public Jadwal(Dosen dosen, MataKuliah mataKuliah, Periode periode) {
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
        this.periode = periode;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Periode getPeriode() {
        return periode;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }
}
