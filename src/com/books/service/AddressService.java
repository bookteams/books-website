package com.books.service;

import java.util.List;

import com.books.model.Address;
/**
* @ClassName: AddressDao
* @Description: ��ַҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:04:37
*
*/
public interface AddressService {
	
	// ͨ��bcId��ѯ�û����еĵ�ַ��Ϣ
	public List<Address>  getAddressByBcId(Integer bcId); 
	    
	// ���
	public int insertAddress(Address address);
	 	
	// ͨ��bsIdɾ����ַ
	public int deleteAddressById(Integer bsId); 
	 	
	// ͨ��bsId�����޸ĵ�ַ
	public int updateAddressById(Address address);

}
