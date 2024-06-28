package com.entity.view;

import com.entity.HaorenhaoshizhengmingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 好人好事证明
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
@TableName("haorenhaoshizhengming")
public class HaorenhaoshizhengmingView  extends HaorenhaoshizhengmingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaorenhaoshizhengmingView(){
	}
 
 	public HaorenhaoshizhengmingView(HaorenhaoshizhengmingEntity haorenhaoshizhengmingEntity){
 	try {
			BeanUtils.copyProperties(this, haorenhaoshizhengmingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
