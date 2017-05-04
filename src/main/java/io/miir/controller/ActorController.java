package io.miir.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nicolas on 18/04/2017.
 */
@RestController
@RequestMapping("/test")
public class ActorController {

    @RequestMapping(value = "/bonjour", method = RequestMethod.GET)
    public String test(){
        return "This is my very personnal test hahah";
    }
}
