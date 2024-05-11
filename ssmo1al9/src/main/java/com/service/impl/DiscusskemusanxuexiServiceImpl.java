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


import com.dao.DiscusskemusanxuexiDao;
import com.entity.DiscusskemusanxuexiEntity;
import com.service.DiscusskemusanxuexiService;
import com.entity.vo.DiscusskemusanxuexiVO;
import com.entity.view.DiscusskemusanxuexiView;

@Service("discusskemusanxuexiService")
public class DiscusskemusanxuexiServiceImpl extends ServiceImpl<DiscusskemusanxuexiDao, DiscusskemusanxuexiEntity> implements DiscusskemusanxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskemusanxuexiEntity> page = this.selectPage(
                new Query<DiscusskemusanxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscusskemusanxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskemusanxuexiEntity> wrapper) {
		  Page<DiscusskemusanxuexiView> page =new Query<DiscusskemusanxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskemusanxuexiVO> selectListVO(Wrapper<DiscusskemusanxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskemusanxuexiVO selectVO(Wrapper<DiscusskemusanxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskemusanxuexiView> selectListView(Wrapper<DiscusskemusanxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskemusanxuexiView selectView(Wrapper<DiscusskemusanxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
