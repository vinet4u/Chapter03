package com.jvision.admin.web;
import com.jvision.admin.web.dto.HelloResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/Hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/Hello2")
    public String hello2()
    {
        return "hello";
    }

    @GetMapping("/HelloDTO")
    public HelloResponseDTO helloDTO(@RequestParam("name") String name, @RequestParam("amount") int amount)
    {
        return new HelloResponseDTO(name, amount);
    }
}
