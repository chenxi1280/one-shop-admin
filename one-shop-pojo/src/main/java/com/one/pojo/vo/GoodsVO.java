package com.one.pojo.vo;import com.oneentity.Goods;
import lombok.Data;

/**
 * creator：杜夫人
 * date: 2020/6/5
 */
@Data
public class GoodsVO extends Goods {

    private String updateUserName;// 更新人的名字
    private Integer shopCarCount;// 购物车的数量
}
