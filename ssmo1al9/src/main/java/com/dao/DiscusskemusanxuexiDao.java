package com.dao;

import com.entity.DiscusskemusanxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskemusanxuexiVO;
import com.entity.view.DiscusskemusanxuexiView;


/**
 * 科目三学习评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface DiscusskemusanxuexiDao extends BaseMapper<DiscusskemusanxuexiEntity> {
	
	List<DiscusskemusanxuexiVO> selectListVO(@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);
	
	DiscusskemusanxuexiVO selectVO(@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);
	
	List<DiscusskemusanxuexiView> selectListView(@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);

	List<DiscusskemusanxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);
	
	DiscusskemusanxuexiView selectView(@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);
	
}
