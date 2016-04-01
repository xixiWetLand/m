package com.wideka.mall.weixin.service.impl;

import com.wideka.mall.api.weixin.IEventViewService;
import com.wideka.mall.framework.bo.BooleanResult;
import com.wideka.mall.framework.log.Logger4jCollection;
import com.wideka.mall.framework.log.Logger4jExtend;
import com.wideka.mall.framework.util.LogUtil;
import com.wideka.mall.weixin.dao.IEventViewDao;
import com.wideka.weixin.api.callback.bo.Content;

/**
 * 
 * @author JiakunXu
 * 
 */
public class EventViewServiceImpl implements IEventViewService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(EventViewServiceImpl.class);

	private IEventViewDao eventViewDao;

	@Override
	public BooleanResult createEventView(Content content) {
		BooleanResult result = new BooleanResult();
		result.setResult(false);

		if (content == null) {
			result.setCode("content 信息不能为空。");
			return result;
		}

		try {
			Long id = eventViewDao.createEventView(content);
			result.setCode(id.toString());
			result.setResult(true);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(content), e);

			result.setCode("写入 weixin_tb_event_view 表失败。");
		}

		return result;
	}

	public IEventViewDao getEventViewDao() {
		return eventViewDao;
	}

	public void setEventViewDao(IEventViewDao eventViewDao) {
		this.eventViewDao = eventViewDao;
	}

}
