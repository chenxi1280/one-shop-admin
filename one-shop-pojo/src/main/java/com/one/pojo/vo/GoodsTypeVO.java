package com.one.pojo.vo;import com.oneentity.GoodsType;
import lombok.Data;

import java.util.List;

/**
 * creator：杜夫人
 * date: 2020/6/8
 */
@Data
public class GoodsTypeVO extends GoodsType {

    List<GoodsVO> goodsVOS;// 这种类型的商品集


}
