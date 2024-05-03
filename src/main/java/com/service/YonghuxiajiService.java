package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuxiajiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuxiajiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuxiajiView;


/**
 * 用户下机
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface YonghuxiajiService extends IService<YonghuxiajiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuxiajiVO> selectListVO(Wrapper<YonghuxiajiEntity> wrapper);
   	
   	YonghuxiajiVO selectVO(@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);
   	
   	List<YonghuxiajiView> selectListView(Wrapper<YonghuxiajiEntity> wrapper);
   	
   	YonghuxiajiView selectView(@Param("ew") Wrapper<YonghuxiajiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuxiajiEntity> wrapper);
   	

}

