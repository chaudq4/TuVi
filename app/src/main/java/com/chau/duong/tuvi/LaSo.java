package com.chau.duong.tuvi;

import java.util.ArrayList;
import java.util.List;

public class LaSo {
    private int ngaySinh, thangSinh;
    private Constants.DiaChi gioSinh, namSinh;
    private Constants.NamNu gioiTinh;
    private List<Cung> cungList;

    public LaSo() {
    }

    public LaSo( Constants.DiaChi gioSinh,int ngaySinh, int thangSinh, Constants.DiaChi namSinh, Constants.NamNu gioiTinh) {
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.gioSinh = gioSinh;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        cungList = new ArrayList<>();
    }
    public void init(){
        cungList.add(new Cung());
        for(int i=1;i<=12;i++){
            Cung cung= new Cung();
            cung.setTenCung(Constants.DiaChi.values()[i]);
            cung.setAmDuong(Constants.AmDuong.values()[i%2==1?1:0]);
            cungList.add(cung);

        }
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getThangSinh() {
        return thangSinh;
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }

    public Constants.DiaChi getGioSinh() {
        return gioSinh;
    }

    public void setGioSinh(Constants.DiaChi gioSinh) {
        this.gioSinh = gioSinh;
    }

    public Constants.DiaChi getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Constants.DiaChi namSinh) {
        this.namSinh = namSinh;
    }

    public Constants.NamNu getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Constants.NamNu gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public List<Cung> getCungList() {
        return cungList;
    }

    public void setCungList(List<Cung> cungList) {
        this.cungList = cungList;
    }

    @Override
    public String toString() {
        return "LaSo{" +
                "ngaySinh=" + ngaySinh +
                ", thangSinh=" + thangSinh +
                ", gioSinh=" + gioSinh +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + gioiTinh +
                ", cungList=" + cungList +
                '}';
    }
}
