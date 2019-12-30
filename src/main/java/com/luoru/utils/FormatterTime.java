package com.luoru.utils;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author: Luoru
 * @Date: 2019/12/29 3:15
 * @Description: 时间字符串表示工具类
 */
public class FormatterTime {

    /**
     * @return 以yy-MM-dd HH:mm:ss表示当前时间
     */
    public static String getNowDate() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(now);
    }

}
