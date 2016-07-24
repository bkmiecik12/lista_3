
public class Kolejka implements Queue
{
	Klient pierwszy;
	
	public void insert(Klient t)
	{
		if(isEmpty()) pierwszy=t;
		else
		{
			Klient p=pierwszy;
			while(p.nastepnik!=null)
			{
				p=p.nastepnik;
			}
			p.nastepnik=t;
		}
	}
	
	public void remove()
	{
		pierwszy=pierwszy.nastepnik;
	}
	
	public boolean isEmpty()
	{
		if(pierwszy==null) return true;
		else return false;
	}
	
	public boolean isFull()
	{
		if(isEmpty()) return false;
		else return true;
	}
	
	public void pracuj()
	{
		while(isFull())
		{
			Klient t=pierwszy;
			t.policzTowaryKlienta();
			remove();
		}
	}
}
