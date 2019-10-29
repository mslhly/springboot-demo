package com.msl.control;

import com.msl.great.config.ParamerConfig;
import com.msl.mybatis.entity.YpUserExample;
import com.msl.mybatis.mapper.YpUserMapper;
import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: 查询
 * @description: 用户信息查询
 * @params
 * @return:
 * @date: 2019-10-29 16:05
 * @auther: msl
*/
@Controller
@RestController
public class UserController {

    @Autowired
    ParamerConfig configTestBean;

    @Autowired
    YpUserMapper ypUserMapper;


    @GetMapping("/info")
    public ParamerConfig hexo() throws UnsupportedEncodingException {
        YpUserExample userExample = new YpUserExample();
        int count = ypUserMapper.countByExample(userExample);
        ParamerConfig result  =new ParamerConfig();
        result.setName(configTestBean.getName());
        result.setWant(configTestBean.getWant()+" ---"+count);
        return  result;
    }


}


