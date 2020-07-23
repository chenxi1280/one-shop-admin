package com.one.pojo.vo;import com.oneentity.BusinessType;
import lombok.Data;

import java.util.List;

/**
 * creator：杜夫人
 * date: 2020/6/4
 */
@Data
public class BusinessTypeVO extends BusinessType {
    List<BusinessTypeVO> children;// 所有子类型
}
