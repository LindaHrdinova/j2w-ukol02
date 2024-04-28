package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView citaty() {
        ModelAndView result = new ModelAndView("citatyTemplate");
        LocalDate aktualniDatum = LocalDate.now();
        result.addObject("citaty", aktualniDatum);

        return result;
    }
}
