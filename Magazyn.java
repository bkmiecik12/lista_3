import java.util.Random;

public class Magazyn
{
	Klient pierwszy;
	Kolejka k;
	Magazyn nastepnik;
	
	
	String[] nazwyKlientow={"Adam Adamiak","Adam Admski","Ryszard Nowak","Jaros³aw Pilarz","Marian Witan","Rados³aw So³decki","Krzysztof Jarecki",
							"Jan Kowalski","Patryk Kowalczyk",};
	String[] nazwyTowarow={"Ser","Mleko","Jajka","Bu³ki","Dro¿d¿e","Woda Ÿródlana","Woda mineralna",
						   "Miêso wo³owe","Miêso Wieprzowe",};
	
	Magazyn ()
	{
		pierwszy=null;
	}
	
	public void generuj(int x)
	{
		k=new Kolejka();
		Random r=new Random();
		int iloscKlientow=x;
		for(int i=0;i<iloscKlientow;i++)
		{
			Klient n=new Klient();
			int naz=r.nextInt(9);
			n.setNazwaKlienta(nazwyKlientow[naz]);
			k.insert(n);
			int iloscTowarow=r.nextInt(5)+1;
			for(int j=0;j<iloscTowarow;j++)
			{
				int ilosc=r.nextInt(9)+1;
				int nazT=r.nextInt(9);
				Towar t= new Towar(nazwyTowarow[nazT],ilosc);
				n.dodajTowar(t);
			}
		}
	}
	
	public static void main(String[] args)
	{
		//Magazyn m=new Magazyn();
		//m.generuj(4);
		//m.k.pracuj();

	}
}
