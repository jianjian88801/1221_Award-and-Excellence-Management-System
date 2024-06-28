package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JilvtongbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JilvtongbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JilvtongbaoView;


/**
 * 纪律通报
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:58
 */
public interface JilvtongbaoService extends IService<JilvtongbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JilvtongbaoVO> selectListVO(Wrapper<JilvtongbaoEntity> wrapper);
   	
   	JilvtongbaoVO selectVO(@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);
   	
   	List<JilvtongbaoView> selectListView(Wrapper<JilvtongbaoEntity> wrapper);
   	
   	JilvtongbaoView selectView(@Param("ew") Wrapper<JilvtongbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JilvtongbaoEntity> wrapper);
   	
}

