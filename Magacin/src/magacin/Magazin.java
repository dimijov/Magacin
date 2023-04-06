package magacin;

import java.util.ArrayList;
import java.util.List;

import artikal.Artikal;
import interfejs.SpecifikacijaInterface;

public class Magazin implements SpecifikacijaInterface {

	List<Artikal> artikli=new ArrayList<>();
	
	@Override
	public void dodajArtikal(Artikal a) {
		artikli.add(a);
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		artikli.remove(a);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for (Artikal artikal : artikli) {
			if(artikal.getSifra()==sifra) {
				return artikal;
			}
		}
		return null;
	}

}
