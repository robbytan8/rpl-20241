package com.robby.rpl.dao;

import com.robby.rpl.model.Mahasiswa;

import java.util.List;

public class MahasiswaDao {

    public List<Mahasiswa> showAllMahasiswa() {
        String query = "SELECT nrp, nama, password FROM mahasiswa";
        //  TODO execute query, fetch and change result set to List
        return null;
    }

    public int addMahasiswa(Mahasiswa mahasiswa) {
        String query = "INSERT INTO mahasiswa(nrp, nama, password) VALUES (?, ?, ?)";
        //  TODO execute query and commit data to database
        return 1;
    }
}
