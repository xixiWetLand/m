package com.wideka.mall.weixin.service.impl;

import com.wideka.mall.api.weixin.IEventScanCodeService;
import com.wideka.mall.framework.bo.BooleanResult;
import com.wideka.mall.framework.log.Logger4jCollection;
import com.wideka.mall.framework.log.Logger4jExtend;
import com.wideka.mall.framework.util.LogUtil;
import com.wideka.mall.weixin.dao.IEventScanCodeDao;
import com.wideka.weixin.api.callback.bo.Content;

/**
 * 
 * @author JiakunXu
 * 
 */
public class EventScanCodeServiceImpl implements IEventScanCodeService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(EventScanCodeServiceImpl.class);

	private IEventScanCodeDao eventScanCodeDao;

	@Override
	public BooleanResult createEventScanCode(Content content) {
		BooleanResult result = new BooleanResult();
		result.setResult(false);

		if (content == null) {
			result.setCode("content 信息不能为空。");
			return result;
		}

		try {
			Long id = eventScanCodeDao.createEventScanCode(content);
			result.setCode(id.toString());
			result.setResult(true);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(content), e);

			result.setCode("写入 weixin_tb_event_scancode 表失败。");
		}

		return result;
	}

	public IEventScanCodeDao getEventScanCodeDao() {
		return eventScanCodeDao;
	}

	public void setEventScanCodeDao(IEventScanCodeDao eventScanCodeDao) {
		this.eventScanCodeDao = eventScanCodeDao;
	}

}
