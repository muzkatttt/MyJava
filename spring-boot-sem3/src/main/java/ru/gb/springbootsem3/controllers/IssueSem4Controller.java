package ru.gb.springbootsem3.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.springbootsem3.entity.Book;
import ru.gb.springbootsem3.entity.Reader;
import ru.gb.springbootsem3.services.IssueService;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("ui")
public class IssueSem4Controller {
    ///ui/issues - на странице отображается таблица,
    // в которой есть столбцы (книга, читатель, когда взял, когда вернул (если не вернул - пустая ячейка))

   private IssueService issueService;

    @GetMapping("issues")
    public String issues(Model model){
        List<Object> issueList = new ArrayList<>();
        issueList.add(new Book("Titanic"));
        issueList.add(new Reader("Vi"));
        issueList.add("01.01.2024");
        issueList.add("null");
        model.addAttribute("issues", issueList);
        return "issues";

    }
}
