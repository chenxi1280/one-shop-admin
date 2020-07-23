package com.one.pojo.vo;


import com.oneentity.Role;
import lombok.Data;

import java.util.List;

/**
 * creator：杜夫人
 * date: 2020/5/28
 */
@Data
public class RoleVO extends Role {

    List<PermissionVO> permissionVOS;
}
