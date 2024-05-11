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


import com.dao.KemuerxuexiDao;
import com.entity.KemuerxuexiEntity;
import com.service.KemuerxuexiService;
import com.entity.vo.KemuerxuexiVO;
import com.entity.view.KemuerxuexiView;

@Service("kemuerxuexiService")
public class KemuerxuexiServiceImpl extends ServiceImpl<KemuerxuexiDao, KemuerxuexiEntity> implements KemuerxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KemuerxuexiEntity> page = this.selectPage(
                new Query<KemuerxuexiEntity>(params).getPage(),
                new EntityWrapper<KemuerxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KemuerxuexiEntity> wrapper) {
		  Page<KemuerxuexiView> page =new Query<KemuerxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KemuerxuexiVO> selectListVO(Wrapper<KemuerxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KemuerxuexiVO selectVO(Wrapper<KemuerxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KemuerxuexiView> selectListView(Wrapper<KemuerxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KemuerxuexiView selectView(Wrapper<KemuerxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
