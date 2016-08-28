package database;

import java.util.HashSet;
import java.util.Set;

public class Prizes implements java.io.Serializable {

	private Integer prizeId;
	private String prizeHeight;
	private Set<Banditsprizes> banditsprizeses = new HashSet<Banditsprizes>(0);

	public Prizes() {
	}

	public Prizes(String prizeHeight) {
		this.prizeHeight = prizeHeight;
	}

	public Prizes(String prizeHeight, Set<Banditsprizes> banditsprizeses) {
		this.prizeHeight = prizeHeight;
		this.banditsprizeses = banditsprizeses;
	}

	public Integer getPrizeId() {
		return this.prizeId;
	}

	public void setPrizeId(Integer prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeHeight() {
		return this.prizeHeight;
	}

	public void setPrizeHeight(String prizeHeight) {
		this.prizeHeight = prizeHeight;
	}

	public Set<Banditsprizes> getBanditsprizeses() {
		return this.banditsprizeses;
	}

	public void setBanditsprizeses(Set<Banditsprizes> banditsprizeses) {
		this.banditsprizeses = banditsprizeses;
	}

}
