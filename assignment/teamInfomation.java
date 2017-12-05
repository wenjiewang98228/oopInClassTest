package assignment;

import java.util.ArrayList;

/*������Ϣ*/
public class teamInfomation {
	private String name;//����
	private String time;//����ʱ��
	private personInCharge managerInfo;//��������Ϣ
	private String telNum;//�绰����
	private String mailNum;//�������
	private String introduction;//��飨������200�֣�
	private ArrayList<String> members;//���ų�Ա
	
	/*���췽��*/
	public teamInfomation(String name,String time,personInCharge managerInfo,String telNum,String mailNum,
			              String introdction,ArrayList<String> members){
		setName(name);
		setTime(time);
		setManagerInfo(managerInfo);
		setTelNum(telNum);
		setMailNum(mailNum);
		setIntroduction(introduction);
		setMembers(members);
	}
	
	/*setters*/
	public void setName(String aName){
		this.name = aName;
	}
	
	public void setTime(String aTime){
		this.time = aTime;
	}
	
	public void setManagerInfo(personInCharge aManagerInfo){
		this.managerInfo = aManagerInfo;
	}
	
	public void setTelNum(String aTelNum){
		this.telNum = aTelNum;
	}
	
	public void setMailNum(String aMailNum){
		this.mailNum = aMailNum;
	}
	
	public void setIntroduction(String aIntroduction){
		this.introduction = aIntroduction;
	}
	
	public void setMembers(ArrayList<String> aMembers){
		for(int i = 0; i < aMembers.size(); i++){
			members.add(aMembers.get(i));
		}
	}
	
	/*getters*/
	public String getName(){
		return name;
	}
	
	public String getTime(){
		return time;
	}
	
	public personInCharge getManagerInfo(){
		return managerInfo;
	}
	
	public String getTelNum(){
		return telNum;
	}
	
	public String getMailNum(){
		return mailNum;
	}
	
	public String getIntroduction(){
		return introduction;
	}
	
	public ArrayList<String> getMembers(){
		return members;
	}

}
