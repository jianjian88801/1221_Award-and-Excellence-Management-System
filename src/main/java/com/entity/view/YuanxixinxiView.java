package com.entity.view;

import com.entity.YuanxixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院系信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
@TableName("yuanxixinxi")
public class YuanxixinxiView  extends YuanxixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxixinxiView(){
	}
 
 	public YuanxixinxiView(YuanxixinxiEntity yuanxixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
