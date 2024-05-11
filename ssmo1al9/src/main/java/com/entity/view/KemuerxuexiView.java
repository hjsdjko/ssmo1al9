package com.entity.view;

import com.entity.KemuerxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科目二学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
@TableName("kemuerxuexi")
public class KemuerxuexiView  extends KemuerxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KemuerxuexiView(){
	}
 
 	public KemuerxuexiView(KemuerxuexiEntity kemuerxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, kemuerxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
