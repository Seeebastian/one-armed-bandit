package database;

public class Banditssymbols implements java.io.Serializable {

	private Integer banditsSymbolsId;
	private Symbols symbols;
	private Bandits bandits;

	public Banditssymbols() {
	}

	public Banditssymbols(Symbols symbols, Bandits bandits) {
		this.symbols = symbols;
		this.bandits = bandits;
	}

	public Integer getBanditsSymbolsId() {
		return this.banditsSymbolsId;
	}

	public void setBanditsSymbolsId(Integer banditsSymbolsId) {
		this.banditsSymbolsId = banditsSymbolsId;
	}

	public Symbols getSymbols() {
		return this.symbols;
	}

	public void setSymbols(Symbols symbols) {
		this.symbols = symbols;
	}

	public Bandits getBandits() {
		return this.bandits;
	}

	public void setBandits(Bandits bandits) {
		this.bandits = bandits;
	}

}
