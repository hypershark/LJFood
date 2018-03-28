package com.hypershark.ljfood.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 餐厅
 * @author Li on 2018/3/28.
 */
@Data
@Entity
@Table(name = "ljfood_dineHall")
public class DineHall implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(nullable = false,name = "shcool_id")
    private School school;

    private String area;



}
