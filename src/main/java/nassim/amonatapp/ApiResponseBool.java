package nassim.amonatapp;

public class ApiResponseBool {

    private Boolean condition;
    private String nameSurname_volunteer;
    private Integer id_volunteer;
    private String phone_volunteer;


    public ApiResponseBool(Boolean condition, String nameSurname_volunteer, Integer id_volunteer, String phone_volunteer) {
        this.condition= condition;
        this.nameSurname_volunteer = nameSurname_volunteer;
        this.id_volunteer = id_volunteer;
        this.phone_volunteer = phone_volunteer;
    }


    public Boolean getCondition() {
        return condition;
    }

    public void setCondition(Boolean condition) {
        this.condition = condition;
    }


    public String getNameSurname_volunteer() {
        return nameSurname_volunteer;
    }

    public void setNameSurname_volunteer(String nameSurname_volunteer) { this.nameSurname_volunteer = nameSurname_volunteer; }


    public Integer getId_volunteer() {
        return id_volunteer;
    }

    public void setId_volunteer(Integer id_volunteer) {
        this.id_volunteer = id_volunteer;
    }

    public String getPhone_volunteer() {
        return phone_volunteer;
    }

    public void setPhone_volunteer(String phone_volunteer) {
        this.phone_volunteer = phone_volunteer;
    }
}
