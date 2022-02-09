class DefanginganIPAddress {

	String defangeip1(String ip) {
		String defangedip = "";

		for(int i=0;i<ip.length();i++) {
			if(ip.charAt(i) == '.') {
				defangedip += "[.]";
			} else {
				defangedip += ip.charAt(i);
			}
		}
		return defangedip;
	}

	String defangeip2(String ip) {
		String[] charip = ip.split("\\.");
		String defangedip = "";
		int i;
		for(i=0;i<charip.length-1;i++) {
			defangedip += charip[i] + "[.]";
		}
		defangedip += charip[i];
		return defangedip;
	}

	public static void main(String args[]) {
		String ip = "100 23 222 20";
		String defangedip = new DefanginganIPAddress().defangeip2(ip);
		System.out.println(defangedip);
	}
}