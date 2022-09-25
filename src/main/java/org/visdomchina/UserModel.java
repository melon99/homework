package org.visdomchina;

public class UserModel {

    private String ID;
    private String NAME;
    public UserModel(String id, String name) {
        this.ID = id;
        this.NAME = name;
    }

    public UserModel() {

    }

    public String getID() {
        return this.ID;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public void setNAME(String name) {
        this.NAME = name;
    }

}
