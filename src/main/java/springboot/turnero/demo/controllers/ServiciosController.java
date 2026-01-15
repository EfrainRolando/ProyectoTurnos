package springboot.turnero.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ServiciosController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("Titulo", "Cortes de Cabello");
        model.addAttribute("Servidor", "Servicios Disponibles");
        
        return "detalleServicio_info";
    }

}
