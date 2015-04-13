package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StorageObject {
	private final StringProperty name = new SimpleStringProperty();
	private final StringProperty password = new SimpleStringProperty();
//public StorageObject(){
//}
public StringProperty name(){
	return name;
}
public final String Name(){
	return name().get();
}
public final void ChangeName(String argname){
	name().set(argname);
}
public StringProperty Password(){
	return password;
}
public void ChangePassword(String argpassword){
	Password().set(argpassword);
}
}
