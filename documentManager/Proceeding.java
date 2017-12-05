package documentManagement;

public class Proceeding extends Publication {

	private String paperCollection = "";
	
	public Proceeding(String the_title, Author[] the_authors, String the_date, int the_startPage, 
			int the_endPage,String the_paperCollection) {
		super(the_title, the_authors, the_date, the_startPage, the_endPage, the_endPage);
		// TODO Auto-generated constructor stub
		setpaperCollection(the_paperCollection);
	}

	public void setpaperCollection(String the_paperCollection) {
		// TODO Auto-generated method stub
		paperCollection = the_paperCollection;
	}

	
	public String getpaperCollection() {
		// TODO Auto-generated method stub
		return paperCollection;
	}
}
