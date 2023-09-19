package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    private List<SinhVien> lists;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model) {
        lists = sinhVienService.getAll();
        model.addAttribute("list", lists);
        return "/buoi3/sinhviens";
    }

    @GetMapping("/sinh-vien/detail/{ma}")
    public String detailSinhVien(@PathVariable("ma") String ma, Model model) {
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "buoi3/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-update/{ma}")
    public String updateSinhVien(@PathVariable("ma") String ma, Model model) {
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "buoi3/update-sinh-vien";
    }

    @GetMapping("/sinh-vien/remove/{ma}")
    public String xoaSinhVien(@PathVariable("ma") String ma) {
        sinhVienService.removeSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";
    }
}
