package com.one;

import com.one.pojo.dto.ResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.NumberFormat;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/7/21 11:27
 * @CreateComputer by PC
 * @Created by cxd
 */
@Controller
public class Test {

    public ResponseDTO login(){
        return new ResponseDTO("200", 200, 200, 200);
    }




}
