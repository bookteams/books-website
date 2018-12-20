package com.books.dao;

import java.util.List;

import com.books.model.Address;
/**
* @ClassName: AddressDao
* @Description: 地址接口
* @author 李勇超
* @date 2018年12月20日下午3:07:01
*
*/
public interface AddressDao {
	
	// 通过bcId查询用户所有的地址信息
	public List<Address>  getAddressByBcId(Integer bcId); 
    
    // 添加
 	public int insertAddress(Address address);
 	
    // 通过bsId删除地址
 	public int deleteAddressById(Integer bsId); 
 	
    // 通过bsId进行修改地址
 	public int updateAddressById(Address address);

}
