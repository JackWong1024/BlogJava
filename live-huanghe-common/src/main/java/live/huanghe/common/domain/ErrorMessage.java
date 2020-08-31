package live.huanghe.common.domain;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessage {

	private static Map<Integer, String> commonMap = new HashMap<>();

	static {
		commonMap.put(-4002, "未配置支付参数，无法提现");

	}

	public static String getCommonError(int errorCode) {
		
		String message = commonMap.get(errorCode);
		return message==null?"Unknown":message;
	}

	public static String getSmsError(int errorCode) {
		if(errorCode > 0)return "短信发送失败";
		return getCommonError(errorCode);
	}

}
