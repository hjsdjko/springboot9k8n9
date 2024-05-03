package com.entity.view;

import com.entity.YonghuxiajiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户下机
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("yonghuxiaji")
public class YonghuxiajiView  extends YonghuxiajiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuxiajiView(){
	}
 
 	public YonghuxiajiView(YonghuxiajiEntity yonghuxiajiEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuxiajiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
