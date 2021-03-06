package com.building.management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONG_TY")
public class Company {
    @Id
    private String MA_CT;
    private String TEN_CT;
    private String MST;
    private String LINH_VUC;
    private String DIA_CHI;
    private String SDT;
    private int SO_NV;
    private float DIEN_TICH;
}
