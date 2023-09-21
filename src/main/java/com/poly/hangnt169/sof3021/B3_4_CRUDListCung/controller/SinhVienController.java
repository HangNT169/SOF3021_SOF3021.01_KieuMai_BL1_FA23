package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/sinh-vien/view-add")
    public String viewAdd() {
        return "buoi3/add-sinh-vien";
    }

    @PostMapping("/sinh-vien/add")
    public String addSinhVien(@RequestParam("mssv") String mssv,
                              @RequestParam("ten") String ten1,
                              @RequestParam("tuoi") String tuoi,
                              @RequestParam("diaChi") String diaChi,
                              @RequestParam("gioiTinh") String gioiTinh) {
        // B1: Khoi tao doi tuong
        SinhVien sv = SinhVien.builder()
                .ten(ten1)
                .maSV(mssv)
                .tuoi(Integer.valueOf(tuoi))
                .diaChi(diaChi)
                .gioiTinh(Boolean.valueOf(gioiTinh))
                .build();
        // B2: Goi add trong service
        sinhVienService.addSinhVien(sv);
        // B3: Quay lai trang chu
        return "redirect:/sinh-vien/hien-thi";
    }

    /**
     * Spring form , spring validation
     */

    @GetMapping("/test")
    @ResponseBody // Trong controller bat buoc phai danh dau @responsebody
    // 1 api => 1 json(mac dinh), xml
    public List<SinhVien> getAll() {
        return sinhVienService.getAll();
    }
}
