package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KemusanxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KemusanxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KemusanxuexiView;


/**
 * 科目三学习
 *
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface KemusanxuexiService extends IService<KemusanxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KemusanxuexiVO> selectListVO(Wrapper<KemusanxuexiEntity> wrapper);
   	
   	KemusanxuexiVO selectVO(@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);
   	
   	List<KemusanxuexiView> selectListView(Wrapper<KemusanxuexiEntity> wrapper);
   	
   	KemusanxuexiView selectView(@Param("ew") Wrapper<KemusanxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KemusanxuexiEntity> wrapper);
   	
}

