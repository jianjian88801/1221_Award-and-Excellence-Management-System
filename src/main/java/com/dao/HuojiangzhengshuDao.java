package com.dao;

import com.entity.HuojiangzhengshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuojiangzhengshuVO;
import com.entity.view.HuojiangzhengshuView;


/**
 * 获奖证书
 * 
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface HuojiangzhengshuDao extends BaseMapper<HuojiangzhengshuEntity> {
	
	List<HuojiangzhengshuVO> selectListVO(@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);
	
	HuojiangzhengshuVO selectVO(@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);
	
	List<HuojiangzhengshuView> selectListView(@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);

	List<HuojiangzhengshuView> selectListView(Pagination page,@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);
	
	HuojiangzhengshuView selectView(@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);
	
}
