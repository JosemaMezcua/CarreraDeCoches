package juegos;

public class Carrera {
    // Atributos para almacenar los coches, el tiempo de inicio y el estado de la carrera
    private Coche[] coches;
    private Reloj tiempoInicio;
    private boolean enCurso;
    // Constructor para inicializar la carrera con una cantidad de coches especificada
    public Carrera(int cantidadCoches) {
        this.coches = new Coche[cantidadCoches];
        this.tiempoInicio = new Reloj();
        this.enCurso = false;
    }
    // Método para agregar un coche a la carrera en una posición específica
    public void agregarCoche(Coche coche, int indice) {
        if (indice >= 0 && indice < coches.length) {
            coches[indice] = coche;
        }
    }
    // Método para iniciar la carrera
    public void comenzarCarrera() {
        enCurso = true;
    }

    // Método para registrar el tiempo de vuelta de un coche durante la carrera

    public void registrarTiempoVuelta(int indiceCoche, int horas, int minutos, int segundos) {
        if (enCurso && indiceCoche >= 0 && indiceCoche < coches.length) {
            coches[indiceCoche].setTiempoDeVuelta(new Reloj(horas, minutos, segundos));
        }
    }
    // Método para finalizar la carrera y generar la clasificación final de los coches
    public void finalizarCarrera() {
        enCurso = false;

        ordenarCochesPorTiempo();

        mostrarClasificacion();
    }
//Metodo para ordenar los coches por tiempo, segun el tiempo , estaran delante o detras
    private void ordenarCochesPorTiempo() {
        for (int i = 0; i < coches.length - 1; i++) {
            for (int j = 0; j < coches.length - i - 1; j++) {
                if (coches[j].getTiempoDeVuelta().compareTo(coches[j + 1].getTiempoDeVuelta()) > 0) {
                    Coche temp = coches[j];
                    coches[j] = coches[j + 1];
                    coches[j + 1] = temp;
                }
            }
        }
    }
// Metodo para mostrar la clasificacion de los coches
    private void mostrarClasificacion() {
        System.out.println("Clasificación final:");
        for (int i = 0; i < coches.length; i++) {
            System.out.println((i + 1) + ". " + coches[i]);
        }
    }
}

