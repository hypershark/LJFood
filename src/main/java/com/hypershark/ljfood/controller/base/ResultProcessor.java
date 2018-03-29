package com.hypershark.ljfood.controller.base;

import com.hypershark.ljfood.dto.ResponseResult;

/**
 * @author Li on 2018/3/29.
 */
@FunctionalInterface
public interface ResultProcessor {
    ResponseResult process();
}
