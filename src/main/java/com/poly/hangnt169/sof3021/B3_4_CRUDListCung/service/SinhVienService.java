package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien>getAll();

    void removeSinhVien(String maSV);

    void addSinhVien(SinhVien sv);

    SinhVien detailSinhVien(String maSV);

    void updateSinhVien(String maSV,SinhVien sv);

}
