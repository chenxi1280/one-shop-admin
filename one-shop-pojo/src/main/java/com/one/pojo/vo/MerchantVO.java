package com.one.pojo.vo;


import com.one.pojo.entity.Merchant;
import lombok.Data;

import java.util.List;

/**
 * creator：杜夫人
 * date: 2020/6/5
 */
@Data
public class MerchantVO extends Merchant {
    private GoodsVO bestGoods;
//    private List<GoodsTypeVO> goodsTypeList;


}
