package database;

import java.util.HashSet;
import java.util.Set;

public class Bandits implements java.io.Serializable {

	private Integer gameId;
	private String banditName;
	private double jackpot;
	private Set<Banditssymbols> banditssymbolses = new HashSet<Banditssymbols>(0);
	private Set<Banditsprizes> banditsprizeses = new HashSet<Banditsprizes>(0);
	private Set<Banditsstakes> banditsstakeses = new HashSet<Banditsstakes>(0);

	public Bandits() {
	}

	public Bandits(String banditName, double jackpot) {
		this.banditName = banditName;
		this.jackpot = jackpot;
	}

	public Bandits(String banditName, double jackpot, Set<Banditssymbols> banditssymbolses,
			Set<Banditsprizes> banditsprizeses, Set<Banditsstakes> banditsstakeses) {
		this.banditName = banditName;
		this.jackpot = jackpot;
		this.banditssymbolses = banditssymbolses;
		this.banditsprizeses = banditsprizeses;
		this.banditsstakeses = banditsstakeses;
	}

	public Integer getGameId() {
		return this.gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public String getBanditName() {
		return this.banditName;
	}

	public void setBanditName(String banditName) {
		this.banditName = banditName;
	}

	public double getJackpot() {
		return this.jackpot;
	}

	public void setJackpot(double jackpot) {
		this.jackpot = jackpot;
	}

	public Set<Banditssymbols> getBanditssymbolses() {
		return this.banditssymbolses;
	}

	public void setBanditssymbolses(Set<Banditssymbols> banditssymbolses) {
		this.banditssymbolses = banditssymbolses;
	}

	public Set<Banditsprizes> getBanditsprizeses() {
		return this.banditsprizeses;
	}

	public void setBanditsprizeses(Set<Banditsprizes> banditsprizeses) {
		this.banditsprizeses = banditsprizeses;
	}

	public Set<Banditsstakes> getBanditsstakeses() {
		return this.banditsstakeses;
	}

	public void setBanditsstakeses(Set<Banditsstakes> banditsstakeses) {
		this.banditsstakeses = banditsstakeses;
	}

}
