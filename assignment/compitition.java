package assignment;

import java.util.ArrayList;

public class compitition extends activityInfomation {
	private ArrayList<String> names;//获奖人名单
	
	public compitition(String name, String time, String location, ArrayList<String> teams, 
			           String infomation,ArrayList<String> names) {
		super(name, time, location, teams, infomation);
		// TODO Auto-generated constructor stub
		setNames(names);
	}
	
	/*setters*/
	public void setNames(ArrayList<String> aNames){
		for(int i = 0; i < aNames.size(); i++){
			names.add(aNames.get(i));
		}
	}
	
	/*setters*/
	public ArrayList<String> getNames(){
		return names;
	}

}
