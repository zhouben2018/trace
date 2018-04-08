package com.zben.cupid.trace.util;


/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:47 2018/4/4
 */
public class HashUtil {

    private static char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static char[] charDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public HashUtil() {
    }
    public static String convertToHashStr(long hid, int len) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < len; ++i) {
            char c = charDigits[(int)((hid & 255L) % (long)charDigits.length)];
            sb.append(c);
            hid >>= 6;
        }

        return sb.toString();
    }
}
