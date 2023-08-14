package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Стереотипная аннотация @Controller говорит, что класс контроллера Spring MVC
public class MainController {

    @RequestMapping("/home") // аннотация привязывает действие
            // к пути /home, который содержится в HTTP-запросе
    public String home(Model page) { // в параметре типа Model хранятся
            // данные, передаваемые контроллером в представление
        // Добавим данные, которые контроллер должен отправить в представление
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");
        return "home.html"; // строка с именем представления,
            // которое затем будет преобразовано в HTTP-ответ
    }
}
