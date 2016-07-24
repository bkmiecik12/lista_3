
public class Klient {
	Towar pierwszy;
	int size;
	String nazwaKlienta;
	Klient nastepnik;
	
	public Klient()
	{
		pierwszy=null;
	}
	
	public void setNazwaKlienta(String s)
	{
		nazwaKlienta=s;
	}
	
	public boolean isEmpty()
	{
		if(pierwszy==null) return true;
		else return false;
	}
	
	public void dodajTowar(Towar t)
	{
		if(isEmpty()) pierwszy=t;
		else
		{
			Towar p=pierwszy;
			while(p.nastepnik!=null)
			{
				p=p.nastepnik;
			}
			p.nastepnik=t;
		}
	}
	
	public void usunTowar()
	{
		pierwszy=pierwszy.nastepnik;
	}
	
	public void policzTowaryKlienta()
	{
		int sumaTowarow=0;
		while(!isEmpty())
		{
			Towar temp=pierwszy;
			sumaTowarow+=temp.ilosc;
			temp.wyswietl();
			usunTowar();
		}
		System.out.println(nazwaKlienta+": Zamówienie zrealizowano. Liczba towarów: "+sumaTowarow+"\n----------------");
	}
}
