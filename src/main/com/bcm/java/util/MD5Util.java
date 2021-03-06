package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public static String getMD5(String str) throws RuntimeException {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            String s = new BigInteger(1, md.digest()).toString(16);
            s = s.substring(0,6)+s.substring(18,24)+s.substring(6,12)+s.substring(24,32)+s.substring(12,18);
            return s;
        } catch (Exception e) {
            throw new RuntimeException("MD5加密出错,请输入其他密码");
        }
    }
}

