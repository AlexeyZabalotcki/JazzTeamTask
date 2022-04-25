package zabalocki.alexey.test.task.jazz.team.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import zabalocki.alexey.test.task.jazz.team.spring.boot.service.ConversionService;

@Controller
@RequestMapping("/conversion")
public class ConversionController {
    private ConversionService conversionService;

    @Autowired
    public void setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping
    public String showPage(Model model, @RequestParam(value = "number", required = false) Long number) {
        model.addAttribute("number", number);
        return "conversion";
    }

    @PostMapping("/")
    public String conversionToString1(Model model, @RequestParam(value = "number", required = false) String number) {
        String result;
        try {
            long numericNumber = Long.parseLong(number);
            result = conversionService.conversionToString(numericNumber);
        } catch (NumberFormatException ex) {
            result = "Invalid format";
        }
        model.addAttribute("number", result);
        return "conversion";
    }

    @GetMapping("/get")
    public String conversionToString(Model model, @RequestParam(value = "number", required = false) String number) {
        String result;
        try {
            long numericNumber = Long.parseLong(number);
            result = conversionService.conversionToString(numericNumber);
        } catch (NumberFormatException ex) {
            result = "Invalid format";
        }
        model.addAttribute("number", result);
        return "conversion";
    }
}




