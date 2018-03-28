package com.hypershark.ljfood.dao;

import com.hypershark.ljfood.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Li on 2018/3/28.
 */
@Repository
public interface DishDao extends JpaSpecificationExecutor, JpaRepository<Dish,Integer> {


    @Override
    Dish findOne(Integer integer);

    @Override
    List<Dish> findAll();
}
