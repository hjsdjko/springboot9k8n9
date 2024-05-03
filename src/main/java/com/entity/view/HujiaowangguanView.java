package com.entity.view;

import com.entity.HujiaowangguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 呼叫网管
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
@TableName("hujiaowangguan")
public class HujiaowangguanView  extends HujiaowangguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HujiaowangguanView(){
	}
 
 	public HujiaowangguanView(HujiaowangguanEntity hujiaowangguanEntity){
 	try {
			BeanUtils.copyProperties(this, hujiaowangguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
