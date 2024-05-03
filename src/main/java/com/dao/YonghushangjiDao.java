package com.dao;

import com.entity.YonghushangjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghushangjiVO;
import com.entity.view.YonghushangjiView;


/**
 * 用户上机
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface YonghushangjiDao extends BaseMapper<YonghushangjiEntity> {
	
	List<YonghushangjiVO> selectListVO(@Param("ew") Wrapper<YonghushangjiEntity> wrapper);
	
	YonghushangjiVO selectVO(@Param("ew") Wrapper<YonghushangjiEntity> wrapper);
	
	List<YonghushangjiView> selectListView(@Param("ew") Wrapper<YonghushangjiEntity> wrapper);

	List<YonghushangjiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghushangjiEntity> wrapper);
	
	YonghushangjiView selectView(@Param("ew") Wrapper<YonghushangjiEntity> wrapper);
	

}
