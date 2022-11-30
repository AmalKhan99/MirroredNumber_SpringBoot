package com.amal.MirroredNumber_SpringBoot.Controller;
import javax.servlet.http.HttpServletRequest;

import com.amal.MirroredNumber_SpringBoot.Service.MirroredNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class MirroredNumberController {

        @Autowired
        private MirroredNumService mirroredNumService;

        @RequestMapping("/")
        public ModelAndView mainPageController() {
            return new ModelAndView("index");
        }

        @RequestMapping("/check")
        public ModelAndView MirroredNumberController(HttpServletRequest request) {
            ModelAndView modelAndView=new ModelAndView();
            //request.getParameter() will return String
            int num=Integer.parseInt(request.getParameter("number"));

            boolean MirroredNumber=mirroredNumService.checkPalindrome(num);

            modelAndView.addObject("fact", MirroredNumber);

            modelAndView.setViewName("Output");

            return modelAndView;

        }
    }
