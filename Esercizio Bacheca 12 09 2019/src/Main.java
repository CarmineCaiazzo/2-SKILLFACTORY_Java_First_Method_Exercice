
public class Main {

	public static void main(String[] args) {
		
        Class w= new Class();

		String ripeti=null;
		
		do {
			
		w.stampaMenù();
		
		
		int scelta = w.leggiIntero("Inserisci un Numero: ");
		
		
		switch(scelta) {
		case 1:
			do {
			w.maxMin();
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 2:
			do {
			w.pariDispari();
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 3:
			do {
			w.contatoreVerticale();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 4:
			do {
			w.contatoreOrizzontale();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 5:
			do {
			w.semaforo();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 6:
			do {
			w.totalizzatore();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 7:
			do {
			w.stampaVettore();
			System.out.println(" ");
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 8:
			do {
			w.nominativi();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 9:
			do {
			w.ordinamento();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 10:
			do {
			w.cercaNelVettore();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 11:
			do {
			w.stampaTavolaPitagorica();
			System.out.println(" ");
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );	
				break;
		case 12:
			do {
			w.stringa2();
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 13:
			do {
			w.meteo();	
			ripeti=w.leggiStringa("Vuoi tornare al Menù?? Si/No ");
			}while( ripeti.equals("No") );
			break;
		case 14:System.out.println("Sei Uscito dal Programma UwU");
			break;
		/*case 15:w.forda1a10();
			break;*/
		default:
			break;
		
		}
		
		
		if(scelta!=14)
		{
		ripeti=w.leggiStringa("Vuoi ripetere l'esericizio?? Si/No ");
		}
		else
		{
			ripeti="No";
		}
		
		
		}while(ripeti.equals("Si") );

	}

}
