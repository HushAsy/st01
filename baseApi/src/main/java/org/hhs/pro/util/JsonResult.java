package org.hhs.pro.util;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JsonResult {
    private int resultCode;
    private String message;
    private Object result;
}
