package com.luoru.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.luoru.pojo.User;
import com.luoru.service.impl.UserServiceImpl;
import com.luoru.utils.JWTUtil;
import com.luoru.utils.ResponseMsg;
import com.luoru.utils.SendSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Luoru
 * @Date: 2019/12/12 22:36
 * @Description: 用户信息Controller接口
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(path = "/login")
    public Map login(@RequestBody User user) {
        String jwt = JWTUtil.creatJwt(user.getUserPhone(), user.getUserPassword());
        User loginUser = userService.userLogin(user);
        if(loginUser!=null){
            Map<String,Object> map = new HashMap<>();
            map.put("user",loginUser);
            map.put("jwt",jwt);
            return map;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(path = "/code")
    public ResponseMsg getCode(@RequestBody String phone) {
        //JSON解析出手机号码
        JSONObject jsonObject = JSON.parseObject(phone);
        String phoneNumbers = (String) jsonObject.get("phoneNumbers");
        //发送验证码
        ResponseMsg responseMsg = userService.sendMsgCode(phoneNumbers);
        return responseMsg;
    }

    @ResponseBody
    @RequestMapping(path = "/register")
    public User register(@RequestBody Map<String, Object> map) {
        String code = (String) map.get("code");
        String userStr = JSONObject.toJSONString(map.get("user"));
        User user = JSON.parseObject(userStr, User.class);
        return userService.registerUser(user, code);
    }
}
