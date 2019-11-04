package com.taotao.service;

import com.taotao.pojo.TbItem;

/**
 * Created by zhangpan on 2019/11/1.
 * 根据id 查询商品信息
 */
public interface ItemService {
	public TbItem getItemById(long itemId);
}
