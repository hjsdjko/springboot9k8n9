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


import com.dao.WangguanDao;
import com.entity.WangguanEntity;
import com.service.WangguanService;
import com.entity.vo.WangguanVO;
import com.entity.view.WangguanView;

@Service("wangguanService")
public class WangguanServiceImpl extends ServiceImpl<WangguanDao, WangguanEntity> implements WangguanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangguanEntity> page = this.selectPage(
                new Query<WangguanEntity>(params).getPage(),
                new EntityWrapper<WangguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangguanEntity> wrapper) {
		  Page<WangguanView> page =new Query<WangguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangguanVO> selectListVO(Wrapper<WangguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangguanVO selectVO(Wrapper<WangguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangguanView> selectListView(Wrapper<WangguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangguanView selectView(Wrapper<WangguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
