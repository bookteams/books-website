package com.books.dao.impl;


import java.util.List;

import com.books.dao.AddressDao;
import com.books.model.Address;
import com.books.util.SqlHelper;


/**
* @ClassName: AddressDaoImpl
* @Description: �ջ���ַ���ݿ����
* @author ���³�
* @date 2018��12��13������10:26:30
*
*/
public class AddressDaoImpl implements AddressDao {
	
	// ͨ��bcId��ѯ�û����еĵ�ַ��Ϣ
	@Override
	public List<Address>  getAddressByBcId(Integer bcId) {
		return SqlHelper.executeQuery(Address.class, "select book_address.* where bcId="+bcId);
	}

	// ���
	@Override
	public int insertAddress(Address address) {
		return SqlHelper.executeInsert("book_address", address);
	}

	// ͨ��bsIdɾ����ַ
	@Override
	public int deleteAddressById(Integer bsId) {
		return SqlHelper.executeNoQuery("delete from book_address where bsId="+bsId);
	}

	// ͨ��bsId�����޸ĵ�ַ
	@Override
	public int updateAddressById(Address address) {
		return SqlHelper.executeUpdate("book_address", address, "where bsId="+address.getBsId());
	}
	
	
}
