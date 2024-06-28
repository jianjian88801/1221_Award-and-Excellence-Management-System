package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangxuejinshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangxuejinshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangxuejinshenqingView;


/**
 * 奖学金申请
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface JiangxuejinshenqingService extends IService<JiangxuejinshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangxuejinshenqingVO> selectListVO(Wrapper<JiangxuejinshenqingEntity> wrapper);
   	
   	JiangxuejinshenqingVO selectVO(@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);
   	
   	List<JiangxuejinshenqingView> selectListView(Wrapper<JiangxuejinshenqingEntity> wrapper);
   	
   	JiangxuejinshenqingView selectView(@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangxuejinshenqingEntity> wrapper);
   	
}

