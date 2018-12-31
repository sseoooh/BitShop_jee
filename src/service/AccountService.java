package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	
	//C
	public void creatAccount(int money);
	public String creatAccountNum();
	
	//R
	public ArrayList<AccountBean> findByAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public void findDate();
	
	//U
	public void depositMoney(String accountNum, int money);
	public void withdrawMoney(String accountNum, int money);
	
	//D
	public void deleteAccount(String accountNum);
}
