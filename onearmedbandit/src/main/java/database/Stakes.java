package database;

import java.util.HashSet;
import java.util.Set;


public class Stakes implements java.io.Serializable {

	private Integer stakeId;
	private int stakeHeight;
	private Set<Banditsstakes> banditsstakeses = new HashSet<Banditsstakes>(0);

	public Stakes() {
	}

	public Stakes(int stakeHeight) {
		this.stakeHeight = stakeHeight;
	}

	public Stakes(int stakeHeight, Set<Banditsstakes> banditsstakeses) {
		this.stakeHeight = stakeHeight;
		this.banditsstakeses = banditsstakeses;
	}

	public Integer getStakeId() {
		return this.stakeId;
	}

	public void setStakeId(Integer stakeId) {
		this.stakeId = stakeId;
	}

	public int getStakeHeight() {
		return this.stakeHeight;
	}

	public void setStakeHeight(int stakeHeight) {
		this.stakeHeight = stakeHeight;
	}

	public Set<Banditsstakes> getBanditsstakeses() {
		return this.banditsstakeses;
	}

	public void setBanditsstakeses(Set<Banditsstakes> banditsstakeses) {
		this.banditsstakeses = banditsstakeses;
	}

}
