package artikal;

import java.util.Objects;

public abstract class Artikal {

	protected int sifra;
	protected String naziv;
	protected String opis;
	protected int kolicina;
	
	
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
	
		if(sifra<0) {
			throw new IllegalArgumentException("sifra ne sme biti negativna");
		}
		
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		
		if(naziv==null) {
			throw new NullPointerException("naziv ne sme biti null");
		}
		
		if(naziv.isEmpty()) {
			throw new IllegalArgumentException("naziv ne sme biti prazan");
		}
		
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		
		if(opis==null) {
			throw new NullPointerException("opis ne sme biti null");
		}
		
		if(opis.isEmpty()) {
			throw new IllegalArgumentException("opis ne sme biti prazan");
		}
		
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		
		if(kolicina<0) {
			throw new IllegalArgumentException("kolicina ne sme biti manja od 0");
		}
		
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return sifra == other.sifra;
	}
	
	
	@Override
	public String toString() {
		return "Artikal [sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
	
	
	
	
	
	
}
