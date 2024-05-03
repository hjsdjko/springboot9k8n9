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


import com.dao.YonghuxiajiDao;
import com.entity.YonghuxiajiEntity;
import com.service.YonghuxiajiService;
import com.entity.vo.YonghuxiajiVO;
import com.entity.view.YonghuxiajiView;

@Service("yonghuxiajiService")
public class YonghuxiajiServiceImpl extends ServiceImpl<YonghuxiajiDao, YonghuxiajiEntity> implements YonghuxiajiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuxiajiEntity> page = this.selectPage(
                new Query<YonghuxiajiEntity>(params).getPage(),
                new EntityWrapper<YonghuxiajiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuxiajiEntity> wrapper) {
		  Page<YonghuxiajiView> page =new Query<YonghuxiajiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuxiajiVO> selectListVO(Wrapper<YonghuxiajiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuxiajiVO selectVO(Wrapper<YonghuxiajiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuxiajiView> selectListView(Wrapper<YonghuxiajiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuxiajiView selectView(Wrapper<YonghuxiajiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
