import java.util.Scanner;

public class Firma {

	Magazyn pierwszy;
	
	public boolean isEmpty()
	{
		if(pierwszy==null) return true;
		else return false;
	}
	
	public void dodajMagazyn(Magazyn t)
	{
		if(isEmpty()) pierwszy=t;
		else
		{
			Magazyn p=pierwszy;
			while(p.nastepnik!=null)
			{
				p=p.nastepnik;
			}
			p.nastepnik=t;
		}
	}
	
	public Firma()
	{
		pierwszy=null;
	}
	
	public void wczytaj()
	{
		pierwszy = new Magazyn();
		Scanner s=new Scanner(System.in);
		System.out.println("Ilosc klientow:");
		int m=s.nextInt();
		int i=1;
		Magazyn mag=new Magazyn();
		while(m>0)
		{
			dodajMagazyn(mag);
			if(m==1) mag.generuj(1);
			else mag.generuj(2);
			System.out.println("Magazyn nr "+i);
			mag.k.pracuj();
			System.out.println("**********************");
			m-=2;
			i++;
			mag=mag.nastepnik;
		}
	}
	
	public static void main(String[] args) {
			Firma f=new Firma();
			f.wczytaj();
	}

}
