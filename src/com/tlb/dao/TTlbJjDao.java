package com.tlb.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tlb.common.PageParam;
import com.tlb.common.Pager;
import com.tlb.entity.TTlbJj;

@Entity
@Table(name = "t_tlb_jj")
public interface TTlbJjDao extends BaseDao<TTlbJj> {
	
	/**
	 * 通过标题来获取家具实体.
	 */
	public TTlbJj getTTlbShByjjbt(String jjbt);

	/**
	 * 根据分页参数以及关键字获取用户数据.
	 */
	public Pager<TTlbJj> getTTlbJjs(PageParam page,String name);

	/**
	 * 通过家具id来获取家具实体.
	 */
	public TTlbJj getTTlbJj(String jjid);

	/**
	 * 保存家具.
	 */
	public void saveTTlbJj(TTlbJj tTlbJj);

	public Pager<TTlbJj> getTTlbJjs(PageParam page, String keyword, String lx1, String lx2, String lx3, String lx4);
}
