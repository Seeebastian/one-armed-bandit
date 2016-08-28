package database;

public class Players implements java.io.Serializable {

	private Integer playerId;
	private String playerName;
	private Integer playerPoints;
	private boolean playerIfAdmin;
	private String password;
	private String email;

	public Players() {
	}

	public Players(String playerName, boolean playerIfAdmin, String password, String email) {
		this.playerName = playerName;
		this.playerIfAdmin = playerIfAdmin;
		this.password = password;
		this.email = email;
	}

	public Players(String playerName, Integer playerPoints, boolean playerIfAdmin, String password, String email) {
		this.playerName = playerName;
		this.playerPoints = playerPoints;
		this.playerIfAdmin = playerIfAdmin;
		this.password = password;
		this.email = email;
	}

	public Integer getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getPlayerPoints() {
		return this.playerPoints;
	}

	public void setPlayerPoints(Integer playerPoints) {
		this.playerPoints = playerPoints;
	}

	public boolean isPlayerIfAdmin() {
		return this.playerIfAdmin;
	}

	public void setPlayerIfAdmin(boolean playerIfAdmin) {
		this.playerIfAdmin = playerIfAdmin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
