package com.dao;

import com.entity.HujiaowangguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HujiaowangguanVO;
import com.entity.view.HujiaowangguanView;


/**
 * 呼叫网管
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface HujiaowangguanDao extends BaseMapper<HujiaowangguanEntity> {
	
	List<HujiaowangguanVO> selectListVO(@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);
	
	HujiaowangguanVO selectVO(@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);
	
	List<HujiaowangguanView> selectListView(@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);

	List<HujiaowangguanView> selectListView(Pagination page,@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);
	
	HujiaowangguanView selectView(@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);
	

}
