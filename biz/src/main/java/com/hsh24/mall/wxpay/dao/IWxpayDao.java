package com.hsh24.mall.wxpay.dao;

import com.wideka.weixin.api.pay.bo.WxNotify;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IWxpayDao {

	/**
	 * 
	 * @param wxNotify
	 * @return
	 */
	void createWxNotify(WxNotify wxNotify);

}
