package com.example.testselect.model;

public class Selectform {
    private String selectid;

    public Selectform(String selectid) {
        this.selectid = selectid;
    }

    @Override
    public String toString() {
        return "Selectform{" +
                "selectid='" + selectid + '\'' +
                '}';
    }

    public String getSelectid() {
        return selectid;
    }

    public void setSelectid(String selectid) {
        this.selectid = selectid;
    }
}
