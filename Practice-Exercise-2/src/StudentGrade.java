
public class StudentGrade {
	
	public int average(String[] marks) {
		int sum = 0;
		int n = marks.length;
		for(int i = 0; i < n; i++) {
			int grade = Integer.parseInt(marks[i]);
			sum  += grade;
		}
		return sum/n;
	}
	
	public int minimum(String[] marks) {
		int min = Integer.parseInt(marks[0]);
		int n = marks.length;
		for(int i = 1; i < n; i++) {
			int grade = Integer.parseInt(marks[i]);
			if(min > grade) {
				min = grade;
			}
		}
		return min;
	}
	
	public int maximum(String[] marks) {
		int max = Integer.parseInt(marks[0]);
		int n = marks.length;
		for(int i = 1; i < n; i++) {
			int grade = Integer.parseInt(marks[i]);
			if(max < grade) {
				max = grade;
			}
		}
		return max;
	}
}
