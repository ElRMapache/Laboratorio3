import java.util.ArrayList;
import java.util.List;

public class Profesional{

	private String disponibilidad;    
    private String diaLibre;    
    private String turnos;    
    private int minDias;
    private int cantDias;
    private ArrayList<Object> scheduleHolder = new ArrayList<Object>(3);

	public Profesional(int minDias){

		minDias = minD;
		disponibilidad = new Turno();
        turnos = new Turno();
        diaLibre = new Turno();

        scheduleHolder.add(disponibilidad);
        scheduleHolder.add(turnos); 
        scheduleHolder.add(diaLibre); 

	}

	public void getTurn(String turnos){

		return turnos;
	}

	public void addDay(int dia. TimeSpan){

		Turno temp = (Schedule)scheduleHolder.get(scheduleNumber);
        temp.add(dia, shiftTime); 

	}

	public void subsDay(){

		Turno temp = (Schedule)scheduleHolder.get(scheduleNumber);
        temp.remove(dia, shiftTime);

	}

	public void delDay(){

	}

}