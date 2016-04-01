package com.wideka.mall.weixin.dao.impl;

import com.wideka.mall.framework.dao.impl.BaseDaoImpl;
import com.wideka.mall.weixin.dao.IEventScanCodeDao;
import com.wideka.weixin.api.callback.bo.Content;

/**
 * 
 * @author JiakunXu
 * 
 */
public class EventScanCodeDaoImpl extends BaseDaoImpl implements IEventScanCodeDao {

	@Override
	public Long createEventScanCode(Content content) {
		return (Long) getSqlMapClientTemplate().insert("weixin.event.scanCode.createEventScanCode", content);
	}

}
