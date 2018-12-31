package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
//C
	public void join(String id, String name, String pass, String ssn);
//R
	public void findMemberInfo();
	public ArrayList<MemberBean> findMemberAll();
	public ArrayList<MemberBean> findMemberName(String name);
	public MemberBean findMemberId(String id);
	public boolean login(String id, String pass);
	
	public int countMember();
	
//U
	public void updatePass(String id, String pass, String newPass);
//D
	public void deleteInfo(String id, String pass);
}
