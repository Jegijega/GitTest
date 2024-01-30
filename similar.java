ქულა: 30
მაქსიმალური ქულა: 30
შენიშვნები:
private boolean similar(Stiring first, String second) {
	for(int n = 0; n < first.length(); n++){
		String editedfirst;
		for(int m = 0; m < second.length; m++){
			if(n = 0){
				editedfirst = second.charAt(m) +first.substring(1);
			}else {
				String editedfirst = first.substring(0;n) + second.charAt(m) + first.substring(n + 1)
			}
			for(int i = 0; i <	editedfirst.length(); i++){
				if(editedfirst.charAt(i) == second.charAt(0){
					int k = 0;
					int counter = 0;
					for(int j = 0; j < second.length(); j++){
						if(j + i > editedfirst.length()){
							k = j + i - editedfirst.length();
						}else{
							k = j + i;
						}
						if(editedfirst.charAt(k) == second.charAt(j)){
							counter++;
						}
					}
					if(counter == second.length()){
						return true;
					}
				}
			}
		}	
	}	
	return false;
}