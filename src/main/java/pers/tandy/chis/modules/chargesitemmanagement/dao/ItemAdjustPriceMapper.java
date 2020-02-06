package pers.tandy.chis.modules.chargesitemmanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemAdjustPrice;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemAdjustPriceExample;

public interface ItemAdjustPriceMapper {
    long countByExample(ItemAdjustPriceExample example);

    int deleteByExample(ItemAdjustPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemAdjustPrice record);

    int insertSelective(ItemAdjustPrice record);

    List<ItemAdjustPrice> selectByExample(ItemAdjustPriceExample example);

    ItemAdjustPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemAdjustPrice record, @Param("example") ItemAdjustPriceExample example);

    int updateByExample(@Param("record") ItemAdjustPrice record, @Param("example") ItemAdjustPriceExample example);

    int updateByPrimaryKeySelective(ItemAdjustPrice record);

    int updateByPrimaryKey(ItemAdjustPrice record);

    /*----------------------------------------------------------------------------------------------------------------*/
    int insertList(@Param("iapList") List<ItemAdjustPrice> itemAdjustPriceList);

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
