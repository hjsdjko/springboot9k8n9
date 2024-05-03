package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiannaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiannaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiannaoxinxiView;


/**
 * 电脑信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface DiannaoxinxiService extends IService<DiannaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiannaoxinxiVO> selectListVO(Wrapper<DiannaoxinxiEntity> wrapper);
   	
   	DiannaoxinxiVO selectVO(@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);
   	
   	List<DiannaoxinxiView> selectListView(Wrapper<DiannaoxinxiEntity> wrapper);
   	
   	DiannaoxinxiView selectView(@Param("ew") Wrapper<DiannaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiannaoxinxiEntity> wrapper);
   	

}

