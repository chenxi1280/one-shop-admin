package com.one.pojo.vo;import com.oneentity.OrderItem;
import lombok.Data;

/**
 * creator：杜夫人
 * date: 2020/6/12
 */
@Data
public class OrderItemVO extends OrderItem {
    private Integer count;
    public Integer getCount() {
        try {
            return    Integer.valueOf(getGoodsCount());
        } catch (Exception e) {
        }
        return 0;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
}
