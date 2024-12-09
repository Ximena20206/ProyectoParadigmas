package projectpp;

public class Partido {
    private String equipoContrario;
    private int golesEquipo;
    private int golesContrario;
    private boolean jugado; 

    public Partido(String equipoContrario, int golesLocal, int golesVisitante, boolean jugado) {
        this.equipoContrario = equipoContrario;
        this.golesEquipo = golesLocal;
        this.golesContrario = golesVisitante;
        this.jugado = jugado;
    }

    public String getEquipoContrario() {
        return equipoContrario;
    }

    public int getGolesLocal() {
        return golesEquipo;
    }

    public int getGolesVisitante() {
        return golesContrario;
    }

    public boolean isJugado() {
        return jugado;
    }
}

