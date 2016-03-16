package mum.edu.cs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaskInfo {
	private static final long serialVersionUID = 152096185105839L;
	
//	public TaskInfo(){
//		
//	}
	
//	public TaskInfo(String task, String time, String status){
//		this.task = task;
//		this.time = time;
//		this.status = status;
//	}
//	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "TK_ID")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
