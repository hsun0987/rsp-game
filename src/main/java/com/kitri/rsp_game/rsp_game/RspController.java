package com.kitri.rsp_game.rsp_game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rsp")
public class RspController {
    @GetMapping
    public String home() {
        return "/rsp_game/rsp";
    }
}