package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxiyiyifankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxiyiyifankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxiyiyifankuiView;


/**
 * 信息异议反馈
 *
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public interface XinxiyiyifankuiService extends IService<XinxiyiyifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxiyiyifankuiVO> selectListVO(Wrapper<XinxiyiyifankuiEntity> wrapper);
   	
   	XinxiyiyifankuiVO selectVO(@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);
   	
   	List<XinxiyiyifankuiView> selectListView(Wrapper<XinxiyiyifankuiEntity> wrapper);
   	
   	XinxiyiyifankuiView selectView(@Param("ew") Wrapper<XinxiyiyifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxiyiyifankuiEntity> wrapper);
   	
}

