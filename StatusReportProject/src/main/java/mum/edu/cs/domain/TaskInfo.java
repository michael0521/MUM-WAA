package mum.edu.cs.domain;

public class TaskInfo {
	private static final long serialVersionUID = 152096185105839L;
	
	public TaskInfo(){
		
	}
	
	public TaskInfo(String task, String time, String status){
		this.task = task;
		this.time = time;
		this.status = status;
	}
	
	private String task;

	private String status;
	private String time;
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "task " + task + "  time " + time + " status " + status;
	}
	
}
