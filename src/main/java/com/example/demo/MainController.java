package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Стереотипная аннотация @Controller говорит, что класс контроллера Spring MVC
public class MainController {

    @RequestMapping("/home") // аннотация привязывает действие
            // к пути /home, который содержится в HTTP-запросе
    public String home() {
        return "home.html"; // строка с именем документа,
            // который приложение будет возвращать в ответ на запрос
    }
}
