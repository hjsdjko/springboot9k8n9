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
 * 用户上机
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("yonghushangji")
public class YonghushangjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghushangjiEntity() {
		
	}
	
	public YonghushangjiEntity(T t) {
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
