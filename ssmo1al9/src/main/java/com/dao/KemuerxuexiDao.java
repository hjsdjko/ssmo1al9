package com.dao;

import com.entity.KemuerxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KemuerxuexiVO;
import com.entity.view.KemuerxuexiView;


/**
 * 科目二学习
 * 
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface KemuerxuexiDao extends BaseMapper<KemuerxuexiEntity> {
	
	List<KemuerxuexiVO> selectListVO(@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);
	
	KemuerxuexiVO selectVO(@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);
	
	List<KemuerxuexiView> selectListView(@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);

	List<KemuerxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);
	
	KemuerxuexiView selectView(@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);
	
}
