package com.cloud;

import com.cloud.param.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Layne on 2018-8-30.
 */
@RestController
public class HiController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    private HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHi( name );
    }

    @RequestMapping("save")
    public UserParam save(@RequestBody UserParam param){
        System.out.println(param);
        return hiService.save(param);
    }
}
