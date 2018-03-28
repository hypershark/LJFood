package com.hypershark.ljfood.dao;

import com.hypershark.ljfood.entity.DineHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author Li on 2018/3/28.
 */
@Repository
public interface HallDao extends JpaSpecificationExecutor, JpaRepository<DineHall,Integer> {
}
