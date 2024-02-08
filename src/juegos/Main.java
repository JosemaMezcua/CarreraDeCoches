package juegos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de coches con tiempos de vuelta diferentes
        Coche coche1 = new Coche("Ferrari", 0, 1, 20);
        Coche coche2 = new Coche("Mercedes", 0, 1, 15);
        Coche coche3 = new Coche("Red Bull", 0, 1, 25);
        // Crear una carrera con una cantidad fija de coches y agregar los coches
        Carrera carrera = new Carrera(3);
        carrera.agregarCoche(coche1, 0);
        carrera.agregarCoche(coche2, 1);
        carrera.agregarCoche(coche3, 2);
        // Iniciar la carrera
        carrera.comenzarCarrera();

        // Simulación de tiempos de vuelta de los coches
        carrera.registrarTiempoVuelta(0, 0, 1, 17); // Ferrari
        carrera.registrarTiempoVuelta(1, 0, 1, 18); // Mercedes
        carrera.registrarTiempoVuelta(2, 0, 1, 22); // Red Bull

        carrera.finalizarCarrera();
    }
}

