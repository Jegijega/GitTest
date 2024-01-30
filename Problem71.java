import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class Problem71 extends ConsoleProgram {
	private HashMap<String, ArrayList<String>> teachers = new HashMap<>();
	private HashMap<String, ArrayList<String>> students = new HashMap<>();
	private ArrayList<String> currentTeachers = new ArrayList<>();
	private ArrayList<String> currentStudents = new ArrayList<>();
	private ArrayList<String> currentSubjects = new ArrayList<>();

	public void School() {

	}

	public void addTeacher(String teacher) {
		teachers.put(teacher, new ArrayList<String>());
	}

	public void addSubject(String teacher, String subject) {
		if (teachers.containsKey(teacher)) {
			teachers.get(teacher).add(subject);
		}
	}

	public void addPupil(String pupil, String subject) {
		if (students.containsKey(pupil)) {
			students.get(pupil).add(subject);
		} else {
			students.put(pupil, new ArrayList<String>());
			students.get(pupil).add(subject);
		}
	}

	public Iterator<String> getTeachers(String pupil) {
		if (students.containsKey(pupil)) {
			currentSubjects = students.get(pupil);
			for (String key : teachers.keySet()) {
				for (String subject : currentSubjects) {
					if (teachers.get(key).contains(subject)) {
						currentTeachers.add(key);
					}
				}
			}
			return currentTeachers.iterator();

		}
		return null;
	}

	public Iterator<String> getPupils(String teacher) {
		if(teachers.containsKey(teacher)){
			currentSubjects = teachers.get(teacher);
			for (String key : students.keySet()) {
				for (String subject : currentSubjects) {
					if (students.get(key).contains(subject)) {
						currentStudents.add(key);
					}
				}
			}
			return currentTeachers.iterator();
		}
		return null;
	}

	public void removeTeacher(String teacher) {
		teachers.remove(teacher);
	}
}
