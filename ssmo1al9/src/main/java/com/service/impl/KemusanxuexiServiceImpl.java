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


import com.dao.KemusanxuexiDao;
import com.entity.KemusanxuexiEntity;
import com.service.KemusanxuexiService;
import com.entity.vo.KemusanxuexiVO;
import com.entity.view.KemusanxuexiView;

@Service("kemusanxuexiService")
public class KemusanxuexiServiceImpl extends ServiceImpl<KemusanxuexiDao, KemusanxuexiEntity> implements KemusanxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KemusanxuexiEntity> page = this.selectPage(
                new Query<KemusanxuexiEntity>(params).getPage(),
                new EntityWrapper<KemusanxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KemusanxuexiEntity> wrapper) {
		  Page<KemusanxuexiView> page =new Query<KemusanxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KemusanxuexiVO> selectListVO(Wrapper<KemusanxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KemusanxuexiVO selectVO(Wrapper<KemusanxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KemusanxuexiView> selectListView(Wrapper<KemusanxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KemusanxuexiView selectView(Wrapper<KemusanxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
