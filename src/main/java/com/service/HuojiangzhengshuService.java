package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuojiangzhengshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuojiangzhengshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuojiangzhengshuView;


/**
 * 获奖证书
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface HuojiangzhengshuService extends IService<HuojiangzhengshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuojiangzhengshuVO> selectListVO(Wrapper<HuojiangzhengshuEntity> wrapper);
   	
   	HuojiangzhengshuVO selectVO(@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);
   	
   	List<HuojiangzhengshuView> selectListView(Wrapper<HuojiangzhengshuEntity> wrapper);
   	
   	HuojiangzhengshuView selectView(@Param("ew") Wrapper<HuojiangzhengshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuojiangzhengshuEntity> wrapper);
   	
}

