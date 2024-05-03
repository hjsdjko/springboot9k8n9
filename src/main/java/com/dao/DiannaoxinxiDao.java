package com.dao;

import com.entity.DiannaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiannaoxinxiVO;
import com.entity.view.DiannaoxinxiView;


/**
 * 电脑信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface DiannaoxinxiDao extends BaseMapper<DiannaoxinxiEntity> {
	
	List<DiannaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);
	
	DiannaoxinxiVO selectVO(@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);
	
	List<DiannaoxinxiView> selectListView(@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);

	List<DiannaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);
	
	DiannaoxinxiView selectView(@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);
	

}
