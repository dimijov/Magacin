package artikal;

import java.util.Date;

public class KucnaHemija extends Artikal {

	
	protected Date datum;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	
	
	
	@Override
	public String toString() {
		return "KucnaHemija [datum=" + datum + ", sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis
				+ ", kolicina=" + kolicina + "]";
	}

	
	
	
}
