package com.poly.hangnt169.sof3021.B1_OverviewSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/**
 * Spring Boot nhận tất cả các class nằm trong com và được đánh dấu
 * bởi các anotaion @Controller,@RestController,@Component...
 * Là 1 BEAN
 * TẦNG CONTROLLER Là tầng trao đổi giữa CLIENT(FE) với Server(BE)
 * thông qua phương HTTP.
 * Có 4 loại HTTP method cơ bản :
 *   - Get: Read => hiển thi, đọc dữ liệu
 *   - Post: Create => Add thêm dữ liệu
 *   - Put: Update => Update
 *   - Delete: Delete => Xoá
 *   Có 2 loại mô hình:
 *      - monolithic => Dự án vừa , nhỏ (BE + FE) => Chung 1 project
 *      - microservice => Dự án lớn => Phân tách theo module
 *  Controller có 2 loại:
 *      - @Controller => Mô hình MVC => LUÔN LUÔN RETURN 1 STRING
 *      - @RestController => Mô hình 3 layer/microservice => Trả ra API
 * => Trong J5: @Controller  chỉ sử dụng được 2 http method : Get/Post
 *      + Get: hiển thị
 *      + Post: xử lý
 * => Còn lại học J6 => RestController => J6
 */
public class DemoController {

    // Tat ca cac ham deu return 1 String (Return 1 View)
    @GetMapping("/a")
    public String demo(Model model){
        // Truyen gia tri servlet(controller) => jsp
        //  J4: setAttribute(ten bien, giatri => 1 list, 1 object, 1string...)
        //  J5: Model => ui : addAttribute
        model.addAttribute("t1","Ahihi");

        return "a";
    }
}
