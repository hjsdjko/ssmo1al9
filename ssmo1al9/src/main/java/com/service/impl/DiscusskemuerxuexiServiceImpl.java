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


import com.dao.DiscusskemuerxuexiDao;
import com.entity.DiscusskemuerxuexiEntity;
import com.service.DiscusskemuerxuexiService;
import com.entity.vo.DiscusskemuerxuexiVO;
import com.entity.view.DiscusskemuerxuexiView;

@Service("discusskemuerxuexiService")
public class DiscusskemuerxuexiServiceImpl extends ServiceImpl<DiscusskemuerxuexiDao, DiscusskemuerxuexiEntity> implements DiscusskemuerxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskemuerxuexiEntity> page = this.selectPage(
                new Query<DiscusskemuerxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscusskemuerxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskemuerxuexiEntity> wrapper) {
		  Page<DiscusskemuerxuexiView> page =new Query<DiscusskemuerxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskemuerxuexiVO> selectListVO(Wrapper<DiscusskemuerxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskemuerxuexiVO selectVO(Wrapper<DiscusskemuerxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskemuerxuexiView> selectListView(Wrapper<DiscusskemuerxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskemuerxuexiView selectView(Wrapper<DiscusskemuerxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
