package com.entity.vo;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public class XueshengchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
