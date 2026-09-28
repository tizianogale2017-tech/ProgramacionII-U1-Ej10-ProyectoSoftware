package Ejercicio10_proyectoSoftware;

public class ProyectoSoftware {
    private String nombreProyecto;
    private String clienteEmpresa;
    private int faseActual;

    public ProyectoSoftware(String nombreProyecto, String clienteEmpresa) {
        this.nombreProyecto = nombreProyecto;
        this.clienteEmpresa = clienteEmpresa;
        this.faseActual = 1;
    }

    public void avanzarFase() {
        if (faseActual < 3) {
            faseActual++;
        }
    }

    public String obtenerEstado() {
        switch (faseActual) {
            case 1:
                return "Análisis";
            case 2:
                return "Desarrollo";
            default:
                return "Despliegue";
        }
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getClienteEmpresa() {
        return clienteEmpresa;
    }
}
