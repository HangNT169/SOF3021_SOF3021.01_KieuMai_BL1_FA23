package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SinhVien1Controller {

    @Autowired
    private SinhVienService service;

    @GetMapping("/test1")
    public List<SinhVien>getAll(){
        return service.getAll();
    }
}
