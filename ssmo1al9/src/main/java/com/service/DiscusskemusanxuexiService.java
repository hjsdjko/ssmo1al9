package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskemusanxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskemusanxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskemusanxuexiView;


/**
 * 科目三学习评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
public interface DiscusskemusanxuexiService extends IService<DiscusskemusanxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskemusanxuexiVO> selectListVO(Wrapper<DiscusskemusanxuexiEntity> wrapper);
   	
   	DiscusskemusanxuexiVO selectVO(@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);
   	
   	List<DiscusskemusanxuexiView> selectListView(Wrapper<DiscusskemusanxuexiEntity> wrapper);
   	
   	DiscusskemusanxuexiView selectView(@Param("ew") Wrapper<DiscusskemusanxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskemusanxuexiEntity> wrapper);
   	
}

