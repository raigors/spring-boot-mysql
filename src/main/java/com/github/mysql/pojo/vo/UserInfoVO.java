package com.github.mysql.pojo.vo;

import com.github.mysql.pojo.orm.RoleInfoDO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * <p>
 * 创建时间为 下午2:36 2020/3/16
 * 项目名称 spring-boot-mysql
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Value
@ToString
@RequiredArgsConstructor
public class UserInfoVO implements Serializable {

    private static final long serialVersionUID = 8795817443828424498L;

    String username;

    Integer age;
    // 不支持
    // Set<RoleInfoDO> roles;

}
