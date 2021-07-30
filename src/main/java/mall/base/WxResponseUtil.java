package mall.base;

/**
 * @author elmer
 * @date 2021/7/30 11:30
 */
public class WxResponseUtil extends ResponseUtil {
    /**
     * 按枚举返回错误响应结果
     *
     * @param orderUnknown
     * @return
     */
    public static Object fail(WxResponseCode responseCode) {
        return fail(responseCode.code(), responseCode.desc());
    }
}
