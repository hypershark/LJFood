package com.hypershark.ljfood.controller.base;

import com.hypershark.ljfood.dto.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Li on 2018/3/29.
 */
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected ResponseResult myProcessor(ResultProcessor processor){
        ResponseResult result = null;
        try {
            result = processor.process();
        }catch (Exception e){
            logger.error(e.getLocalizedMessage(),e);
            result = ResponseResult.error(e.getMessage());
        }
        return result;
    }

}
