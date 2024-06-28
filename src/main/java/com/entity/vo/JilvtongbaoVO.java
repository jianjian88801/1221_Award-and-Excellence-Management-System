package com.entity.vo;

import com.entity.JilvtongbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 纪律通报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:58
 */
public class JilvtongbaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 违纪项
	 */
	
	private String weijixiang;
		
	/**
	 * 通报日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongbaoriqi;
		
	/**
	 * 综合素质扣分
	 */
	
	private Integer zonghesuzhikoufen;
		
	/**
	 * 违纪内容
	 */
	
	private String weijineirong;
		
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
	 * 设置：违纪项
	 */
	 
	public void setWeijixiang(String weijixiang) {
		this.weijixiang = weijixiang;
	}
	
	/**
	 * 获取：违纪项
	 */
	public String getWeijixiang() {
		return weijixiang;
	}
				
	
	/**
	 * 设置：通报日期
	 */
	 
	public void setTongbaoriqi(Date tongbaoriqi) {
		this.tongbaoriqi = tongbaoriqi;
	}
	
	/**
	 * 获取：通报日期
	 */
	public Date getTongbaoriqi() {
		return tongbaoriqi;
	}
				
	
	/**
	 * 设置：综合素质扣分
	 */
	 
	public void setZonghesuzhikoufen(Integer zonghesuzhikoufen) {
		this.zonghesuzhikoufen = zonghesuzhikoufen;
	}
	
	/**
	 * 获取：综合素质扣分
	 */
	public Integer getZonghesuzhikoufen() {
		return zonghesuzhikoufen;
	}
				
	
	/**
	 * 设置：违纪内容
	 */
	 
	public void setWeijineirong(String weijineirong) {
		this.weijineirong = weijineirong;
	}
	
	/**
	 * 获取：违纪内容
	 */
	public String getWeijineirong() {
		return weijineirong;
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
			
}
