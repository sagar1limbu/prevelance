package com.privilance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by reddevil on 3/20/2017.
 */

@Controller
public class ListController {

    @RequestMapping(value = "/listEligible")
    public String listEligible(){

        return  null;
    }

}
