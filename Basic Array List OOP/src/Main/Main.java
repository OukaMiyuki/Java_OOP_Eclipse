package Main;

import java.util.ArrayList;

import Books.Books;;

public class Main {

	public static void main(String[] args) {
		ArrayList<Books> BookArr = new ArrayList<Books>();
		Books bk1 = new Books(1, "satu", "Author1", 100, 2009);
		Books bk2 = new Books(2, "dua", "Author2", 100, 2009);
		Books bk3 = new Books(3, "tiga", "Author3", 100, 2009);
		Books bk4 = new Books(4, "empat", "Author4", 100, 2009);
		Books bk5 = new Books(5, "lima", "Author5", 100, 2009);
		Books bk6 = new Books(6, "enam", "Author6", 100, 2009);
		Books bk7 = new Books(7, "tujuh", "Author7", 100, 2009);
		Books bk8 = new Books(8, "delapan", "Author8", 100, 2009);
		Books bk9 = new Books(9, "sembilan", "Author9", 100, 2009);
		Books bk10 = new Books(10, "sepuluh", "Author10", 100, 2009);
		Books bk11 = new Books(11, "sebelas", "Author11", 100, 2009);
		Books bk12 = new Books(12, "duabelas", "Author12", 100, 2009);
		Books bk13 = new Books(13, "tigabelas", "Author13", 100, 2009);
		
		BookArr.add(bk1);
		BookArr.add(bk2);
		BookArr.add(bk3);
		BookArr.add(bk4);
		BookArr.add(bk5);
		BookArr.add(bk6);
		BookArr.add(bk7);
		BookArr.add(bk8);
		BookArr.add(bk9);
		BookArr.add(bk10);
		BookArr.add(bk11);
		BookArr.add(bk12);
		BookArr.add(bk13);
		
		for(int i=0;i<BookArr.size();i++){
			System.out.print(BookArr.get(i).getid()+" | "+BookArr.get(i).gettitle()+" | "
							+BookArr.get(i).getauthor()+" | "+BookArr.get(i).getpages()
							+" | "+BookArr.get(i).getyear());
			System.out.println("");
		}
	}

}