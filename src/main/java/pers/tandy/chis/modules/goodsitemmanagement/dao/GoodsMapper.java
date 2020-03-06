package pers.tandy.chis.modules.goodsitemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.goodsitemmanagement.bean.Goods;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsExample;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    /*---------------------------------------------------------------------------------------------------------------*/
    // void updateRetailPriceByList(@Param("goodsList") List<Goods> goodsList);

    void updateRetailPriceById(@Param("retailPrice") Float retailPrice,
                               @Param("splitPrice") Float splitPrice,
                               @Param("id") Integer id);

    List<Map<String, Object>> selectByCriteria(@Param("oid") String oid,
                                               @Param("gsmGoodsTypeId") Integer gsmGoodsTypeId,
                                               @Param("goodsClassifyId") Integer goodsClassifyId,
                                               @Param("state") Boolean state,
                                               @Param("name") String name);

    List<Map<String, Object>> selectEnabledLikeByName(@Param("name") String name);

    List<Map<String, Object>> selectEnabledLikeByNameForPlan(@Param("sysClinicId") Integer sysClinicId,
                                                             @Param("name") String name);

    List<Map<String, Object>> selectEnabledLikeByNameForPrescription(@Param("sysClinicId") Integer sysClinicId,
                                                                     @Param("gsmGoodsTypeId") Integer gsmGoodsTypeId,
                                                                     @Param("name") String name);
}
