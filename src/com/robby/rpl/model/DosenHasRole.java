package com.robby.rpl.model;

public class DosenHasRole {

    private Dosen dosen;
    private Role role;

    public DosenHasRole() {
    }

    public DosenHasRole(Dosen dosen, Role role) {
        this.dosen = dosen;
        this.role = role;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
