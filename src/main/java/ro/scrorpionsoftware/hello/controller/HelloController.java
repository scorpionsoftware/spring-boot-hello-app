package ro.scrorpionsoftware.hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.scrorpionsoftware.hello.controller.dto.HelloMessage;

@RestController
public class HelloController {

    @RequestMapping({"/hello", "/hello/{name}"})
    public ResponseEntity<HelloMessage> hello(@PathVariable(required = false) String name) {
        HelloMessage helloMessage = new HelloMessage("Hello, " + (name != null ? name : "stranger") + "!");
        return new ResponseEntity<>(helloMessage, HttpStatus.OK);
    }

}
