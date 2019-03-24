package com.cloud;

import com.cloud.param.UserParam;

/**
 * Created by Layne on 2018-8-30.
 */
//@Component
public class HiHystric implements HiService {
    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }

    @Override
    public UserParam save(UserParam param) {
        param.setSex("0");
        return param;
    }
}
