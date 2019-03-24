package com.cloud.api;

import com.cloud.param.UserParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Layne on 2018-9-11.
 */
@RequestMapping("service-hi")
public interface HiService {
    @RequestMapping("hi")
    String sayHi(@RequestParam("name") String name);

    @RequestMapping("save")
    UserParam save(UserParam param);
}
