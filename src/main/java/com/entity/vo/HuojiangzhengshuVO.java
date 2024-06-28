package com.entity.vo;

import com.entity.HuojiangzhengshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 获奖证书
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 10:40:57
 */
public class HuojiangzhengshuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 证书封面
	 */
	
	private String zhengshufengmian;
		
	/**
	 * 获奖日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huojiangriqi;
		
	/**
	 * 获奖内容
	 */
	
	private String huojiangneirong;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：证书封面
	 */
	 
	public void setZhengshufengmian(String zhengshufengmian) {
		this.zhengshufengmian = zhengshufengmian;
	}
	
	/**
	 * 获取：证书封面
	 */
	public String getZhengshufengmian() {
		return zhengshufengmian;
	}
				
	
	/**
	 * 设置：获奖日期
	 */
	 
	public void setHuojiangriqi(Date huojiangriqi) {
		this.huojiangriqi = huojiangriqi;
	}
	
	/**
	 * 获取：获奖日期
	 */
	public Date getHuojiangriqi() {
		return huojiangriqi;
	}
				
	
	/**
	 * 设置：获奖内容
	 */
	 
	public void setHuojiangneirong(String huojiangneirong) {
		this.huojiangneirong = huojiangneirong;
	}
	
	/**
	 * 获取：获奖内容
	 */
	public String getHuojiangneirong() {
		return huojiangneirong;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
