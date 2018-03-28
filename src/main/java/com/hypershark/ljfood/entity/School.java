package com.hypershark.ljfood.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * 学校
 * @author Li on 2018/3/28.
 */

@Data
@Entity
@Table(name = "ljfood_school")
public class School implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

}
