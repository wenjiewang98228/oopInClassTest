package documentManagement;

public class Journal extends Publication {

	
	private String journalName = "";
	private int journalNum = 0;
	
	public Journal(String the_title, Author[] the_authors, String the_date, int the_startPage, 
			int the_endPage,String the_journalName,int the_journalNum) {
		super(the_title, the_authors, the_date, the_startPage, the_endPage, the_journalNum);
		// TODO Auto-generated constructor stub
		setjournalName(the_journalName);
		setjournalNum(the_journalNum);
	}

	public void setjournalNum(int the_journalNum) {
		// TODO Auto-generated method stub
		journalNum = the_journalNum;
	}

	public void setjournalName(String the_journalName) {
		// TODO Auto-generated method stub
		journalName = the_journalName;
	}
	
	public int getjournalNum() {
		// TODO Auto-generated method stub
		return journalNum;
	}

	public String getjournalName() {
		// TODO Auto-generated method stub
		return journalName;
	}
}
