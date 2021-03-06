package pers.tandy.chis.modules.purchasemanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.purchasemanagement.bean.Supplier;
import pers.tandy.chis.modules.purchasemanagement.bean.SupplierExample;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    /*----------------------------------------------------------------------------------------------------------------*/

    void addArrearagesAmount(@Param("id") Integer id,
                             @Param("amount") Float amount);

    void subtractArrearagesAmount(@Param("id") Integer id,
                                  @Param("amount") Float amount);

    List<Map<String, Object>> selectByCriteria(@Param("name") String name,
                                               @Param("contacterPhone") String contacterPhone,
                                               @Param("state") Boolean state,
                                               @Param("arrearagesAmount") Float arrearagesAmount,
                                               @Param("arrearagesLimit") Float arrearagesLimit,
                                               @Param("arrearagesDays") Integer arrearagesDays);

    List<Map<String, Object>> selectEnabledLikeByName(@Param("name") String name);
}
