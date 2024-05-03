package com.dao;

import com.entity.WangguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangguanVO;
import com.entity.view.WangguanView;


/**
 * 网管
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface WangguanDao extends BaseMapper<WangguanEntity> {
	
	List<WangguanVO> selectListVO(@Param("ew") Wrapper<WangguanEntity> wrapper);
	
	WangguanVO selectVO(@Param("ew") Wrapper<WangguanEntity> wrapper);
	
	List<WangguanView> selectListView(@Param("ew") Wrapper<WangguanEntity> wrapper);

	List<WangguanView> selectListView(Pagination page,@Param("ew") Wrapper<WangguanEntity> wrapper);
	
	WangguanView selectView(@Param("ew") Wrapper<WangguanEntity> wrapper);
	

}
