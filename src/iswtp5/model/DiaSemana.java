package iswtp5.model;

public enum DiaSemana {
    Lunes(1),   // Disminuir en 1 los valores
    Martes(2),
    Miercoles(3),
    Jueves(4),
    Viernes(5),
    Sabado(6),
    Domingo(7);
    
    private final int value; // Corregir: una variable final debe ser inicializada al declararla.
    private DiaSemana(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
