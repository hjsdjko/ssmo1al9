package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KemuerxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KemuerxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KemuerxuexiView;


/**
 * 科目二学习
 *
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface KemuerxuexiService extends IService<KemuerxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KemuerxuexiVO> selectListVO(Wrapper<KemuerxuexiEntity> wrapper);
   	
   	KemuerxuexiVO selectVO(@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);
   	
   	List<KemuerxuexiView> selectListView(Wrapper<KemuerxuexiEntity> wrapper);
   	
   	KemuerxuexiView selectView(@Param("ew") Wrapper<KemuerxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KemuerxuexiEntity> wrapper);
   	
}

