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
@Table(name = "ljfood_dish")
public class Dish implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    /**
     * 0--晕
     * 1--素
     */
    private Integer hunOrSu;

    private Integer price;

    private String evaluate;

    private String imgPath;


    private Integer taste;

    /**
     * 0---菜
     * 1---米
     * 2---面
     * 3---汤
     * 4---其他
     */
    private Integer sort;

    /**
     * 喜欢的人数
     */
    private Integer likedNum;

    @JsonIgnore
    @ManyToMany(mappedBy = "dishes")
    private Set<DineCell> cells = new HashSet<DineCell>();

}
