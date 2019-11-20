package io.turntabl.springbootdemo.controller;

import io.turntabl.springbootdemo.model.Number;
import io.turntabl.springbootdemo.model.Maths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @Autowired
    private Maths mathFunctions;


    @RequestMapping("/subtract")
    public Number Subtract(@RequestParam(value = "int1", defaultValue = "1") Integer int1,
                           @RequestParam(value = "int2", defaultValue = "2") Integer int2){


//        Integer result = int1 - int2;
//        Number number = new Number();
//        number.setValue(result);
//        return number;
        Integer result = mathFunctions.subtractNumbers(int1, int2);
        Number number = new Number();
        number.setValue(result);
        return number;
    }
    @RequestMapping("/add")
    public Number Add(@RequestParam(value = "int1", defaultValue = "1") Integer int1,
                           @RequestParam(value = "int2", defaultValue = "2") Integer int2){

//        Integer result = int1 + int2;
//        Number number = new Number();
//        number.setValue(result);
//        return number;
        Integer result = mathFunctions.addNumbers(int1, int2);
        Number number = new Number();
        number.setValue(result);
        return number;
    }


}
