package com.chau.duong.tuvi;

import java.util.ArrayList;
import java.util.List;

import static com.chau.duong.tuvi.Constants.NguHanh.Hỏa;
import static com.chau.duong.tuvi.Constants.NguHanh.Kim;
import static com.chau.duong.tuvi.Constants.NguHanh.Mộc;
import static com.chau.duong.tuvi.Constants.NguHanh.Thổ;
import static com.chau.duong.tuvi.Constants.NguHanh.Thủy;

public class Cung {
    Constants.DiaChi tenCung;
    Constants.AmDuong amDuong;
    Constants.NguHanh nguHanh;
    List<Constants.CungTuVi> cungTuVis;
    List<Constants.VongTuVi> vongTuVis;
    Constants.VongTrangSinh vongTrangSinhs;
    List<Constants.VongThaiTue> vongThaiTues;
    List<Constants.VongLocTon> vongLocTons;
    List<Constants.TuHoa> tuHoas;
    List<Constants.LucSatTinh> lucSatTinhs;
    List<Constants.PhuTinh> phuTinhs;
    List<Constants.TuanTriet> tuanTriets;

    public Cung() {
        cungTuVis = new ArrayList<>();
        vongTuVis = new ArrayList<>();
        vongThaiTues = new ArrayList<>();
        vongLocTons = new ArrayList<>();
        tuHoas = new ArrayList<>();
        lucSatTinhs = new ArrayList<>();
        phuTinhs = new ArrayList<>();
        tuanTriets = new ArrayList<>();
    }

    public Constants.DiaChi getTenCung() {
        return tenCung;
    }

    public void setTenCung(Constants.DiaChi tenCung) {
        this.tenCung = tenCung;
        switch (tenCung) {
            case Tý:
                this.nguHanh = Thủy;
                break;
            case Sửu:
                this.nguHanh = Thổ;
                break;
            case Dần:
                this.nguHanh = Mộc;
                break;
            case Mão:
                this.nguHanh = Mộc;
                break;
            case Thìn:
                this.nguHanh = Thổ;
                break;
            case Tị:
                this.nguHanh = Hỏa;
                break;
            case Ngọ:
                this.nguHanh = Hỏa;
                break;
            case Mùi:
                this.nguHanh = Thổ;
                break;
            case Thân:
                nguHanh = Kim;
                break;
            case Dậu:
                nguHanh = Kim;
                break;
            case Tuất:
                this.nguHanh = Thổ;
                break;
            case Hợi:
                this.nguHanh = Thủy;
                break;
        }
    }

    public Constants.AmDuong getAmDuong() {
        return amDuong;
    }

    public void setAmDuong(Constants.AmDuong amDuong) {
        this.amDuong = amDuong;
    }

    public Constants.NguHanh getNguHanh() {
        return nguHanh;
    }

    public void setNguHanh(Constants.NguHanh nguHanh) {
        this.nguHanh = nguHanh;
    }

    public List<Constants.CungTuVi> getCungTuVis() {
        return cungTuVis;
    }

    public void setCungTuVis(List<Constants.CungTuVi> cungTuVis) {
        this.cungTuVis = cungTuVis;
    }

    public List<Constants.VongTuVi> getVongTuVis() {
        return vongTuVis;
    }

    public void setVongTuVis(List<Constants.VongTuVi> vongTuVis) {
        this.vongTuVis = vongTuVis;
    }

    public Constants.VongTrangSinh getVongTrangSinhs() {
        return vongTrangSinhs;
    }

    public void setVongTrangSinhs(Constants.VongTrangSinh vongTrangSinhs) {
        this.vongTrangSinhs = vongTrangSinhs;
    }

    public List<Constants.VongThaiTue> getVongThaiTues() {
        return vongThaiTues;
    }

    public void setVongThaiTues(List<Constants.VongThaiTue> vongThaiTues) {
        this.vongThaiTues = vongThaiTues;
    }

    public List<Constants.VongLocTon> getVongLocTons() {
        return vongLocTons;
    }

    public void setVongLocTons(List<Constants.VongLocTon> vongLocTons) {
        this.vongLocTons = vongLocTons;
    }

    public List<Constants.TuHoa> getTuHoas() {
        return tuHoas;
    }

    public void setTuHoas(List<Constants.TuHoa> tuHoas) {
        this.tuHoas = tuHoas;
    }

    public List<Constants.LucSatTinh> getLucSatTinhs() {
        return lucSatTinhs;
    }

    public void setLucSatTinhs(List<Constants.LucSatTinh> lucSatTinhs) {
        this.lucSatTinhs = lucSatTinhs;
    }

    public List<Constants.PhuTinh> getPhuTinhs() {
        return phuTinhs;
    }

    public void setPhuTinhs(List<Constants.PhuTinh> phuTinhs) {
        this.phuTinhs = phuTinhs;
    }

    public List<Constants.TuanTriet> getTuanTriets() {
        return tuanTriets;
    }

    public void setTuanTriets(List<Constants.TuanTriet> tuanTriets) {
        this.tuanTriets = tuanTriets;
    }

    @Override
    public String toString() {
        return "Cung{" +
                "tenCung=" + tenCung +
                ", amDuong=" + amDuong +
                ", nguHanh=" + nguHanh +
                ", cungTuVis=" + cungTuVis +
                ", vongTuVis=" + vongTuVis +
                ", vongTrangSinhs=" + vongTrangSinhs +
                ", vongThaiTues=" + vongThaiTues +
                ", vongLocTons=" + vongLocTons +
                ", tuHoas=" + tuHoas +
                ", lucSatTinhs=" + lucSatTinhs +
                ", phuTinhs=" + phuTinhs +
                ", tuanTriets=" + tuanTriets +
                '}';
    }
}
