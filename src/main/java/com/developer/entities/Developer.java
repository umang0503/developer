package com.developer.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {
private @Id Integer devid;
private String name;
private String email;
private String skillLevel;
private LocalDate memberSince;
private Integer totalFeeds;
private boolean isVerfied;
private boolean isBlocked;
public Integer getDevid() {
	return devid;
}
public void setDevid(Integer devid) {
	this.devid = devid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSkillLevel() {
	return skillLevel;
}
public void setSkillLevel(String skillLevel) {
	this.skillLevel = skillLevel;
}
public LocalDate getMemberSince() {
	return memberSince;
}
public void setMemberSince(LocalDate memberSince) {
	this.memberSince = memberSince;
}
public Integer getTotalFeeds() {
	return totalFeeds;
}
public void setTotalFeeds(Integer totalFeeds) {
	this.totalFeeds = totalFeeds;
}
public boolean isVerfied() {
	return isVerfied;
}
public void setVerfied(boolean isVerfied) {
	this.isVerfied = isVerfied;
}
public boolean isBlocked() {
	return isBlocked;
}
public void setBlocked(boolean isBlocked) {
	this.isBlocked = isBlocked;
}


}
