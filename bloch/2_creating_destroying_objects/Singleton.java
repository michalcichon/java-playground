class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		System.out.println("Create Singleton");
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public static void main(String [] args) {
		System.out.println("Hello from main()");
		Singleton.getInstance();
	}

}