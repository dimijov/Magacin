package magacin;

import java.util.LinkedList;
import java.util.List;

import artikal.Artikal;
import interfejs.SpecifikacijaInterface;

public class Magazin implements SpecifikacijaInterface {

	@Override
	public void dodajArtikal(Artikal a) {
		
		List<Artikal> artikli=new LinkedList<>();
		
		if(a!=null) {
			artikli.add(0, a);
		}
		
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		
		return null;
	}

}
