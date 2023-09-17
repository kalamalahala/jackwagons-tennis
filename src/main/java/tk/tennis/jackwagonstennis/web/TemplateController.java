package tk.tennis.jackwagonstennis.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemplateController {

    @GetMapping("/")
    public String indexPage(@RequestParam(name="message", required=false, defaultValue="World") String message, Model model) {
        model.addAttribute("title", message);
        return "index";
    }
}
