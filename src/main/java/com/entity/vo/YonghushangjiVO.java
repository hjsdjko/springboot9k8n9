package com.entity.vo;

import com.entity.YonghushangjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户上机
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public class YonghushangjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电脑名称
	 */
	
	private String diannaomingcheng;
		
	/**
	 * 小时单价
	 */
	
	private String xiaoshidanjia;
		
	/**
	 * 会员账号
	 */
	
	private String huiyuanzhanghao;
		
	/**
	 * 会员姓名
	 */
	
	private String huiyuanxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 上机时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjishijian;
		
	/**
	 * 上机状态
	 */
	
	private String shangjizhuangtai;
				
	
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
	 * 设置：小时单价
	 */
	 
	public void setXiaoshidanjia(String xiaoshidanjia) {
		this.xiaoshidanjia = xiaoshidanjia;
	}
	
	/**
	 * 获取：小时单价
	 */
	public String getXiaoshidanjia() {
		return xiaoshidanjia;
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：上机时间
	 */
	 
	public void setShangjishijian(Date shangjishijian) {
		this.shangjishijian = shangjishijian;
	}
	
	/**
	 * 获取：上机时间
	 */
	public Date getShangjishijian() {
		return shangjishijian;
	}
				
	
	/**
	 * 设置：上机状态
	 */
	 
	public void setShangjizhuangtai(String shangjizhuangtai) {
		this.shangjizhuangtai = shangjizhuangtai;
	}
	
	/**
	 * 获取：上机状态
	 */
	public String getShangjizhuangtai() {
		return shangjizhuangtai;
	}
			
}
