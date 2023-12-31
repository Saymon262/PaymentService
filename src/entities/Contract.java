package entities;

public class Contract {
	
	private Integer account;
	private String date;
	private Double value;
	
	public Contract() {
		super();
	}

	public Contract(Integer account, String date, Double value) {
		super();
		this.account = account;
		this.date = date;
		this.value = value;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}
}
