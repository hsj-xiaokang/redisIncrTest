package majorcanexam;

public class MajorCanExam {
	//专业名称
	private String optionName;
	//该专业能不能考试
	private boolean exam;
	//需要几年从业经验
	private int year = -1;

	
	public MajorCanExam() {
		super();
	}
	public MajorCanExam(String optionName, boolean exam, int year) {
		super();
		this.optionName = optionName;
		this.exam = exam;
		this.year = year;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public boolean isExam() {
		return exam;
	}
	public void setExam(boolean exam) {
		this.exam = exam;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
