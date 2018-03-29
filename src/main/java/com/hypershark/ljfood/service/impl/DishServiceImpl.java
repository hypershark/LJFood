package com.hypershark.ljfood.service.impl;

import com.hypershark.ljfood.dao.DishDao;
import com.hypershark.ljfood.entity.Dish;
import com.hypershark.ljfood.service.DishService;
import com.hypershark.ljfood.service.base.BaseServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Li on 2018/3/29.
 */
@Service
public class DishServiceImpl extends BaseServiceImpl<DishDao,Dish> implements DishService{




    @Override
    public Page<Dish> getDishByPage(String search, int pageNo, int length) {
        List<Sort.Order> orders = new ArrayList<>();
        orders.add(new Sort.Order(Sort.Direction.DESC, "id"));
        Sort sort = new Sort(orders);
        PageRequest pageable = new PageRequest(pageNo, length, sort);

        Specification<Dish> specification = new Specification<Dish>() {
            @Override
            public Predicate toPredicate(Root<Dish> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<String> $name = root.get("name");
                ArrayList<Predicate> list = new ArrayList<>();
                if (search != null && search != "") {
                    list.add(criteriaBuilder.like($name, "%" + search + "%"));
                }

                Predicate predicate = criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
                return predicate;
            }
        };
        Page<Dish> page = repository.findAll(specification,pageable);
        return page;
    }
}
