package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiannaoxinxiDao;
import com.entity.DiannaoxinxiEntity;
import com.service.DiannaoxinxiService;
import com.entity.vo.DiannaoxinxiVO;
import com.entity.view.DiannaoxinxiView;

@Service("diannaoxinxiService")
public class DiannaoxinxiServiceImpl extends ServiceImpl<DiannaoxinxiDao, DiannaoxinxiEntity> implements DiannaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiannaoxinxiEntity> page = this.selectPage(
                new Query<DiannaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiannaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiannaoxinxiEntity> wrapper) {
		  Page<DiannaoxinxiView> page =new Query<DiannaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiannaoxinxiVO> selectListVO(Wrapper<DiannaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiannaoxinxiVO selectVO(Wrapper<DiannaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiannaoxinxiView> selectListView(Wrapper<DiannaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiannaoxinxiView selectView(Wrapper<DiannaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
