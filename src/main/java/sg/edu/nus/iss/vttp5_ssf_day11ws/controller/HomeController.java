package sg.edu.nus.iss.vttp5_ssf_day11ws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {
    
    // @ResponseBody
    @GetMapping("/allIndex")
    // @RequestMapping(path = "/index", method=RequestMethod.GET)
    
    public String home() {
            return "index";
        
    }
}
