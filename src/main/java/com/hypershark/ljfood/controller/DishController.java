package com.hypershark.ljfood.controller;

import com.hypershark.ljfood.controller.base.BaseController;
import com.hypershark.ljfood.dto.ResponseResult;
import com.hypershark.ljfood.entity.Dish;
import com.hypershark.ljfood.service.DishService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author Li on 2018/3/2.
 */
@Api(value = "菜的接口", description = "得到菜")
@RestController
@RequestMapping("/dish")
public class DishController extends BaseController {

    @Autowired
    DishService dishService;

    @ApiOperation("根据条件查询菜")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "search", value = "查询条件", dataType = "String"),
            @ApiImplicitParam(name = "pageNo", value = "页码[从1开始]", dataType = "Integer"),
            @ApiImplicitParam(name = "length", value = "返回结果数量[默认20]", dataType = "Integer")
    })
    @GetMapping()
    public ResponseResult checkUserName(
            @RequestParam(required = false, defaultValue = "") String search,
            @RequestParam(required = false, defaultValue = "1") Integer pageNo,
            @RequestParam(required = false, defaultValue = "15") Integer length) {
        ResponseResult result = myProcessor(() -> {
            Page<Dish> page = dishService.getDishByPage(search, pageNo - 1, length);
            return ResponseResult.ok(page.getContent(), page.getTotalPages(), page.getNumberOfElements());
        });
        return result;
    }
}
