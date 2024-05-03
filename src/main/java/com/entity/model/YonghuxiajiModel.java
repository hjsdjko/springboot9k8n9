package com.entity.model;

import com.entity.YonghuxiajiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户下机
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public class YonghuxiajiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电脑名称
	 */
	
	private String diannaomingcheng;
		
	/**
	 * 会员账号
	 */
	
	private String huiyuanzhanghao;
		
	/**
	 * 会员姓名
	 */
	
	private String huiyuanxingming;
		
	/**
	 * 上机时间
	 */
	
	private String shangjishijian;
		
	/**
	 * 下机时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiajishijian;
		
	/**
	 * 小时单价
	 */
	
	private Float xiaoshidanjia;
		
	/**
	 * 用时
	 */
	
	private Float yongshi;
		
	/**
	 * 上机费用
	 */
	
	private Float shangjifeiyong;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 网管账号
	 */
	
	private String wangguanzhanghao;
		
	/**
	 * 网管姓名
	 */
	
	private String wangguanxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：会员账号
	 */
	 
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
				
	
	/**
	 * 设置：会员姓名
	 */
	 
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
				
	
	/**
	 * 设置：上机时间
	 */
	 
	public void setShangjishijian(String shangjishijian) {
		this.shangjishijian = shangjishijian;
	}
	
	/**
	 * 获取：上机时间
	 */
	public String getShangjishijian() {
		return shangjishijian;
	}
				
	
	/**
	 * 设置：下机时间
	 */
	 
	public void setXiajishijian(Date xiajishijian) {
		this.xiajishijian = xiajishijian;
	}
	
	/**
	 * 获取：下机时间
	 */
	public Date getXiajishijian() {
		return xiajishijian;
	}
				
	
	/**
	 * 设置：小时单价
	 */
	 
	public void setXiaoshidanjia(Float xiaoshidanjia) {
		this.xiaoshidanjia = xiaoshidanjia;
	}
	
	/**
	 * 获取：小时单价
	 */
	public Float getXiaoshidanjia() {
		return xiaoshidanjia;
	}
				
	
	/**
	 * 设置：用时
	 */
	 
	public void setYongshi(Float yongshi) {
		this.yongshi = yongshi;
	}
	
	/**
	 * 获取：用时
	 */
	public Float getYongshi() {
		return yongshi;
	}
				
	
	/**
	 * 设置：上机费用
	 */
	 
	public void setShangjifeiyong(Float shangjifeiyong) {
		this.shangjifeiyong = shangjifeiyong;
	}
	
	/**
	 * 获取：上机费用
	 */
	public Float getShangjifeiyong() {
		return shangjifeiyong;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：网管账号
	 */
	 
	public void setWangguanzhanghao(String wangguanzhanghao) {
		this.wangguanzhanghao = wangguanzhanghao;
	}
	
	/**
	 * 获取：网管账号
	 */
	public String getWangguanzhanghao() {
		return wangguanzhanghao;
	}
				
	
	/**
	 * 设置：网管姓名
	 */
	 
	public void setWangguanxingming(String wangguanxingming) {
		this.wangguanxingming = wangguanxingming;
	}
	
	/**
	 * 获取：网管姓名
	 */
	public String getWangguanxingming() {
		return wangguanxingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
