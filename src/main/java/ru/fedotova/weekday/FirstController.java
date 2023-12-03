package ru.fedotova.weekday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    public enum weekDay{Monday, Tyesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    @GetMapping("/weekDay")
    public String weekDay(@RequestParam(value = "name",defaultValue = "лучший день") weekDay name,
                          String namerus){
        switch (name){
            case Monday: namerus = "Понедельник";
            break;
            case Tyesday: namerus = "Вторник";
                break;
            case Wednesday: namerus = "Среда";
                break;
            case Thursday: namerus = "Четверг";
                break;
            case Friday: namerus = "Пятница";
                break;
            case Saturday: namerus = "Суббота";
                break;
            case Sunday: namerus = "Воскресение";
                break;
        }
        return String.format("Сегодня %s!", namerus);
    }
}
