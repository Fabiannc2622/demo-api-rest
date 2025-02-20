package pe.edu.idat.demo_api_rest.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class APIResponse<T> {

    private T data;
    private String error;
    private String mensaje;
}
