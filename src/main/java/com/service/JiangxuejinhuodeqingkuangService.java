package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangxuejinhuodeqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangxuejinhuodeqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangxuejinhuodeqingkuangView;


/**
 * 奖学金获得情况
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface JiangxuejinhuodeqingkuangService extends IService<JiangxuejinhuodeqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangxuejinhuodeqingkuangVO> selectListVO(Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
   	
   	JiangxuejinhuodeqingkuangVO selectVO(@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
   	
   	List<JiangxuejinhuodeqingkuangView> selectListView(Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
   	
   	JiangxuejinhuodeqingkuangView selectView(@Param("ew") Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper);
   	
}

