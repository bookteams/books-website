package com.books.service.impl;

import java.util.List;

import com.books.dao.AddressDao;
import com.books.dao.impl.AddressDaoImpl;
import com.books.model.Address;
import com.books.service.AddressService;

/**
* @ClassName: AddressServiceImpl
* @Description: 地址业务实现
* @author 李勇超
* @date 2018年12月20日下午3:06:35
*
*/
public class AddressServiceImpl implements AddressService {
	
	private AddressDao addressDao=new AddressDaoImpl();

	@Override
	public List<Address> getAddressByBcId(Integer bcId) {
		return addressDao.getAddressByBcId(bcId);
	}

	@Override
	public int insertAddress(Address address) {
		return addressDao.insertAddress(address);
	}

	@Override
	public int deleteAddressById(Integer bsId) {
		return addressDao.deleteAddressById(bsId);
	}

	@Override
	public int updateAddressById(Address address) {
		return addressDao.updateAddressById(address);
	}

}
