package com.entity.view;

import com.entity.WangguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 网管
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("wangguan")
public class WangguanView  extends WangguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WangguanView(){
	}
 
 	public WangguanView(WangguanEntity wangguanEntity){
 	try {
			BeanUtils.copyProperties(this, wangguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
