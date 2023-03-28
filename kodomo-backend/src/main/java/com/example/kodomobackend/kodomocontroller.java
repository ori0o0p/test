package com.example.kodomobackend;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController
public class kodomocontroller {

    private final kodomorepo kodomorepo;

    public kodomocontroller(com.example.kodomobackend.kodomorepo kodomorepo) {
        this.kodomorepo = kodomorepo;
    }

    @GetMapping
    public String hi() {
        return "Hello World!";
    }

    @GetMapping("/add")
    public Integer add(@RequestParam("x") Integer x,
                       @RequestParam("y") Integer y) {
        return x+y;
    }

    @GetMapping("/sub")
    public Integer sub(@RequestParam("x") Integer x,
                       @RequestParam("y") Integer y) {
        return x-y;
    }

    @PostMapping("/feed")
    public void creareFeed(@RequestBody Feedreq feedRequest){
        kodomorepo.createFeed((feedRequest));
    }

    @GetMapping("/feed/{feed-id}")
    public Feed getFeed(@PathVariable("feed-id")Integer feedid) {
        return kodomorepo.getFeed(feedid);
    }
}