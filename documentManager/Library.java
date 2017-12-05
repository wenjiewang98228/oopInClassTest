package documentManagement;

import java.util.Scanner;

public class Library implements Comparable {

	private static Author strArray;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Journal[] journals = null;
		Proceeding[] proceedings = null;
		int journalCount = 0;
		int proceedingCount = 0;
		
		System.out.println("添加请选1，查找请选2,结束请按0：");
		Scanner input = new Scanner(System.in);
		int flag = input.nextInt();
		while(flag == 1 || flag == 2){
			
			if(flag == 1){
				System.out.println("添加期刊请选1,添加会议记录请选2");
				int choice = input.nextInt();
				if(choice == 1){
					addJournal(journals,journalCount);
					journalCount++;
				}else{
					addProceeding(proceedings,proceedingCount);
					proceedingCount++;
				}
				flag = input.nextInt();
			}
			else {
				System.out.println("请输入想查找的作者/标题");
				Scanner is = new Scanner(System.in);
				String info = is.nextLine();
				search(info,journalCount,journals,proceedingCount,proceedings);
			}
		}
	}

	public static void addJournal(Journal journals[],int journalCount){
		System.out.println("请输入标题：");
		Scanner sc = new Scanner(System.in);
		String Title = sc.nextLine();

		
		System.out.println("请输入作者信息(输入-1表示结束)：");
		while(sc.equals("-1") == false){
			Author[] author = new Author[100];
			for(int j=0;j<100;j++){
                strArray = null;
			    strArray.setfirstName(sc.nextLine());
			    strArray.setlastName(sc.nextLine());
			    strArray.setemailAddress(sc.nextLine());
			    strArray.setinstitution(sc.nextLine());
			    author[j] = strArray;
			}
			journals[journalCount].setauthors(author);
		}
		
		System.out.println("请输入发布日期：");
		String Date = sc.nextLine();
		journals[journalCount].setdate(Date);
		
		System.out.println("请输入开始页码：");
		int StartPage = sc.nextInt();
		journals[journalCount].setstartPage(StartPage);
		
		System.out.println("请输入结束页码：");
		int EndPage = sc.nextInt();
		journals[journalCount].setendPage(EndPage);
		
		System.out.println("请输入期刊名：");
		String JournalName = sc.nextLine();
		journals[journalCount].setjournalName(JournalName);
		
		System.out.println("请输入刊号：");
		int JournalNum = sc.nextInt();
		journals[journalCount].setjournalNum(JournalNum);
	}
	
public static void addProceeding(Proceeding proceedings[],int proceedingCount){
	System.out.println("请输入标题：");
	Scanner sc = new Scanner(System.in);
	String Title = sc.nextLine();
	proceedings[proceedingCount].settitle(Title);
	
	System.out.println("请输入作者信息(输入-1表示结束)：");
	while(sc.equals("-1") == false){
		Author[] author = new Author[100];
		for(int j=0;j<100;j++){
            Author strArray = null;
		    strArray.setfirstName(sc.nextLine());
		    strArray.setlastName(sc.nextLine());
		    strArray.setemailAddress(sc.nextLine());
		    strArray.setinstitution(sc.nextLine());
		    author[j] = strArray;
		}
		proceedings[proceedingCount].setauthors(author);
	}
	
	System.out.println("请输入发布日期：");
	String Date = sc.nextLine();
	proceedings[proceedingCount].setdate(Date);
	
	System.out.println("请输入开始页码：");
	int StartPage = sc.nextInt();
	proceedings[proceedingCount].setstartPage(StartPage);
	
	System.out.println("请输入结束页码：");
	int EndPage = sc.nextInt();
	proceedings[proceedingCount].setendPage(EndPage);
	
	System.out.println("请输入文集名：");
	String paperCollection = sc.nextLine();
	proceedings[proceedingCount].setpaperCollection(paperCollection);
	
	}

	
	public static void search(String info,int journalCount,Journal[] journals,int proceedingCount,Proceeding[] proceedings){
		for(int x=0;x<journalCount;x++){
			if(journals[journalCount].gettilte().equals(info)==true){
				System.out.println(journals[journalCount]);
			}
			Author[][] Author = journals[journalCount].getauthors();
			for(int m=0;m<journals[journalCount].getauthors().length;m++){
				if((Author[m][0].equals(info)==true)||(Author[m][1].equals(info)==true)||
						(Author[m][2].equals(info)==true)||(Author[m][3].equals(info)==true)){
					System.out.println(journals[journalCount]);
				}
			}
		}
	
	for(int y=0;y<proceedingCount;y++){
		if(proceedings[proceedingCount].gettilte().equals(info)==true){
			System.out.println(proceedings[proceedingCount]);
		}
		Author[][] Author = proceedings[proceedingCount].getauthors();
		for(int m=0;m<proceedings[proceedingCount].getauthors().length;m++){
			if((Author[m][0].equals(info)==true)||(Author[m][1].equals(info)==true)||
					(Author[m][2].equals(info)==true)||(Author[m][3].equals(info)==true)){
				System.out.println(proceedings[proceedingCount]);
			}
		}
	}
}

	@Override
	public int comparable(int citation) {
		// TODO Auto-generated method stub
		return 0;
	}
}

