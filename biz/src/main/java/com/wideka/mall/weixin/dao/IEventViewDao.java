package com.wideka.mall.weixin.dao;

import com.wideka.weixin.api.callback.bo.Content;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IEventViewDao {

	/**
	 * 
	 * @param content
	 * @return
	 */
	Long createEventView(Content content);

}
