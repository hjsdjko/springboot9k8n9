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
 * 电脑信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("diannaoxinxi")
public class DiannaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiannaoxinxiEntity() {
		
	}
	
	public DiannaoxinxiEntity(T t) {
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
	 * 电脑编号
	 */
					
	private String diannaobianhao;
	
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
	 * 设置：电脑编号
	 */
	public void setDiannaobianhao(String diannaobianhao) {
		this.diannaobianhao = diannaobianhao;
	}
	/**
	 * 获取：电脑编号
	 */
	public String getDiannaobianhao() {
		return diannaobianhao;
	}
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
