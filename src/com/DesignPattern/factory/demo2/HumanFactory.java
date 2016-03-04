package com.DesignPattern.factory.demo2;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午3:09:07 
* @desc: 
* 
*/
public class HumanFactory {
	public static Human createHuman(Class cls){
		Human human = null;
		try {
			human = (Human) Class.forName(cls.getName()).newInstance();
			return human;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return human;
	}
}
