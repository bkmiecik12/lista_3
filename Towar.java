
public class Towar {
	int ilosc;
	String nazwa;
	Towar nastepnik;
	
	public Towar(String s, int a)
	{
		nazwa=s;
		ilosc=a;
	}
	
	public void wyswietl()
	{
		System.out.println(nazwa+", iloœæ sztuk: "+ilosc);
	}
}
