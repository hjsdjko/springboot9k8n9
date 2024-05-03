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
 * 网管
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("wangguan")
public class WangguanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WangguanEntity() {
		
	}
	
	public WangguanEntity(T t) {
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
	 * 网管账号
	 */
					
	private String wangguanzhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 网管姓名
	 */
					
	private String wangguanxingming;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 出生年月
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengnianyue;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：出生年月
	 */
	public void setChushengnianyue(Date chushengnianyue) {
		this.chushengnianyue = chushengnianyue;
	}
	/**
	 * 获取：出生年月
	 */
	public Date getChushengnianyue() {
		return chushengnianyue;
	}

}
