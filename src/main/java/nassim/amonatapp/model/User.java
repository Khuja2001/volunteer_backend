package nassim.amonatapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_Id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public int userId;
    @Column( name = "user_Photo")
    public String userPhoto;
    @Column( name = "user_Name")
    public String userName;
    @Column( name = "user_Surname")
    public String userSurname;
    @Column (name = "user_Patronymic")
    public String userPatronymic;
    @Column( name = "user_Phone")
    public String userPhone;
    @Column( name = "user_TIN")
    public String userTIN;
    @Column (name = "user_Email")
    public String userEmail;
    @Column (name = "user_Birth")
    public String userBirth;

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserName() { return userName; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserPatronymic() {
        return userPatronymic;
    }

    public void setUserPatronymic(String userPatronymic) {
        this.userPatronymic = userPatronymic;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserTIN() {
        return userTIN;
    }

    public void setUserTIN(String userTIN) {
        this.userTIN = userTIN;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

}
