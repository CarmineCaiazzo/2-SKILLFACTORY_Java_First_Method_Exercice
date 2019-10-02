import java.util.Scanner;

public class Class {
	
	Scanner s=new Scanner(System.in);


	
//Menù
	
	public void stampaMenù()
	{
		System.out.println("1 - MaxMin");
		System.out.println("2 - Pari o Dispari");
		System.out.println("3 - Contatore Verticale");
		System.out.println("4 - Contatore Orizzontale");
		System.out.println("5 - Semaforo");
		System.out.println("6 - Totalizzatore");
		System.out.println("7 - Stampa Vettore");
		System.out.println("8 - Nominativi ");
		System.out.println("9 - Ordinamento");
		System.out.println("10 - Cerca nel Vettore");
		System.out.println("11 - Stampa Tavola Pitagorica");
		System.out.println("12 - Stringa Palindroma");
		System.out.println("13 - Meteo");
		System.out.println("14 - Esci");
	}	
	
	
	
	
	

//1	
	public void pariDispari()
	{
		int N1 = leggiIntero("Inserisci il Numero.");
		
		if(N1%2==0)
		{
			System.out.println("Il Numero "+N1+" è pari. ");
		}
		else
		{
			System.out.println("Il Numero "+N1+" è dispari. ");
		}
		
	}
	
	
	
	
//2
	public void maxMin()
	{
		int N1 = leggiIntero("Inserisci il 1° Numero. ");
		int N2 = leggiIntero("Inserisci il 2° Numero. ");
		
		if(N1>N2)
		{
			System.out.println("il 1° Numero "+N1+" è più grande del 2° Numero "+N2);	
		}
		else if(N1==N2)
		{
			System.out.println("il 1° Numero "+N1+" è uguale del 2° Numero "+N2);
		}
		else
		{
			System.out.println("il 1° Numero "+N1+" è minore del 2° Numero "+N2);
		}
		
		
	}
	
	
//3
	
	public void contatoreVerticale()
	{
		
		int N1 = leggiIntero("Quante volte vuoi contare??");	
		
				for(int V=0; V<N1; V++)
				{
					System.out.println(V+1);
					
				}
	}
	
//4
	
	public void contatoreOrizzontale()
	{
		int N2 = leggiIntero("Quante volte vuoi contare??");
		
		for(int V=0; V<N2; V++)
		{	
			System.out.print(V+1);
			
			if(V+1<N2) 
			{
				System.out.print(",");	
			}
			else if(V+1==N2)
			{
				System.out.print(".");
			}
		}
		
	}
	
//5
	
	public void semaforo()
	{
		String colore;
		colore=leggiStringa("Inserire Colore");
		
		if(colore.equals("Rosso"))
		{
			System.out.println("ALT!!");
		}
		else if(colore.equals("Arancione"))
		{
			System.out.println("ATTENZIONE!!");
		}
		else if(colore.equals("Verde"))
		{
			System.out.println("VAI!! UwU");
		}
		else
		{
			System.out.println("Hey!! Non sei al semaforo UwU");
		}
		
	}
	
//6
	
	public void totalizzatore()
	{
		
		String ripeti;
		
		int	C=0;
		int somma=0;
		
		do {	
		
		int N2 = leggiIntero("Numero: " );
		
		somma=somma+N2;
		C++;
				
		ripeti=leggiStringa("Vuoi Inserire un altro valore?? Si/No ");
		}while( ripeti.equals("Si") );
		
		double media=somma/C;
		
		System.out.println("la somma dei valori è: "+somma);
		System.out.println("La media dei valori è: "+media);
		
		}
	
//7
	
	public void stampaVettore()
	{
		
		int[] j=new int[10];
		
		for(int i=0; i<10; i++)
		{
			int x=i+1;
			j[i]=leggiIntero("Inserire il numero alla posizione: " +x+" ");
		}	
		
		System.out.println("-Digitare 1 in caso di Stampa Verticale");
		System.out.println("-Digitare 2 in caso di Stampa Orizzontale");
		System.out.println("|----------------------------------------|");
	        
		int stampaVariabili = leggiIntero("Inserisci il tipo di grafica desiderata: ");
				
		switch (stampaVariabili) {
		
		//Verticale
		case 1:	
			
			for(int V=0; V<10; V++)
			{
				System.out.println(j[V]);
				
			}
			break;
		
		//Orizzontale
		case 2:
			
			for(int V=0; V<10; V++)
			{	
				System.out.print(j[V]);
				
				if(V+1<10) 
				{
					System.out.print(",");	
				}
				else if(V+1==10)
				{
					System.out.print(".");
				}
			}
			break;
		
		default:
			break;
		}
	}
	
//8

	public void nominativi()
	{
		int c=0;
		String[] j=new String[10];
		
		for(int i=0; i<10; i++)
		{
			
			int x=i+1;
			j[i]=leggiStringa("Inserire il Nominativo alla posizione: " +x+" ");
		}
		
		for(int V=0; V<10; V++)
		{
			c++;
			System.out.println("Nominativo: " +c+ " " +j[V]);
			
		}
		
	}
	
//9
	
	public void ordinamento() // Da riscrivere
	{
		System.out.println("Inserisci 10 Nomnativi");
		System.out.println("|---------------------------|");
		String v[]= new String[10];
		int n=1;
		
		for(int i=0; i<10; i++) //For input Array
		{
			v[i]=leggiStringa("Inserisci il "+n+"° Nominativo: ");
			n++;
		}
		
		for(int i=0; i<10; i++) // For Cambio Parola
		{
			for(int x=0; x<10; x++)// For Controllo Parola
			{ 
				if( v[x].compareTo(v[i]) > 0)
				{
					String app=v[i];
					v[i]=v[x];
					v[x]=app;
				}
			}
		}
		
		for(int i=0; i<10; i++)//For output Array
		{
			System.out.println(i+1 + "." + v[i]);
		}

		
	}
	
//10
	public void cercaNelVettore()
	{
		//Ciclo For per Immettere Nominativi nel Vettore
		String[] j=new String[10];
		int cont=0;
		
		for(int i=0; i<10; i++)
		{
			int x=i+1;
			j[i]=leggiStringa("Inserire il Nominativo alla posizione: " +x+" ");
		}
		
		String cerca=leggiStringa("Inserisci il Nominativo da cercare: ");
		
		for(int s=0; s<10; s++)
		{
			int x=s+1;
			if(cerca.equals(j[s]))
			{
				System.out.println("Nominativo: "+j[s]+" || Posizione: "+x);
			}
			else
			{
				cont++;
			}
			
			if(cont==10)
			{
				System.out.println("Nominativo non trovato!! XwX");
			}
			
		}
		
		
		
		
	}
	
	
//11
		
	public void stampaTavolaPitagorica()
	{
		
		int[][] p=new int[11][11];
		
		for(int i=1; i<11; i++)//For Input Valori
		{
			for(int j=1; j<11; j++)
			{
				int prodotto=j*i;
				p[i][j]=prodotto;
			}
					
		}
		
		
		
		for(int i=1; i<11; i++)//For Output Valori
		{
			System.out.println(" ");
			
			for(int j=1; j<11; j++)
			{
				System.out.print(p[i][j]+" ");
			}
					
		}
		
		
			
	}
	
	
//12
	
	public void stringaPalindroma()
	{
	
		String Parola=leggiStringa("Inserire Parola da Analizzare: "); //Inserimento Parola
		int c=0;
		
		
		if(Parola.length()%2!=0)//Controllo Lunghezza Stringa Pari/Dispari
		{
			System.out.println("La Parola non può essere Palindroma XwX");
		}
		else
		{
			for(int i=0; i<(Parola.length()/2); i++)//Inizializzazione Controllo Parola dal 1 Carattere etc.
			{
				
				if(Parola.charAt(i)==Parola.charAt(Parola.length()-i-1))//Controllo Caratteri Specchiati 1-4/2-3 etc.
				{
					c++;//Contatore Controllo Parola con Metà Parola
				}
				
			}
			
			if(c==(Parola.length()/2))//Controllo Contatore=Metà della parola.
			{
				System.out.println("La Stringa è Palindroma UwU");
			}
			else
			{
				System.out.println("La Stringa non è Palindroma XwX");
			}	
			
			
		}
		
	}
	
	
//13
	
	public void meteo()
	{
		String[] s=new String[7];//Array Giorni
		int[][] t=new int[7][4];//Array Valori
		
		int ng=0;//iniziallizza Numero Grado
		int nj=0;//Inizializza Numero Giorni
				 
		s[0]="Lunedi";
		s[1]="Martedi";
		s[2]="Mercoledi";
		s[3]="Giovedi";
		s[4]="Venerdi";
		s[5]="Sabato";
		s[6]="Domenica";		
		
		for(int i=0; i<7; i++)//For Input Valori
		{
			ng=0;//Ri-Iniziliazzato perchè altrimenti Contatore Gradi sfora il 4
			nj++;//Aumento Numero Giorni
			
			for(int j=0; j<4; j++)
			{
			ng++;
				t[i][j]=leggiIntero("Inserisci il "+ng+"° Grado del Giorno: "+nj+" ");
			}
					
		}
			
		for(int i=0; i<7; i++)//For Output Valori
		{
			System.out.println(s[i]);//Stampa Giorni
			
			for(int j=0; j<4; j++)
			{
				System.out.print(t[i][j]+" ");
			}
			
			System.out.println(" ");//Spazio che divide Gorni/Gradi
		}
		
			
	}
	
//15 Easter Egg
	
	/*public void forda1a10()
	{
		for(int i=0; i<11; i++)
		{
			System.out.println(i);
			
		}
		
	} */
	
//Stringa Palindroma with Flag.
	
	public void stringa2()//Non funzionante, da rivedere.
	{
		
	boolean flag=false;
	
	String s=leggiStringa("inserire");
	
	for(int i=0; i<(s.length()/2);i++)
	{
		if(s.charAt(i)!=s.charAt(s.length()-i-1))
		{
			flag=true;
			break;
		}
	}
	
	if(flag)//if controlla se Flag è vero/falso.
	{
		System.out.println("Parola non Palindroma");
	}
	else
	{
		System.out.println("Parola Palindroma");
		
	}
}
// |-------------------------------------------------------------------|
	
//Other 
	
// |--------------------------------------------------------------------------------------------|
// |--------------------------------------------------------------------------------------------|	
	
//Leggi Intero
	public int leggiIntero(String s1)
	{
		System.out.print(s1);
		
		int num1=0;
		num1 =Integer.parseInt(s.nextLine());
		return num1;
	}
	
	
//Leggi Stringa
	
	public String leggiStringa(String s2)
	{
		System.out.println(s2);
		return s.nextLine();
	}

	
}

	