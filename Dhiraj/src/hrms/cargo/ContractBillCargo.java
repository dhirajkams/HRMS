package hrms.cargo;

public class ContractBillCargo {
	private String Name;
	private String Invoice_No;
	private String Client;
	private int Billing_Amount;
	private String Status;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getInvoice_No() {
		return Invoice_No;
	}
	public void setInvoice_No(String invoice_No) {
		Invoice_No = invoice_No;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public int getBilling_Amount() {
		return Billing_Amount;
	}
	public void setBilling_Amount(int billing_Amount) {
		Billing_Amount = billing_Amount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	

}
