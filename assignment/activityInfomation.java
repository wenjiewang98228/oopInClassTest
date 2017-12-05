package assignment;

import java.util.ArrayList;

public class activityInfomation {

	private String name;//�����
	private String time;//�ٰ�ʱ��
	private String location;//�ٰ�ص�
	private ArrayList<String> teams;//�������ţ����ܶ����
	private String infomation;//��飨������100�֣�
	
	/*���췽��*/
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
