package com.poly.hangnt169.sof3021.B2_XuLyForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @PostMapping("/ket-qua")
    public String hienThiKetQua(@RequestParam("uname") String username,
                                @RequestParam("psw") String password,
                                Model model){
        /**
         * Muon lay gia tri jsp :
         *  J4: getParametr
         *  J5: RequestParam => chi lay duoc gia tri String/int...
         */
        model.addAttribute("t1",username);
        model.addAttribute("t2",password);
        return "ket-qua";
    }
}
