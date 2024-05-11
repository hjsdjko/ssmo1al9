package com.entity.view;

import com.entity.KemusanxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科目三学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 12:56:14
 */
@TableName("kemusanxuexi")
public class KemusanxuexiView  extends KemusanxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KemusanxuexiView(){
	}
 
 	public KemusanxuexiView(KemusanxuexiEntity kemusanxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, kemusanxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
