package com.masakantradisional.model;

public class MasakanTradisional {
    private String nama;
    private String khas;
    private String asal;
    private String deskripsi;
    private int drawableRes;

    public MasakanTradisional(String nama, String khas, String asal, String deskripsi, int drawableRes) {
        this.nama = nama;
        this.khas = khas;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKhas() {
        return khas;
    }

    public void setMakanan(String khas) {
        this.khas = khas;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
