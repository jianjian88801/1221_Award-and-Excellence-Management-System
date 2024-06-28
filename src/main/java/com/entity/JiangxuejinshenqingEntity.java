package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 奖学金申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
@TableName("jiangxuejinshenqing")
public class JiangxuejinshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangxuejinshenqingEntity() {
		
	}
	
	public JiangxuejinshenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 奖学金名称
	 */
					
	private String jiangxuejinmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：奖学金名称
	 */
	public void setJiangxuejinmingcheng(String jiangxuejinmingcheng) {
		this.jiangxuejinmingcheng = jiangxuejinmingcheng;
	}
	/**
	 * 获取：奖学金名称
	 */
	public String getJiangxuejinmingcheng() {
		return jiangxuejinmingcheng;
	}
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
