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


import com.dao.HujiaowangguanDao;
import com.entity.HujiaowangguanEntity;
import com.service.HujiaowangguanService;
import com.entity.vo.HujiaowangguanVO;
import com.entity.view.HujiaowangguanView;

@Service("hujiaowangguanService")
public class HujiaowangguanServiceImpl extends ServiceImpl<HujiaowangguanDao, HujiaowangguanEntity> implements HujiaowangguanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HujiaowangguanEntity> page = this.selectPage(
                new Query<HujiaowangguanEntity>(params).getPage(),
                new EntityWrapper<HujiaowangguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HujiaowangguanEntity> wrapper) {
		  Page<HujiaowangguanView> page =new Query<HujiaowangguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HujiaowangguanVO> selectListVO(Wrapper<HujiaowangguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HujiaowangguanVO selectVO(Wrapper<HujiaowangguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HujiaowangguanView> selectListView(Wrapper<HujiaowangguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HujiaowangguanView selectView(Wrapper<HujiaowangguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
