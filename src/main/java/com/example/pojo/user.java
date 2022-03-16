package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小菜鸟
 * @create 2022-03-2022/3/14-16:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
//    @TableId
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
