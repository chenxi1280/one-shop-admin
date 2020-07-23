package com.one.pojo.entity;

import java.util.Date;
import lombok.Data;

/**
 * cards
 * @author 
 */
@Data
public class Cards implements Serializable {
    /**
     * 卡片主键id
     */
    private Long cardId;

    /**
     * 卡片激活码
     */
    private Long cardPass;

    /**
     * 卡片对应商户
     */
    private Long merchantId;

    /**
     * 卡片注册时间
     */
    private Date cardCreatetime;

    /**
     * 卡片使用时间
     */
    private Date cardUsetime;

    private static final long serialVersionUID = 1L;
}