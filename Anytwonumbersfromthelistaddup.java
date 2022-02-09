class Anytwonumbersfromthelistaddup {
	public static void main(String args[]) {
		int[] list = {10, 15, 3, 7};
		int sum  = 17;

		for(int i=0;i<list.length;i++) {
			for(int j = i; j<list.length; j++) {
				if(list[i] + list[j] == sum) {
					System.out.println(true);
				}
			}
		}

		// Sort and use a while loop. < > ==
	}
}