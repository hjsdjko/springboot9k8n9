package com.entity.view;

import com.entity.YonghushangjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户上机
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("yonghushangji")
public class YonghushangjiView  extends YonghushangjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghushangjiView(){
	}
 
 	public YonghushangjiView(YonghushangjiEntity yonghushangjiEntity){
 	try {
			BeanUtils.copyProperties(this, yonghushangjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
