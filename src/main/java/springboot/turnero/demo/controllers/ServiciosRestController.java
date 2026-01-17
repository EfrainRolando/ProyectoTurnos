package springboot.turnero.demo.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api") 
public class ServiciosRestController {

    @GetMapping("/detalleServicio_info2")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<>();
        model.put("Titulo", "Cortes de Cabello");
        model.put("Servidor", "Servicios Disponibles");
        model.put("Descripcion", "Servicios de Corte de Cabello");
        model.put("Precio", "$500");
        model.put("Duracion", "30 minutos");

        return model;
    }

}