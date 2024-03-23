package ru.gb.springbootlesson4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("home")
    public String home(@RequestParam(required = false) String name, Model model){
        if (name != null) {
            model.addAttribute("name", name);
        } else {
            model.addAttribute("name", "world");
        }
        return "home";
    }

    @GetMapping("list/{count}")
    public String list(Model model, @PathVariable int count){
        List<String> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            list.add("item #" + i);
        }
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("table")
    public String table(Model model){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Кирилл", "Иванов", 10));
        list.add(new Person("Семен", "Смирнов", 11));
        list.add(new Person("Павел", "Петечкин", 12));
        model.addAttribute("table", list);
        return "table";
    }
}
