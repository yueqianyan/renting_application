package com.jzq.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianzhiqiang
 * @date 2021/2/26 22:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int code;
    private Object data;
}
