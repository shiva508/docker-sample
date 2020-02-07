package com.shiva.model;

import java.util.Date;

public class EmployeeTasks {
private Integer taskId;
private String taskDescription;
private Date startDate;
private Date endDate;
public EmployeeTasks() {
}
public Integer getTaskId() {
	return taskId;
}
public void setTaskId(Integer taskId) {
	this.taskId = taskId;
}
public String getTaskDescription() {
	return taskDescription;
}
public void setTaskDescription(String taskDescription) {
	this.taskDescription = taskDescription;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "EmployeeTasks [taskId=" + taskId + ", taskDescription=" + taskDescription + ", startDate=" + startDate
			+ ", endDate=" + endDate + "]";
}


}
