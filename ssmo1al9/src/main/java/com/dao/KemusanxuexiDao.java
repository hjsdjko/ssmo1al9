package com.dao;

import com.entity.KemusanxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KemusanxuexiVO;
import com.entity.view.KemusanxuexiView;


/**
 * 科目三学习
 * 
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface KemusanxuexiDao extends BaseMapper<KemusanxuexiEntity> {
	
	List<KemusanxuexiVO> selectListVO(@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);
	
	KemusanxuexiVO selectVO(@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);
	
	List<KemusanxuexiView> selectListView(@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);

	List<KemusanxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);
	
	KemusanxuexiView selectView(@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);
	
}
