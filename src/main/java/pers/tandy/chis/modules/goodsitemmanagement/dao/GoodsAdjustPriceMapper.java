package pers.tandy.chis.modules.goodsitemmanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsAdjustPrice;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsAdjustPriceExample;

public interface GoodsAdjustPriceMapper {
    long countByExample(GoodsAdjustPriceExample example);

    int deleteByExample(GoodsAdjustPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsAdjustPrice record);

    int insertSelective(GoodsAdjustPrice record);

    List<GoodsAdjustPrice> selectByExample(GoodsAdjustPriceExample example);

    GoodsAdjustPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsAdjustPrice record, @Param("example") GoodsAdjustPriceExample example);

    int updateByExample(@Param("record") GoodsAdjustPrice record, @Param("example") GoodsAdjustPriceExample example);

    int updateByPrimaryKeySelective(GoodsAdjustPrice record);

    int updateByPrimaryKey(GoodsAdjustPrice record);


    /*----------------------------------------------------------------------------------------------------------------*/
    int insertList(@Param("gapList") List<GoodsAdjustPrice> goodsAdjustPriceList);

    List<Map<String, Object>> selectByLsh(@Param("lsh") String lsh);

    int updateByLsh(@Param("lsh") String lsh,
                    @Param("approverId") Integer approverId,
                    @Param("approveDate") Date approveDate,
                    @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("name") String name,
                                               @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                        @Param("lsh") String lsh,
                                                        @Param("approveState") Byte approveState);

}
