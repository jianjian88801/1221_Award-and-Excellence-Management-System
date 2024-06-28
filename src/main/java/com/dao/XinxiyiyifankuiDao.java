package com.dao;

import com.entity.XinxiyiyifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxiyiyifankuiVO;
import com.entity.view.XinxiyiyifankuiView;


/**
 * 信息异议反馈
 * 
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface XinxiyiyifankuiDao extends BaseMapper<XinxiyiyifankuiEntity> {
	
	List<XinxiyiyifankuiVO> selectListVO(@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);
	
	XinxiyiyifankuiVO selectVO(@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);
	
	List<XinxiyiyifankuiView> selectListView(@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);

	List<XinxiyiyifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);
	
	XinxiyiyifankuiView selectView(@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);
	
}
