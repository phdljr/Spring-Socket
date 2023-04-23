package kr.ac.project.chatingsocket.controller;

import kr.ac.project.chatingsocket.dto.HelloRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/hello")
    public void hello(HelloRecord helloDto) {
        log.info("{} {}", helloDto.name(), helloDto.number());
    }
}
