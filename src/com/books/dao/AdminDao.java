package com.books.dao;

import com.books.model.Admin;

/**
* @ClassName: AdminDao
* @Description: ����Ա�����ӿ�
* @author ���³�
* @date 2018��12��19������11:16:05
*
*/
public interface AdminDao {
	
	//��¼
	public Admin loginAdmin(String bnName,String bnPassword);
	
	//���
	public int insertAdmin(Admin admin);
	
	//�޸�
	public int updateAdmin(Admin admin);
	
	//ɾ��
	public int deleteAdmin(Integer bnId);

}
