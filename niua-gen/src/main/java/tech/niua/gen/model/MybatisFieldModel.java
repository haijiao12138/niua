package tech.niua.gen.model;

import lombok.*;

/**
 * @date: 19-4-11 21:53
 * @description: 封装mybatis参数
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class MybatisFieldModel {
    private String column;
    private String jdbcType;
    private String property;
    private boolean keyFlag;


}
