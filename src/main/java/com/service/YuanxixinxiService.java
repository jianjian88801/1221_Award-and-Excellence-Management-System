package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxixinxiView;


/**
 * 院系信息
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface YuanxixinxiService extends IService<YuanxixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxixinxiVO> selectListVO(Wrapper<YuanxixinxiEntity> wrapper);
   	
   	YuanxixinxiVO selectVO(@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);
   	
   	List<YuanxixinxiView> selectListView(Wrapper<YuanxixinxiEntity> wrapper);
   	
   	YuanxixinxiView selectView(@Param("ew") Wrapper<YuanxixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxixinxiEntity> wrapper);
   	
}

