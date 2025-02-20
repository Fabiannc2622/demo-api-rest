package pe.edu.idat.demo_api_rest.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_api_rest.model.APIResponse;
import pe.edu.idat.demo_api_rest.service.IFundamentosService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {

    private final IFundamentosService iFundamentosService;

    @GetMapping("/ejercicio1")
    public String ejercicio1() {
        return "Hola Mundo REST";
    }


    @GetMapping("/primo")
    public ResponseEntity<APIResponse<String>>
        validarPrimo(@RequestParam int numero) {
        String respuesta = iFundamentosService
                .validarNumeroPrimo(numero);
        APIResponse<String> response = APIResponse.<String>builder()
                .data(respuesta) // Seteamos los datos
                .mensaje("Ejercicio ejecutado correctamente") // Seteamos el mensaje
                .build(); // Creamos la instancia usando el builder
        return ResponseEntity.ok(response);
    }

    @GetMapping("/factorial")
    public ResponseEntity<APIResponse<String>>
    factorial(@RequestParam int numero) {
        String respuesta = iFundamentosService
                .calcularFactorial(numero);
        APIResponse<String> response = APIResponse.<String>builder()
                .data(respuesta)
                .mensaje("Ejercicio ejecutado correctamente")
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/fibonacci")
    public ResponseEntity<APIResponse<List<Integer>>>
    fibonacci(@RequestParam int numero) {
        List<Integer> respuesta = iFundamentosService
                .calcularFibonacci(numero);
        APIResponse<List<Integer>> response = APIResponse.<List<Integer>>builder()
                .data(respuesta)
                .mensaje("Ejercicio ejecutado correctamente")
                .build();
        return ResponseEntity.ok(response);
    }
}
