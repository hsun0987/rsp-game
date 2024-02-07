package com.kitri.rsp_game.rsp_game;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rsp")
public class RspApiController {
    int win_count = 0;
    int lose_count = 0;
    int draw_count = 0;
    @PostMapping
    public int[] game(@RequestBody Rsp rsp){
        if(rsp.getYou().equals("rock")){
            if(rsp.getComputer().equals("scissors"))
                win_count++;
            else if(rsp.getComputer().equals("paper"))
                lose_count++;
            else
                draw_count++;
        } else if (rsp.getYou().equals("scissors")) {
            if(rsp.getComputer().equals("paper"))
                win_count++;
            else if(rsp.getComputer().equals("rock"))
                lose_count++;
            else
                draw_count++;
        }else if (rsp.getYou().equals("paper")){
            if(rsp.getComputer().equals("rock"))
                win_count++;
            else if(rsp.getComputer().equals("scissors"))
                lose_count++;
            else
                draw_count++;
        }

        int[] counts = new int[]{win_count, lose_count, draw_count};
        return counts;
    }
}
