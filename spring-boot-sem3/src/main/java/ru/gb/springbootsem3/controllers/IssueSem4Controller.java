package ru.gb.springbootsem3.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.springbootsem3.entity.Issue;
import ru.gb.springbootsem3.entity.Reader;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("ui")
public class IssueSem4Controller {
    ///ui/issues - на странице отображается таблица,
    // в которой есть столбцы (книга, читатель, когда взял, когда вернул (если не вернул - пустая ячейка))
    @GetMapping("issues")
    public String issues(Model model){
        List<Issue> issueList = new ArrayList<>();
        issueList.add(new Issue(0, 0));
        issueList.add(new Issue(1, 1));
        issueList.add(new Issue(2, 2));
        model.addAttribute("isssues", issueList);
        return "issues";
    }
}
