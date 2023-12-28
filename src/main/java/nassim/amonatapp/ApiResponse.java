package nassim.amonatapp;

public class ApiResponse {
    private String message;
    private Integer id;
    public ApiResponse() {

    }

    public ApiResponse(String message, Integer id) {
        this.message = message;
        this.id = id;
    }

    public ApiResponse(String s) {

    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}