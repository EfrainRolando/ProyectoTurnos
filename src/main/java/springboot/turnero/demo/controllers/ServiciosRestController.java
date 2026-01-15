package springboot.turnero.demo.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiciosRestController {

    @GetMapping("/detalleServicio_info2")
    public String home() {
        Map<String, Object> model = new HashMap<>();
        model.put("Titulo", "Cortes de Cabello");
        model.put("Servidor", "Servicios Disponibles");

        return "detalleServicio_info2";
    }

}
