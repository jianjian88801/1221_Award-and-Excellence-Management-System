package com.dao;

import com.entity.JilvtongbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JilvtongbaoVO;
import com.entity.view.JilvtongbaoView;


/**
 * 纪律通报
 * 
 * @author 
 * @email 
 * @date 2021-04-29 10:40:58
 */
public interface JilvtongbaoDao extends BaseMapper<JilvtongbaoEntity> {
	
	List<JilvtongbaoVO> selectListVO(@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);
	
	JilvtongbaoVO selectVO(@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);
	
	List<JilvtongbaoView> selectListView(@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);

	List<JilvtongbaoView> selectListView(Pagination page,@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);
	
	JilvtongbaoView selectView(@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);
	
}
