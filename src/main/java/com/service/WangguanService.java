package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangguanView;


/**
 * 网管
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface WangguanService extends IService<WangguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangguanVO> selectListVO(Wrapper<WangguanEntity> wrapper);
   	
   	WangguanVO selectVO(@Param("ew") Wrapper<WangguanEntity> wrapper);
   	
   	List<WangguanView> selectListView(Wrapper<WangguanEntity> wrapper);
   	
   	WangguanView selectView(@Param("ew") Wrapper<WangguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangguanEntity> wrapper);
   	

}

