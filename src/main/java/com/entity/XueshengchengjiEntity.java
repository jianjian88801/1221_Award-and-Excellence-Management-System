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
 * 学生成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
@TableName("xueshengchengji")
public class XueshengchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengchengjiEntity() {
		
	}
	
	public XueshengchengjiEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 院系
	 */
					
	private String yuanxi;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 体育成绩
	 */
					
	private Integer tiyuchengji;
	
	/**
	 * 德育成绩
	 */
					
	private Integer deyuchengji;
	
	/**
	 * 智育成绩
	 */
					
	private Integer zhiyuchengji;
	
	/**
	 * 综合素质分
	 */
					
	private Integer zonghesuzhifen;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：院系
	 */
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：体育成绩
	 */
	public void setTiyuchengji(Integer tiyuchengji) {
		this.tiyuchengji = tiyuchengji;
	}
	/**
	 * 获取：体育成绩
	 */
	public Integer getTiyuchengji() {
		return tiyuchengji;
	}
	/**
	 * 设置：德育成绩
	 */
	public void setDeyuchengji(Integer deyuchengji) {
		this.deyuchengji = deyuchengji;
	}
	/**
	 * 获取：德育成绩
	 */
	public Integer getDeyuchengji() {
		return deyuchengji;
	}
	/**
	 * 设置：智育成绩
	 */
	public void setZhiyuchengji(Integer zhiyuchengji) {
		this.zhiyuchengji = zhiyuchengji;
	}
	/**
	 * 获取：智育成绩
	 */
	public Integer getZhiyuchengji() {
		return zhiyuchengji;
	}
	/**
	 * 设置：综合素质分
	 */
	public void setZonghesuzhifen(Integer zonghesuzhifen) {
		this.zonghesuzhifen = zonghesuzhifen;
	}
	/**
	 * 获取：综合素质分
	 */
	public Integer getZonghesuzhifen() {
		return zonghesuzhifen;
	}

}
