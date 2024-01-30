package finals;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class y2022_s2_5 extends ConsoleProgram {
	private ArrayList<String> arr = new ArrayList<>();
	private int index = -1;
	private int countingUndo = 0;
	public String get(){
		if(index >= 0){
			return arr.get(index);
		}
		return null;
	}

	public void save(String text){
		ArrayList<String> arr2 = new ArrayList<>();
		if(index == -1){
			arr2.add(text);
			index++;
			countingUndo = 0;
		}else{
			for(int i = 0; i <= index; i++){
				arr2.add(arr.get(i));
			}
			arr2.add(arr.get(index) + text);
			index++;
			countingUndo = 0;
		}
		arr = arr2;
	}

	public void undo(){
		if(index >= 0){
			index--;
			countingUndo++;
		}	
	}

	public void redo(){
		if(countingUndo > 0){
			index++;
		}	
	}

	public void clear(){
		index = -1;
		arr.clear();
		countingUndo = 0;
	}

}
