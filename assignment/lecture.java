package assignment;

import java.util.ArrayList;

public class lecture extends activityInfomation {
	

	private ArrayList<lecturor> lecturors;
	/*构造方法*/
    public lecture(String name, String time, String location, ArrayList<String> teams, String infomation,
    		       ArrayList<lecturor>lecturors) {
		super(name, time, location, teams, infomation);
		// TODO Auto-generated constructor stub
		setLecturors(lecturors);
	}
    
    /*setters*/
	public void setLecturors(ArrayList<lecturor> aLecturors) {
		// TODO Auto-generated method stub
		for(int i = 0; i < aLecturors.size(); i++){
			lecturors.add(aLecturors.get(i));
		}
	}
	
	/*getters*/
	public ArrayList<lecturor> getLecturors(){
		return lecturors;
	}
}
