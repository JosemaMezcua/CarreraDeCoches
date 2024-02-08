package juegos;

public class Coche {
    // Atributos para almacenar el nombre del coche y su tiempo de vuelta
    private String nombre;
    private Reloj tiempoDeVuelta;
    // Constructor para inicializar el nombre del coche y su tiempo de vuelta
    public Coche(String nombre, int horas, int minutos, int segundos) {
        this.nombre = nombre;
        this.tiempoDeVuelta = new Reloj(horas, minutos, segundos);
    }
    // Método para representar el coche como una cadena de texto
    @Override
    public String toString() {
        return "Coche: " + nombre + ", Tiempo de vuelta: " + tiempoDeVuelta;
    }
    // Getter para obtener el tiempo de vuelta del coche
    public Reloj getTiempoDeVuelta() {
        return tiempoDeVuelta;
    }
    // Setter para establecer el tiempo de vuelta del coche
    public void setTiempoDeVuelta(Reloj tiempoDeVuelta) {
        this.tiempoDeVuelta = tiempoDeVuelta;
    }
}
