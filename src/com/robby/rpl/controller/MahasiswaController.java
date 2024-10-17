package com.robby.rpl.controller;

import com.robby.rpl.dao.MahasiswaDao;
import com.robby.rpl.model.Mahasiswa;

import java.util.List;

public class MahasiswaController {

    private MahasiswaDao mahasiswaDao;

    public MahasiswaController() {
        mahasiswaDao = new MahasiswaDao();
    }

    /**
     * This method is used to show view that contains all data
     */
    public void index() {
        List<Mahasiswa> students = mahasiswaDao.showAllMahasiswa();
        //  TODO Change students to table in view
    }

    /**
     * This method is used to show form to add new data
     */
    public void create() {
        //  TODO show view
    }

    /**
     * This method is used to store data from form to database
     */
    public void store(Mahasiswa mahasiswa) {
        //  TODO validate data from form
        int result = mahasiswaDao.addMahasiswa(mahasiswa);
        //  TODO show message based on result and redirect to show all data
    }
}
