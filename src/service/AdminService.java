package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
//C
	public void createAdmin(String name, String pass, String auth);
	
//R
	public ArrayList<AdminBean> list();
	public ArrayList<AdminBean> findByAuth(String auth);	
	public AdminBean findById(String admin);
	
	public int countAdmin();

	public boolean adminLogin(String adminNum, String pass);
//U
	public void modifyAdminPass(String adminNum, String pass, String newPass);
//D
	public void deleteAdmin(String adminNum, String pass);
}
