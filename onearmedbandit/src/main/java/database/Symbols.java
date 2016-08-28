package database;

import java.util.HashSet;
import java.util.Set;


public class Symbols implements java.io.Serializable {

	private Integer symbolId;
	private String symbolName;
	private Set<Banditssymbols> banditssymbolses = new HashSet<Banditssymbols>(0);

	public Symbols() {
	}

	public Symbols(String symbolName) {
		this.symbolName = symbolName;
	}

	public Symbols(String symbolName, Set<Banditssymbols> banditssymbolses) {
		this.symbolName = symbolName;
		this.banditssymbolses = banditssymbolses;
	}

	public Integer getSymbolId() {
		return this.symbolId;
	}

	public void setSymbolId(Integer symbolId) {
		this.symbolId = symbolId;
	}

	public String getSymbolName() {
		return this.symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public Set<Banditssymbols> getBanditssymbolses() {
		return this.banditssymbolses;
	}

	public void setBanditssymbolses(Set<Banditssymbols> banditssymbolses) {
		this.banditssymbolses = banditssymbolses;
	}

}
