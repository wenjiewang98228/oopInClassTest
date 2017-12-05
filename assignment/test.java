
package assignment;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> teamsOne = new ArrayList<String>();
		teamsOne.add("000");
		teamsOne.add("111");		
		activityInfomation activityOne = new activityInfomation("xxx","2017-7-12","123",teamsOne,"321546616");
		System.out.println(activityOne);
		ArrayList<String> teamsTwo = new ArrayList<String>();
		teamsTwo.add("000");
		teamsTwo.add("211");
		//activityInfomation activityTwo = new activityInfomation("xxx","2017-7-12","123",teamsTwo,"321546616");
		
/*		ArrayList<activityInfomation> activities = null;
		activities.add(activityOne);
		activities.add(activityTwo);
		for(int i=0; i<activities.size();i++){
			System.out.println(activities.get(i));
		}*/
	}

}
