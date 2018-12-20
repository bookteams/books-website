package com.books.service;

import java.util.List;

import com.books.model.Address;
/**
* @ClassName: AddressDao
* @Description: 地址业务接口
* @author 李勇超
* @date 2018年12月20日下午3:04:37
*
*/
public interface AddressService {
	
	// 通过bcId查询用户所有的地址信息
	public List<Address>  getAddressByBcId(Integer bcId); 
	    
	// 添加
	public int insertAddress(Address address);
	 	
	// 通过bsId删除地址
	public int deleteAddressById(Integer bsId); 
	 	
	// 通过bsId进行修改地址
	public int updateAddressById(Address address);

}
