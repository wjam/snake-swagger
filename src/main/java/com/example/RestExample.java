package com.example;

import com.wordnik.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/example")
@Api(value = "example")
public class RestExample {

    @RequestMapping(method = RequestMethod.POST)
    public ExampleObject example(@RequestBody final ExampleObject o) {
        if (o.getFirstOne() == null) {
            throw new RuntimeException("No value set");
        }
        final ExampleObject example = new ExampleObject();
        example.setFirstOne("example value");
        return example;
    }

}
