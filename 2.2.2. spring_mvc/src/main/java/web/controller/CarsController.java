package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServise;


@Controller
@RequestMapping("/cars")

public class CarsController {
    @Autowired
    CarServise carServise;

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) int count, ModelMap modelMap) {
        modelMap.addAttribute("carList", carServise.getCars(count));
        return "cars";
    }
}
