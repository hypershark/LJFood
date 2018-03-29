package com.hypershark.ljfood.service;

import com.hypershark.ljfood.entity.Dish;
import javafx.geometry.Pos;
import org.springframework.data.domain.Page;

/**
 * @author Li on 2018/3/29.
 */
public interface DishService {

    Page<Dish> getDishByPage(String search,int pageNo,int length);
}
