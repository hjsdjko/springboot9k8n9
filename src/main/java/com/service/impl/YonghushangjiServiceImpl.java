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


import com.dao.YonghushangjiDao;
import com.entity.YonghushangjiEntity;
import com.service.YonghushangjiService;
import com.entity.vo.YonghushangjiVO;
import com.entity.view.YonghushangjiView;

@Service("yonghushangjiService")
public class YonghushangjiServiceImpl extends ServiceImpl<YonghushangjiDao, YonghushangjiEntity> implements YonghushangjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghushangjiEntity> page = this.selectPage(
                new Query<YonghushangjiEntity>(params).getPage(),
                new EntityWrapper<YonghushangjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghushangjiEntity> wrapper) {
		  Page<YonghushangjiView> page =new Query<YonghushangjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghushangjiVO> selectListVO(Wrapper<YonghushangjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghushangjiVO selectVO(Wrapper<YonghushangjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghushangjiView> selectListView(Wrapper<YonghushangjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghushangjiView selectView(Wrapper<YonghushangjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
