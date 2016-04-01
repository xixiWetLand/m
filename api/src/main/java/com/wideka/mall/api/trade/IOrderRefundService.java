package com.wideka.mall.api.trade;

import com.wideka.mall.api.trade.bo.OrderRefund;
import com.wideka.mall.framework.bo.BooleanResult;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IOrderRefundService {

	/**
	 * 
	 * @param shopId
	 * @param tradeNo
	 * @param refundNo
	 * @param orderId
	 * @param orderRefund
	 * @param modifyUser
	 * @return
	 */
	BooleanResult createOrderRefund(Long shopId, String tradeNo, String refundNo, Long orderId,
		OrderRefund orderRefund, String modifyUser);

}
