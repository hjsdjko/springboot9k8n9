package com.entity.view;

import com.entity.DiannaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电脑信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("diannaoxinxi")
public class DiannaoxinxiView  extends DiannaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiannaoxinxiView(){
	}
 
 	public DiannaoxinxiView(DiannaoxinxiEntity diannaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, diannaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
