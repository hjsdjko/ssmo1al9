package com.entity.view;

import com.entity.DiscusskemuerxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科目二学习评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
@TableName("discusskemuerxuexi")
public class DiscusskemuerxuexiView  extends DiscusskemuerxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskemuerxuexiView(){
	}
 
 	public DiscusskemuerxuexiView(DiscusskemuerxuexiEntity discusskemuerxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskemuerxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
