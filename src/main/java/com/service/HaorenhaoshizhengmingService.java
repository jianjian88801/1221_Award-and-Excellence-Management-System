package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaorenhaoshizhengmingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaorenhaoshizhengmingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaorenhaoshizhengmingView;


/**
 * 好人好事证明
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface HaorenhaoshizhengmingService extends IService<HaorenhaoshizhengmingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaorenhaoshizhengmingVO> selectListVO(Wrapper<HaorenhaoshizhengmingEntity> wrapper);
   	
   	HaorenhaoshizhengmingVO selectVO(@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);
   	
   	List<HaorenhaoshizhengmingView> selectListView(Wrapper<HaorenhaoshizhengmingEntity> wrapper);
   	
   	HaorenhaoshizhengmingView selectView(@Param("ew") Wrapper<HaorenhaoshizhengmingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaorenhaoshizhengmingEntity> wrapper);
   	
}

