package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.impl;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Co 4 cach danh dau 1 class la 1 bean
 * @Controller
 * @Repository
 * @Service
 * @Component
 */
@Service
public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien>listSinhVien = new ArrayList<>();

    public SinhVienServiceImpl() {
        // fake data
        listSinhVien.add(new SinhVien("Hangnt169","Hang",20,"Ha Noi",true));
        listSinhVien.add(new SinhVien("NguyenVV4","Hang",20,"Ha Noi",true));
        listSinhVien.add(new SinhVien("DungNA29","Hang",20,"Ha Noi",true));
    }

    @Override
    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    @Override
    public void removeSinhVien(String maSV) {
        for (SinhVien sv: listSinhVien){
            if(sv.getMaSV().equalsIgnoreCase(maSV)){
                listSinhVien.remove(sv);
                break;
            }
        }
    }

    @Override
    public void addSinhVien(SinhVien sv) {
        listSinhVien.add(sv);
    }

    @Override
    public SinhVien detailSinhVien(String maSV) {
        for (SinhVien sv: listSinhVien){
            if(sv.getMaSV().equalsIgnoreCase(maSV)){
                return  sv;
            }
        }
        return null;
    }

    @Override
    public void updateSinhVien(String maSV, SinhVien sv) {

    }
}
