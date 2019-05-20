package cn.jlw.utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/10 13:41
 */
public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092500596032";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCec72WABEY3UJzBqgMO+xAd570xDTVMtsFMwZVBtBJElBo0mrpbWrQiQW6UpnKMiSHK6QsrIIjXbDMugcbHUqk4e599Re1+jPXQmDqPT9uB9JesNMP2c/RrGuyRb4AAu57g/uv6+rbnxYagwMI2qC2TF7MujbX7gw/6bhEYrW95qf7gZSxTu6bNZnMift1DwW4Hi+SsHOvRFhPrrWG0wmdusT2zIe4yUGa/9o68Yfx2nBSGICbD7raXgkikUr7IUoYeALwNcBnIjyvJ08lBcE6JODVQMMAYI4ciy0wv0h/tpQtkN9Ek0ds+WRtafuVDA2lsqcWpyeNucopZC3ozFPDAgMBAAECggEBAJe3+zBFoBlOwvGgzgfo2K5h27JCrNP3ff/ce5OukoFlJ9k2oWghfMVwbiuaK+ePW6qR/wFHrNRwQXnGJkewJGj8bH/uzmVQzZKv3FxtiO6yTpycc3wZ8wOxNO3eGa+pHvDlz3kDTD4+dcus5przvC7RsXQWWa0oIlKQWAAjBCJv13XYtyCavnfgC1V5XOiY+mivAuBT4jAEtWrBzCg3AY1YsgUbBc/rqO4cuBXAXWN+3o+9fz+JiSPj8yFH/KpU3XWfIwfWtN0EPSi3vIfGpKM0KqCSdkT+/goH/TjZqqaFaYkLCB2KPzlQi2AdKVr8+8oh3Eo+xTdcL2TFu9ShOQECgYEAygqEQCRo8y3nd2duQTZvyRmXjot7m+JyCboYCf1aW1V0Kc6SoQZBYL8bhbAgiKU621G1Hj+hei/+cB93mRLgVe0wLFOt0EPlJAz8TAnDegMJL1G3rzo9wjHHmrQgzWdMG/nWUXSKgyML3I8l10HgU/L3u8UbWCeEbNHGU9ioXH8CgYEAyMUPbFZB49pRH7I92wDqScwtriaTN5rLXaoevFYncQnmAUC3LjEWuXWm0WYp84jR9tnksZxGqXBblmE+YvuiLbJoxAumoTUmy/NIO6J9waB85LvQADoasLoLu/8zriNQ8phLppTSeRR4aYOAi7/CSDmX6CLUuNrpGTGKqL1i9r0CgYEAyZmo0SADoPNjDaAlQekBrhZdRh0kIC3aQJ5yMjWdnZktKjI32XkWb2UCH2nZbMACdKmZIi+3/uY46sRbYGCXfOYJtZFh1HiLAmf6sBzl8q9o0NCniq+AxG9LjrDCMnMqXJf1JJ43QBcOVOx5g8r1/o5oZ/KMEHCOEM9ZKHz9sh0CgYEAl5IWK78PLXrThe9lvWH6fs5TqkdbGz6Uy9i0LZGJY1CKwWVfJdNPiaIl166ee0pO4WLswZ3uxtqZenVdyRKaBI/Ngjwdh1T+PjkjzknFURndUD3uMU2sesFqPHrVRGFLKmsJqfBu2ZQ3t8jckiSqAybf5RPursQt+KQrP2sDPK0CgYAlRVFL8uH2hcW7Rw7XjMD+dOFae2GTbYHyKcAmrRKMDnwYt9krKFQXaBgtYnrSdR0IXUNcdXNSTyNBTJYETRh7HXZtABeJ6dO719Y/xTZRcYz5gPeV6Cx0EmdPrZLtA7z5xw2lZvDCx/d10hOIMPs3VV0z9lzYurCdazln58r8eA==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA48Vhn/VKH7Rer1yq4JlZrVAu/0rwm8qv/Q4xeQpumbeVUueokakmcp5ptF1Y+x8SP7+3JGjgktfWZsBRMy/ecBGuAmGgQqo/jdpEMWzdj/JoQXKRIk68Lz+hCq/D4V0v3bTYCCqjvyo1rbYXl7dHkMctEPR+dhbKICrkQ02pGufHhCEgBuS6xGTJHMsObRs5TeSzmmvo129tRUGAuXtniU9s5/nHEsZMojOpVBRn/S1mCAYzAHTtmcFGn3/ZawwllZu5PvSkIy5t+XwCbHz8RC4v0vAU/Qb7psrmQ2jqBe42twfJ83HafgadMKmTv7gMbm6OU57FhIwwWZz2l4R8jwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipay/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    // 支付宝网关
    public static String log_path = "d:\\text";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
