class Main {

	public Main() {
		System.out.println("Create Main");
	}

	public static void main(String[] args) {
		new Main();
		Singleton.getInstance();
		//new Singleton();
	}
}