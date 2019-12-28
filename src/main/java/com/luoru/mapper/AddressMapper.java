package com.luoru.mapper;

import com.luoru.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author: Luoru
 * @Date: 2019/12/27 11:35
 * @Description: Address持久层接口
 */
@Repository
public interface AddressMapper {

    /**
     * 查询用户保存的地址
     *
     * @param userId 用户Id
     * @return 用户保存的所有地址信息
     */
    ArrayList<Address> findAddressByUserId(int userId);

    /**
     * 保存地址信息
     *
     * @param address 待保存的地址信息
     */
    void insertAddress(Address address);

    /**
     * 更新地址信息
     *
     * @param address 新的地址信息
     * @return SQL执行状态(0执行失败 1执行成功)
     */
    int updateAddress(Address address);

    /**
     * 删除地址
     *
     * @param address 需删除的地址
     * @return SQL执行状态(0执行失败 1执行成功)
     */
    int deleteAddress(Address address);

    /**
     * 查询用户的默认地址
     *
     * @param userId 用户Id
     * @return 该用户的默认地址Id
     */
    int findDefaultAddress(int userId);

    /**
     * 修改用户的默认地址
     *
     * @param userId    用户Id
     * @param addressId 新的默认地址Id
     * @return SQL执行状态(0执行失败 1执行成功)
     */
    int updateDefaultAddress(@Param("userId") int userId, @Param("addressId") int addressId);

}
