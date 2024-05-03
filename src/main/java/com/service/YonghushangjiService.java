package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghushangjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghushangjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghushangjiView;


/**
 * 用户上机
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface YonghushangjiService extends IService<YonghushangjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghushangjiVO> selectListVO(Wrapper<YonghushangjiEntity> wrapper);
   	
   	YonghushangjiVO selectVO(@Param("ew") Wrapper<YonghushangjiEntity> wrapper);
   	
   	List<YonghushangjiView> selectListView(Wrapper<YonghushangjiEntity> wrapper);
   	
   	YonghushangjiView selectView(@Param("ew") Wrapper<YonghushangjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghushangjiEntity> wrapper);
   	

}

