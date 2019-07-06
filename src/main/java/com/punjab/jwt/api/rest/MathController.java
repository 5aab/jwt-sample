package com.punjab.jwt.api.rest;

import com.punjab.jwt.application.MathServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@AllArgsConstructor
public class MathController {

    private MathServiceImpl mathService;

    @PostMapping("/add/two/numbers")
    @ResponseBody
    public Integer addTwoNumbers(@RequestBody Integer[] numbers) throws Exception {
        return mathService.add(numbers[0],numbers[1]);
    }

}
