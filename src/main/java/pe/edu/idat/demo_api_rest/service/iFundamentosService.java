package pe.edu.idat.demo_api_rest.service;

import java.util.List;

public interface iFundamentosService {

    String validarNumeroPrimo(int numero);

    String calcularFactorial(int numero);

    List<Integer> calcularFibonacci(int numero);
}
