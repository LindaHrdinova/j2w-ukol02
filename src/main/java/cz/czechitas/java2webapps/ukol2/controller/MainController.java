package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Random;

@Controller
public class MainController {

    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView citaty() {

        String[] nahodnyCitat = {
                "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
                "A user interface is like a joke. If you have to explain it, it's not that good.",
                "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
                "I have a joke on programming but it only works on my computer.",
                "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
                "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
                "Programmer (noun.): A machine that turns coffee into code.",
                "Real programmers count from 0."};

        int nahodneCislo = random.nextInt(0, nahodnyCitat.length);
        String nahodnyObrazek = "";
        switch (nahodneCislo) {
            case 1:
                nahodnyObrazek = "YQlNLVYckRk";
                break;
            case 2:
                nahodnyObrazek = "LEpfefQf4rU";
                break;
            case 3:
                nahodnyObrazek = "NodtnCsLdTE";
                break;
            case 4:
                nahodnyObrazek = "cWOzOnSoh6Q";
                break;
            case 5:
                nahodnyObrazek = "nPUb9q-Ibko";
                break;
            case 6:
                nahodnyObrazek = "9UUoGaaHtNE";
                break;
            case 7:
                nahodnyObrazek = "IbPxGLgJiMI";
                break;
            case 0:
                nahodnyObrazek = "eMzblc6JmXM";
                break;
        }

        ModelAndView result = new ModelAndView("citatyTemplate");
        result.addObject("nahodnyCitat", nahodnyCitat[nahodneCislo]);
        result.addObject("nahodnyObrazek", nahodnyObrazek);
        return result;
    }
}
