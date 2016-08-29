package database;

public class Banditsstakes implements java.io.Serializable {

	private Integer banditsStakesId;
	private Bandits bandits;
	private Stakes stakes;

	public Banditsstakes() {
	}

	public Banditsstakes(Bandits bandits, Stakes stakes) {
		this.bandits = bandits;
		this.stakes = stakes;
	}

	public Integer getBanditsStakesId() {
		return this.banditsStakesId;
	}

	public void setBanditsStakesId(Integer banditsStakesId) {
		this.banditsStakesId = banditsStakesId;
	}

	public Bandits getBandits() {
		return this.bandits;
	}

	public void setBandits(Bandits bandits) {
		this.bandits = bandits;
	}

	public Stakes getStakes() {
		return this.stakes;
	}

	public void setStakes(Stakes stakes) {
		this.stakes = stakes;
	}

}
