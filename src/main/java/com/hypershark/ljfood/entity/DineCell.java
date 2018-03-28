package com.hypershark.ljfood.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Li on 2018/3/28.
 */
@Data
@Entity
@Table(name = "ljfood_dineCell")
public class DineCell implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String phone;

    private String contactMan;

    /**
     * 编号
     */
    private String num;

    private String imgPath;

    @ManyToOne
    @JoinColumn(nullable = false,name = "dinehall_id")
    private DineHall dineHall;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ljfood_cell_dish",
            joinColumns = {@JoinColumn(name = "cell_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name="dish_id",referencedColumnName = "id")})
    private Set<Dish> dishes = new HashSet<Dish>();

}
