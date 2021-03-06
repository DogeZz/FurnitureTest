package com.tlb.dao;

import java.util.List;
import java.util.Map;

import com.tlb.common.PageParam;
import com.tlb.common.Pager;
import com.tlb.entity.TTlbDd;

public interface TTlbDdDao extends BaseDao<TTlbDd>{

	/**
	 * 保存.
	 */
	public void saveTTlbDd(TTlbDd tTlbDd);

	/**
	 * 根据yhid获取分页数据.
	 */
	public Pager<List<Map<String, Object>>> getTTlbDdListByYhid(PageParam page, String yhid, Integer zt);

	/**
	 * 获取实体.
	 */
	public TTlbDd getTTlbDd(String ddid);

	/**
	 * 获取分页数据.
	 */
	public Pager<List<Map<String, Object>>> getTTlbDds(PageParam page, String name);

	public int getCountByJjid(String jjid);


}
