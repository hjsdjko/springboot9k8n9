package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HujiaowangguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HujiaowangguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HujiaowangguanView;


/**
 * 呼叫网管
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:54:50
 */
public interface HujiaowangguanService extends IService<HujiaowangguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HujiaowangguanVO> selectListVO(Wrapper<HujiaowangguanEntity> wrapper);
   	
   	HujiaowangguanVO selectVO(@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);
   	
   	List<HujiaowangguanView> selectListView(Wrapper<HujiaowangguanEntity> wrapper);
   	
   	HujiaowangguanView selectView(@Param("ew") Wrapper<HujiaowangguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HujiaowangguanEntity> wrapper);
   	

}

