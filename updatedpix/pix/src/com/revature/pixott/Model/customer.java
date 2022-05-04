package com.revature.pixott.Model;

import java.util.Objects;

public class customer {
private int id;
private String name;
private String mobilenumber;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public int hashCode() {
	return Objects.hash(id, mobilenumber, name, password);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	customer other = (customer) obj;
	return id == other.id && Objects.equals(mobilenumber, other.mobilenumber) && Objects.equals(name, other.name)
			&& Objects.equals(password, other.password);
}
@Override
public String toString() {
	return "customer [id=" + id + ", name=" + name + ", mobilenumber=" + mobilenumber + ", password=" + password + "]";
}

}
