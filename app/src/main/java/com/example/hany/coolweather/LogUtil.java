/**
 * Copyright (c) 2018. 6小h
 */

package com.example.hany.coolweather;

import android.util.Log;

/**
 * 工具类。
 * 用于打印日志信息。
 */
public class LogUtil {

    public static final int VERBOSE = 1;

    public static final int DEBUG = 2;

    public static final int INFO = 3;

    public static final int WARN = 4;

    public static final int ERROR = 5;

    public static final int NOTHING = 6;

    public static int level = VERBOSE;

    /**
     * 用于打印那些最为琐碎的、意义最小的信息。
     * 对应级别verbose，是Android日志里级别最低的一种。
     *
     * @param tag 标签
     * @param msg 标志信息
     */
    public static void v(String tag, String msg) {
        if (level <= VERBOSE) {
            Log.v(tag, msg);
        }
    }

    /**
     * 用于打印一些调试信息，这些细腻=信息对你调试程序和分析问题应该是有帮助的。
     * 对应级别debug，比verbose高一级。
     *
     * @param tag 标签
     * @param msg 标志信息
     */
    public static void d(String tag, String msg){
        if (level <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    /**
     * 用于打印一些比较重要的数据，这些数据应该是你非常想要看到的、可以帮助你分析用户行为数据。
     * 对应级别info，比debug高一级。
     *
     * @param tag 标签
     * @param msg 标志信息
     */
    public static void i(String tag, String msg) {
        if (level <= INFO) {
            Log.i(tag, msg);
        }
    }

    /**
     * 用于打印一些警信息，提示程序在这个地方可能会有潜在风险，最好去修复一下这些出现警告的地方。
     * 对应级别warn，比info高一级。
     *
     * @param tag 标签
     * @param msg 标志信息
     */
    public static void w(String tag, String msg) {
        if (level <= WARN) {
            Log.w(tag, msg);
        }
    }

    /**
     * 用于打印程序中的错误信息，比如程序进入到了catch语句当中。
     * 当有错误信息打印出来的时候，一般都代表你的程序出现严重问题了，必须尽快修复。
     * 对应级别error，比warn高一级。
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg) {
        if (level <= ERROR) {
            Log.e(tag, msg);
        }
    }
}
