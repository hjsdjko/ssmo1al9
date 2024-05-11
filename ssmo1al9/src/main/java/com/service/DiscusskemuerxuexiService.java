package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskemuerxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskemuerxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskemuerxuexiView;


/**
 * 科目二学习评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface DiscusskemuerxuexiService extends IService<DiscusskemuerxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskemuerxuexiVO> selectListVO(Wrapper<DiscusskemuerxuexiEntity> wrapper);
   	
   	DiscusskemuerxuexiVO selectVO(@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);
   	
   	List<DiscusskemuerxuexiView> selectListView(Wrapper<DiscusskemuerxuexiEntity> wrapper);
   	
   	DiscusskemuerxuexiView selectView(@Param("ew") Wrapper<DiscusskemuerxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskemuerxuexiEntity> wrapper);
   	
}

