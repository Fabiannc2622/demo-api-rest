package pe.edu.idat.demo_api_rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {
    @GetMapping("/ejercicio1")
    public String ejercicio1() {
        return "Hola Mundo Rest";
    }
}
