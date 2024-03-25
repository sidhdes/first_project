package motor_servicing_bill;

public class two_wheeler {

	private int price;
	private Boolean moped;
	private int oil=500;
	private int synthetic_oil=1000;
	private int deleivery = 200;
	private int basicprice;
	private boolean isoiladded=false;
	private boolean issyntheticadded=false;
	private boolean isdeleiverydone=false;
	 public two_wheeler(Boolean moped) {
		 this.moped=moped;
		 if(this.moped) {
			 this.price=2000;
		 }
		 else {
			 this.price=3000;
		 }
		 basicprice=this.price;
	 }
	
public void oil() {
	isoiladded=true;

	this.price+=oil;
}

public void synthetic_oil() {
	issyntheticadded=true;

	this.price+=synthetic_oil;
}

public void deleivery() {
	isdeleiverydone=true;
	
	this.price+=deleivery;
}
public void getbill() {
	String bill="";
	System.out.println("Bhama_auto servicing charges: " +basicprice);
	if(isoiladded) {
		bill += "basic oil added: " +oil+ "\n";
	}
	if(issyntheticadded) {
		bill += "syntheic oil added: " +synthetic_oil+ "\n";
	}
	if(isdeleiverydone) {
		bill += "deleivery is done: " +deleivery+ "\n";
	}
	bill += "total bill: "+this.price + "\n";
	System.out.println(bill);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 two_wheeler t1 = new two_wheeler(true);
		t1.oil();
		t1.synthetic_oil();
		t1.deleivery();
		t1.getbill();
	}

}
