package com.entity.model;

import com.entity.DiannaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电脑信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public class DiannaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电脑名称
	 */
	
	private String diannaomingcheng;
		
	/**
	 * 电脑图片
	 */
	
	private String diannaotupian;
		
	/**
	 * 配置信息
	 */
	
	private String peizhixinxi;
		
	/**
	 * 小时单价
	 */
	
	private Integer xiaoshidanjia;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
				
	
	/**
	 * 设置：电脑名称
	 */
	 
	public void setDiannaomingcheng(String diannaomingcheng) {
		this.diannaomingcheng = diannaomingcheng;
	}
	
	/**
	 * 获取：电脑名称
	 */
	public String getDiannaomingcheng() {
		return diannaomingcheng;
	}
				
	
	/**
	 * 设置：电脑图片
	 */
	 
	public void setDiannaotupian(String diannaotupian) {
		this.diannaotupian = diannaotupian;
	}
	
	/**
	 * 获取：电脑图片
	 */
	public String getDiannaotupian() {
		return diannaotupian;
	}
				
	
	/**
	 * 设置：配置信息
	 */
	 
	public void setPeizhixinxi(String peizhixinxi) {
		this.peizhixinxi = peizhixinxi;
	}
	
	/**
	 * 获取：配置信息
	 */
	public String getPeizhixinxi() {
		return peizhixinxi;
	}
				
	
	/**
	 * 设置：小时单价
	 */
	 
	public void setXiaoshidanjia(Integer xiaoshidanjia) {
		this.xiaoshidanjia = xiaoshidanjia;
	}
	
	/**
	 * 获取：小时单价
	 */
	public Integer getXiaoshidanjia() {
		return xiaoshidanjia;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
			
}
