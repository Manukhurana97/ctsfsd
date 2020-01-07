package pack;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Account {
	
	private String Account_no;
	private String Acc_Name;
	private double Amount;
	private LocalDate dateofOpening;
	private Accounttype accounttype;
	
	private static Account acc;
	
	static{
		acc = new Account();
	}
	 
		
	public static Account createAccount(Accounttype accounttype, double amount, String Acc_Name )
	{
		acc.setAccount_no(UUID.randomUUID().toString());
		acc.setAcc_Name(Acc_Name);
		acc.setAmount(amount);
		acc.setAccounttype(accounttype);
		acc.setDateofOpening(LocalDate.now());
		return acc;
		
		
	}
	
	
	public void display_info() 
	{
		String arr[] = getAccount_no().split("-");
		System.out.print(arr[0]+"\n"+getAmount()+"\n"+getDateofOpening()+"\n"+getAcc_Name());
	}

}
