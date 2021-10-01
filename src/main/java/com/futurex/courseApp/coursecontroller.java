package com.futurex.courseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class coursecontroller {
@Autowired
    private Corurserepo courserepo;
@RequestMapping("/abc")
    public List <Courses> getcourses()
    {
        return
               courserepo.findAll()
               ;
    }


}




