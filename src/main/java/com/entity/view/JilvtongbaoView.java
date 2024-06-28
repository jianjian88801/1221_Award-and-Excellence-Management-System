package com.entity.view;

import com.entity.JilvtongbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 纪律通报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:58
 */
@TableName("jilvtongbao")
public class JilvtongbaoView  extends JilvtongbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JilvtongbaoView(){
	}
 
 	public JilvtongbaoView(JilvtongbaoEntity jilvtongbaoEntity){
 	try {
			BeanUtils.copyProperties(this, jilvtongbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
