package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.WineryService;

@Controller
@RequestMapping("/winery")

public class WineryController {

    private final WineryService wineryService;

    public WineryController(WineryService wineService) {
        this.wineryService = wineService;
    }

    @GetMapping
    public String getWineryPage(Model model) {

        model.addAttribute("wineries", wineryService.findAll());
        return "winery-template";
    }
}
