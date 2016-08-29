package database;


public class Banditsprizes implements java.io.Serializable {

	private Integer banditsPrizesId;
	private Bandits bandits;
	private Prizes prizes;

	public Banditsprizes() {
	}

	public Banditsprizes(Bandits bandits, Prizes prizes) {
		this.bandits = bandits;
		this.prizes = prizes;
	}

	public Integer getBanditsPrizesId() {
		return this.banditsPrizesId;
	}

	public void setBanditsPrizesId(Integer banditsPrizesId) {
		this.banditsPrizesId = banditsPrizesId;
	}

	public Bandits getBandits() {
		return this.bandits;
	}

	public void setBandits(Bandits bandits) {
		this.bandits = bandits;
	}

	public Prizes getPrizes() {
		return this.prizes;
	}

	public void setPrizes(Prizes prizes) {
		this.prizes = prizes;
	}

}
