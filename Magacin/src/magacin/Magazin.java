package magacin;


import java.util.ArrayList;
import java.util.List;

import artikal.Artikal;
import interfejs.SpecifikacijaInterface;

public class Magazin implements SpecifikacijaInterface {

	List<Artikal> artikli=new ArrayList<>();
	
	@Override
	public void dodajArtikal(Artikal a) {
		if(a==null) {
			throw new NullPointerException("artikal ne sme biti null");
		}
		artikli.add(a);
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		if(a==null) {
			throw new NullPointerException("artikal ne sme biti null");
		}
		artikli.remove(a);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		if(sifra<0) {
			throw new IllegalArgumentException("sifra ne sme biti null");
		}
		
		for (Artikal artikal : artikli) {
			if(artikal.getSifra()==sifra) {
				return artikal;
			}
		}
		return null;
	}

}
