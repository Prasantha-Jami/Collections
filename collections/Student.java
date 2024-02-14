package com.practise.collections;

public class Student implements Comparable<Student> {
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Student(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return eid+" "+ename;
	}
	@Override
	public int compareTo(Student that) {
		
		return Integer.compare(this.eid,that.eid);//ascending order
	}
	

}
