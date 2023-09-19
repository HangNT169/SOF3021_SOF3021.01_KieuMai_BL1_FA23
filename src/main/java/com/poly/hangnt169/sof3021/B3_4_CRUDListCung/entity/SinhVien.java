package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SinhVien {

    private String maSV;

    private String ten;

    private int tuoi;

    private String diaChi;

    private boolean gioiTinh;

}

