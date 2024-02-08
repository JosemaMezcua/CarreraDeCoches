package juegos;

public class Reloj {
    // Atributos para almacenar horas, minutos y segundos
    private int horas;
    private int minutos;
    private int segundos;
    // Constructor sin argumentos que inicializa el reloj a 00:00:00
    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    // Constructor con argumentos para establecer la hora inicial del reloj
    public Reloj(int horas, int minutos, int segundos) {
        // Verificar y asignar la hora solo si es válida, de lo contrario, inicializar a 00:00:00
        if (modificarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            // Si los valores no son correctos, inicializar a 0
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }
    // Método para modificar la hora del reloj, verifica que la hora sea válida
    public boolean modificarHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }
    // Método para sumar un segundo al reloj
    public void sumarSegundo() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }
    // Método para sumar un número determinado de segundos al reloj
    public void sumarSegundos(int segundos) {
        for (int i = 0; i < segundos; i++) {
            sumarSegundo();
        }
    }
    // Método para representar el reloj como una cadena de texto (en formato hh:mm:ss)
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
// Este metodo es para comparar los tiempos de vuelta de cada coche, (lo he buscado en internet)
    public int compareTo(Reloj tiempoDeVuelta) {
        return 0;
    }
}
