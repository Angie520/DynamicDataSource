/**
 * 
 */
package com.angie.entity;

/**
 * 
 * @author Angie
 * github:https://github.com/Angie520
 * @date 2017年4月5日 上午11:44:58
 */
public class Student {
	private int id;
	private String name;
	private int age;
	private String sumScore;
	private String avgScore;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSumScore() {
		return sumScore;
	}
	public void setSumScore(String sumScore) {
		this.sumScore = sumScore;
	}
	public String getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
