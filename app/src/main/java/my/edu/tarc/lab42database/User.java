package my.edu.tarc.lab42database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName="user")
public class User {
    @PrimaryKey
    @NonNull
    private String Phone;
    private String firstName;
    private String lastName;

    public User() {
        }

    @NonNull
    public String getPhone() {
        return Phone;
    }

    public void setPhone(@NonNull String phone) {
        Phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(@NonNull String phone, String firstName, String lastName) {

        Phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
