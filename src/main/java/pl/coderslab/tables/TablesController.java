package pl.coderslab.tables;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class TablesController{

    private TablesService tablesService;



//    @GetMapping("/")
//    public String addName(Model model) {
//        model.addAttribute("table", new Tables());
//        return "tables";
//    }
//
//
//    @PostMapping("/add")
//    public String addReservation(@ModelAttribute Tables tables, BindingResult result) {
//        if (result.hasErrors()) {
//            return "tables";
//        }
//        tablesService.saveReservation(tables);
//        return "redirect:list";
//    }


}