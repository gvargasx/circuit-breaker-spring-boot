package com.example.springbootcircuitbreaker;

import com.example.springbootcircuitbreaker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class ReadingController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/to-read")
    public Mono<String> toRead() {
        return bookService.readingList();
    }

    public static void main(String[] args) {
        SpringApplication.run(ReadingController.class, args);
    }
}
