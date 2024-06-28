package com.dao;

import com.entity.YuanxixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxixinxiVO;
import com.entity.view.YuanxixinxiView;


/**
 * 院系信息
 * 
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface YuanxixinxiDao extends BaseMapper<YuanxixinxiEntity> {
	
	List<YuanxixinxiVO> selectListVO(@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);
	
	YuanxixinxiVO selectVO(@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);
	
	List<YuanxixinxiView> selectListView(@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);

	List<YuanxixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);
	
	YuanxixinxiView selectView(@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);
	
}
