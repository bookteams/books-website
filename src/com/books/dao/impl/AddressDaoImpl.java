package com.books.dao.impl;


import java.util.List;

import com.books.dao.AddressDao;
import com.books.model.Address;
import com.books.util.SqlHelper;


/**
* @ClassName: AddressDaoImpl
* @Description: 收货地址数据库操作
* @author 李勇超
* @date 2018年12月13日上午10:26:30
*
*/
public class AddressDaoImpl implements AddressDao {
	
	// 通过bcId查询用户所有的地址信息
	@Override
	public List<Address>  getAddressByBcId(Integer bcId) {
		return SqlHelper.executeQuery(Address.class, "select book_address.* where bcId="+bcId);
	}

	// 添加
	@Override
	public int insertAddress(Address address) {
		return SqlHelper.executeInsert("book_address", address);
	}

	// 通过bsId删除地址
	@Override
	public int deleteAddressById(Integer bsId) {
		return SqlHelper.executeNoQuery("delete from book_address where bsId="+bsId);
	}

	// 通过bsId进行修改地址
	@Override
	public int updateAddressById(Address address) {
		return SqlHelper.executeUpdate("book_address", address, "where bsId="+address.getBsId());
	}
	
	
}
