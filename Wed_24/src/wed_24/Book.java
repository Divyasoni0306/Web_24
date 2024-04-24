package wed_24;

import java.util.Scanner;



public class Book {
	int bookid;
	String bookName;
	float bookPrice;
	
	
//Setter getter method
	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public float getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}


	
//tostring method

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Taking inputs from user
		System.out.println("Enter The no of books-");//the no of books of details user want 
		int num = sc.nextInt();
		Book book[] = new Book[num];
		System.out.println("Enter Book Details-");
		
		for(int i=0; i<num; i++) {
			Book b = new Book();
			System.out.print("Enter Book Id: ");
			int bookid = sc.nextInt();
			sc.nextLine();
			b.setBookid(bookid);
			System.out.print("Enter Book Name: ");
			String bookName = sc.nextLine();
			b.setBookName(bookName);
			System.out.print("Enter Book Price: ");
			float bookPrice = sc.nextFloat();
			b.setBookPrice(bookPrice);
			book[i] = b;
			
	
		}
//		printing the output
			for(int i1=0; i1<num; i1++) {
				System.out.println(book[i1]);
		
	}

}


}
