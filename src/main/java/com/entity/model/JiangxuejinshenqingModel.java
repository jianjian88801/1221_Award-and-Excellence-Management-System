package com.entity.model;

import com.entity.JiangxuejinshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 奖学金申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public class JiangxuejinshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 奖学金类型
	 */
	
	private String jiangxuejinleixing;
		
	/**
	 * 申请要求
	 */
	
	private String shenqingyaoqiu;
		
	/**
	 * 奖学金金额
	 */
	
	private Integer jiangxuejinjine;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：奖学金类型
	 */
	 
	public void setJiangxuejinleixing(String jiangxuejinleixing) {
		this.jiangxuejinleixing = jiangxuejinleixing;
	}
	
	/**
	 * 获取：奖学金类型
	 */
	public String getJiangxuejinleixing() {
		return jiangxuejinleixing;
	}
				
	
	/**
	 * 设置：申请要求
	 */
	 
	public void setShenqingyaoqiu(String shenqingyaoqiu) {
		this.shenqingyaoqiu = shenqingyaoqiu;
	}
	
	/**
	 * 获取：申请要求
	 */
	public String getShenqingyaoqiu() {
		return shenqingyaoqiu;
	}
				
	
	/**
	 * 设置：奖学金金额
	 */
	 
	public void setJiangxuejinjine(Integer jiangxuejinjine) {
		this.jiangxuejinjine = jiangxuejinjine;
	}
	
	/**
	 * 获取：奖学金金额
	 */
	public Integer getJiangxuejinjine() {
		return jiangxuejinjine;
	}
			
}
