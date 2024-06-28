package com.dao;

import com.entity.JiangxuejinhuodeqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangxuejinhuodeqingkuangVO;
import com.entity.view.JiangxuejinhuodeqingkuangView;


/**
 * 奖学金获得情况
 * 
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface JiangxuejinhuodeqingkuangDao extends BaseMapper<JiangxuejinhuodeqingkuangEntity> {
	
	List<JiangxuejinhuodeqingkuangVO> selectListVO(@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
	
	JiangxuejinhuodeqingkuangVO selectVO(@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
	
	List<JiangxuejinhuodeqingkuangView> selectListView(@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);

	List<JiangxuejinhuodeqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
	
	JiangxuejinhuodeqingkuangView selectView(@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
	
}
