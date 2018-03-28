package com.hypershark.ljfood.dao;

import com.hypershark.ljfood.entity.DineCell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Li on 2018/3/28.
 */
@Repository
public interface CellDao extends JpaSpecificationExecutor, JpaRepository<DineCell,Integer> {
    @Override
    List<DineCell> findAll();

    @Override
    DineCell findOne(Integer integer);
}
