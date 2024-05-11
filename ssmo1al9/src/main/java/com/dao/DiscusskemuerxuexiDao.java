package com.dao;

import com.entity.DiscusskemuerxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskemuerxuexiVO;
import com.entity.view.DiscusskemuerxuexiView;


/**
 * 科目二学习评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface DiscusskemuerxuexiDao extends BaseMapper<DiscusskemuerxuexiEntity> {
	
	List<DiscusskemuerxuexiVO> selectListVO(@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);
	
	DiscusskemuerxuexiVO selectVO(@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);
	
	List<DiscusskemuerxuexiView> selectListView(@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);

	List<DiscusskemuerxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);
	
	DiscusskemuerxuexiView selectView(@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);
	
}
