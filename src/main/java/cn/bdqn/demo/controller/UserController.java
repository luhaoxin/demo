package cn.bdqn.demo.controller;


import cn.bdqn.demo.entity.User;
import cn.bdqn.demo.service.IUserService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fuhao
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService IUserService;

    @RequestMapping("/cha")
    public  String select(){
        List<User> list=IUserService.findUserAll();

        return JSONArray.toJSONString(list);
    }
}
