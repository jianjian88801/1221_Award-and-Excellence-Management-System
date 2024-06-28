package com.entity.view;

import com.entity.XinxiyiyifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信息异议反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
@TableName("xinxiyiyifankui")
public class XinxiyiyifankuiView  extends XinxiyiyifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinxiyiyifankuiView(){
	}
 
 	public XinxiyiyifankuiView(XinxiyiyifankuiEntity xinxiyiyifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, xinxiyiyifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
