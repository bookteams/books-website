package com.books.service;

import com.books.model.Admin;

/**
* @ClassName: AdminService
* @Description: ����Աҵ��ӿ�
* @author ���³�
* @date 2018��12��20������7:38:11
*
*/
public interface AdminService {
	
	//��¼
	public Admin loginAdmin(String bnName,String bnPassword);
		
	//���
	public int insertAdmin(Admin admin);
		
	//�޸�
	public int updateAdmin(Admin admin);
		
	//ɾ��
	public int deleteAdmin(Integer bnId);

}
