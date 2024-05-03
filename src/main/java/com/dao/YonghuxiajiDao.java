package com.dao;

import com.entity.YonghuxiajiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuxiajiVO;
import com.entity.view.YonghuxiajiView;


/**
 * 用户下机
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface YonghuxiajiDao extends BaseMapper<YonghuxiajiEntity> {
	
	List<YonghuxiajiVO> selectListVO(@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);
	
	YonghuxiajiVO selectVO(@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);
	
	List<YonghuxiajiView> selectListView(@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);

	List<YonghuxiajiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);
	
	YonghuxiajiView selectView(@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);
	

}
