package com.entity.view;

import com.entity.JiangxuejinhuodeqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 奖学金获得情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
@TableName("jiangxuejinhuodeqingkuang")
public class JiangxuejinhuodeqingkuangView  extends JiangxuejinhuodeqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangxuejinhuodeqingkuangView(){
	}
 
 	public JiangxuejinhuodeqingkuangView(JiangxuejinhuodeqingkuangEntity jiangxuejinhuodeqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, jiangxuejinhuodeqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
