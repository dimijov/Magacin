package artikal;

import java.time.LocalDate;


public class KucnaHemija extends Artikal {

	
	protected LocalDate datum;

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		if(datum==null) {
			throw new NullPointerException("datum ne sme biti null");
		}
		
		this.datum = datum;
	}


	
	@Override
	public String toString() {
		return "KucnaHemija [datum=" + datum + ", sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis
				+ ", kolicina=" + kolicina + "]";
	}

	
	
	
}
