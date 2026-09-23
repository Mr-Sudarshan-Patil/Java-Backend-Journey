class BookInformation
{
	String title;
	String author;
	int pages;
	
	BookInformation(String _title, String _author, int _pages){
		this.title = _title;
		this.author = _author;
		this.pages = _pages;
	}
	
	public static void main(String args[])
	{
		BookInformation book1 = new BookInformation("Java Backend", "Suresh Bhishnoi", 126);
		book1.printDetails();
		
		BookInformation book2 = new BookInformation("Basic of Python", "Sudarshan", 97);
		book2.printDetails();
	}
	
	void printDetails(){
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Pages : " + pages);
	}
}