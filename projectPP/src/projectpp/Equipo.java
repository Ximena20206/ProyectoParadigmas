package projectpp;



import javax.swing.ImageIcon;
import java.util.*;

public class Equipo {
    private String nombre;
    private int[] puntosPorSemana; //seran 32 semanas
    private List<Partido> partidosJugados;
    private List<Partido> partidosFuturos;
    
    public Equipo( ) {}

    public Equipo(String nombre) {
        this.nombre = nombre;

        this.puntosPorSemana = new int[32];
        this.partidosJugados = new ArrayList<>();
        this.partidosFuturos = new ArrayList<>();
    }   
    public void establecernombre(String nombre){
        this.nombre = nombre;
    }
    public void establecerpuntosporsemana(int puntos, int semana){
         this.puntosPorSemana[semana-1] = puntos;
    }
    public void establecerpartidosjugados(){
         
    }
    public void establecerpartidosfuturos(){ 
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public int[] getPuntosPorSemana() {
        return puntosPorSemana;
    }

    public List<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public List<Partido> getPartidosFuturos() {
        return partidosFuturos;
    }

  
}
