package assignment;

import java.util.ArrayList;

public class activityInfomation {

	private String name;//活动名称
	private String time;//举办时间
	private String location;//举办地点
	private ArrayList<String> teams;//主办社团（可能多个）
	private String infomation;//简介（不超过100字）
	
	/*构造方法*/
	public activityInfomation(String name,String time,String location,
			                        ArrayList<String> teams,String infomation){
		setName(name);
		setTime(time);
		setLocation(location);
		setTeams(teams);
		setInfomation(infomation);
	}
	
	/*setters*/
	public void setName(String aName){
		this.name = aName;
	}
	
	public void setTime(String aTime){
		this.time = aTime;
	}
	
	public void setLocation(String aLocation){
		this.location = aLocation;
	}
	
	public void setTeams(ArrayList<String> aTeams){
		/*for(int i = 0; i < aTeams.size(); i++){
			teams.add(aTeams.get(i));
		}*/
		for(String str:aTeams){
			teams.add(str);
		}
	}
	
	public void setInfomation(String aInfomation){
		this.infomation = aInfomation;
	}
	
	/*getters*/
	public String getName(){
		return name;
	}
	
	public String getTime(){
		return time;
	}
	
	public String getLocation(){
		return location;
	}
	
	public ArrayList<String> getTeams(){
		return teams;
	}
	
	public String getInfomation(){
		return infomation;
	}
	
}
