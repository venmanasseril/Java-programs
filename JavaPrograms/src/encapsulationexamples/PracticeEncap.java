package encapsulationexamples;

public class PracticeEncap {
	private String customerName;
	private double fund;
	
	public void setCustomerName(String name) {
		customerName = name;
	}
	
	public void setFund(double amount) {
		fund = amount;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public double getFund() {
		return fund;
	}
	
	public static void main(String args[]) {
		PracticeEncap practiceencap = new PracticeEncap();
		practiceencap.setCustomerName("Roy thomas");
		practiceencap.setFund(50000.5);
		System.out.println(practiceencap.getCustomerName());
		System.out.println(practiceencap.getFund());
		
	}

}
