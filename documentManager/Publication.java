package documentManagement;

public class Publication {

	private String title = "";
	private Author[] authors[];
	private String date = "";
	private int startPage = 0;
	private int endPage = 0;
	public int citationCount;
	
	public Publication(String the_title,Author[] the_authors,String the_date,int the_startPage,
			int the_endPage,int citationCount){
		settitle(the_title);
		setauthors(the_authors);
		setdate(the_date);
		setstartPage(the_startPage);
		setendPage(the_endPage);
	//	this.citationCount = citationCount;
	}

	public void setendPage(int the_endPage) {
		// TODO Auto-generated method stub
		endPage = the_endPage;
	}

	public void setstartPage(int the_startPage) {
		// TODO Auto-generated method stub
		startPage = the_startPage;
	}

	public void setdate(String the_date) {
		// TODO Auto-generated method stub
		date = the_date;
	}

	public void setauthors(Author[] the_authors) {
		// TODO Auto-generated method stub
		int i = 0;
		for(;i<the_authors.length;i++){
			authors[i] = the_authors[i];
		}
	}

	public void settitle(String the_title) {
		// TODO Auto-generated method stub
		title = the_title;
	}
	
	public int getendPage() {
		// TODO Auto-generated method stub
		return endPage;
	}

	public int getstartPage() {
		// TODO Auto-generated method stub
		return startPage;
	}

	public String getdate() {
		// TODO Auto-generated method stub
		return date;
	}

	public Author[][] getauthors() {
		// TODO Auto-generated method stub
		return authors;
	}

	public String gettilte() {
		// TODO Auto-generated method stub
		return title;
	}
	
}
