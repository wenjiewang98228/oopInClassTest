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
		
		System.out.println("�����ѡ1��������ѡ2,�����밴0��");
		Scanner input = new Scanner(System.in);
		int flag = input.nextInt();
		while(flag == 1 || flag == 2){
			
			if(flag == 1){
				System.out.println("����ڿ���ѡ1,��ӻ����¼��ѡ2");
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
				System.out.println("����������ҵ�����/����");
				Scanner is = new Scanner(System.in);
				String info = is.nextLine();
				search(info,journalCount,journals,proceedingCount,proceedings);
			}
		}
	}

	public static void addJournal(Journal journals[],int journalCount){
		System.out.println("��������⣺");
		Scanner sc = new Scanner(System.in);
		String Title = sc.nextLine();

		
		System.out.println("������������Ϣ(����-1��ʾ����)��");
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
		
		System.out.println("�����뷢�����ڣ�");
		String Date = sc.nextLine();
		journals[journalCount].setdate(Date);
		
		System.out.println("�����뿪ʼҳ�룺");
		int StartPage = sc.nextInt();
		journals[journalCount].setstartPage(StartPage);
		
		System.out.println("���������ҳ�룺");
		int EndPage = sc.nextInt();
		journals[journalCount].setendPage(EndPage);
		
		System.out.println("�������ڿ�����");
		String JournalName = sc.nextLine();
		journals[journalCount].setjournalName(JournalName);
		
		System.out.println("�����뿯�ţ�");
		int JournalNum = sc.nextInt();
		journals[journalCount].setjournalNum(JournalNum);
	}
	
public static void addProceeding(Proceeding proceedings[],int proceedingCount){
	System.out.println("��������⣺");
	Scanner sc = new Scanner(System.in);
	String Title = sc.nextLine();
	proceedings[proceedingCount].settitle(Title);
	
	System.out.println("������������Ϣ(����-1��ʾ����)��");
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
	
	System.out.println("�����뷢�����ڣ�");
	String Date = sc.nextLine();
	proceedings[proceedingCount].setdate(Date);
	
	System.out.println("�����뿪ʼҳ�룺");
	int StartPage = sc.nextInt();
	proceedings[proceedingCount].setstartPage(StartPage);
	
	System.out.println("���������ҳ�룺");
	int EndPage = sc.nextInt();
	proceedings[proceedingCount].setendPage(EndPage);
	
	System.out.println("�������ļ�����");
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

