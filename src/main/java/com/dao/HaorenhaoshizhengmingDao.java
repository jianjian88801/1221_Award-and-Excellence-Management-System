package com.dao;

import com.entity.HaorenhaoshizhengmingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaorenhaoshizhengmingVO;
import com.entity.view.HaorenhaoshizhengmingView;


/**
 * 好人好事证明
 * 
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface HaorenhaoshizhengmingDao extends BaseMapper<HaorenhaoshizhengmingEntity> {
	
	List<HaorenhaoshizhengmingVO> selectListVO(@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);
	
	HaorenhaoshizhengmingVO selectVO(@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);
	
	List<HaorenhaoshizhengmingView> selectListView(@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);

	List<HaorenhaoshizhengmingView> selectListView(Pagination page,@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);
	
	HaorenhaoshizhengmingView selectView(@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);
	
}
