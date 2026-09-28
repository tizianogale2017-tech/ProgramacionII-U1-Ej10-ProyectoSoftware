package Ejercicio10_proyectoSoftware;

public class Main {
    public static void main(String[] args) {
        ProyectoSoftware proyecto = new ProyectoSoftware("Sistema de Turnos", "Clínica Norte");
        System.out.println("Proyecto " + proyecto.getNombreProyecto() + " para " + proyecto.getClienteEmpresa());
        System.out.println("Fase actual: " + proyecto.obtenerEstado());
        for (int i = 0; i < 3; i++) {
            proyecto.avanzarFase();
            System.out.println("Avanza a: " + proyecto.obtenerEstado());
        }
    }
}
