package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.WineRepository;
import service.Impl.WineServiceImpl;
import service.WineService;

@Controller
@RequestMapping("/wine")
public class WineController {

    private final WineService wineService;

    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping
    public String getWineryPage(Model model) {

        model.addAttribute("wines", wineService.findAll());
        return "wine_template";
    }
}
