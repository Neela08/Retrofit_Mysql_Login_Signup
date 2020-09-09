package com.bitwisey.retrofit_mysql_login_signup.Model;
import com.google.gson.annotations.SerializedName;

public class RetroInfo {

    @SerializedName("name")
    private String name;

    @SerializedName("user_name")
    private String user_name;

    @SerializedName("password")
    private String password;

    @SerializedName("phone")
    private String phone;

    @SerializedName("response")
    private String response;

    public RetroInfo( String name, String user_name,String password, String phone,String response) {

        this.name = name;
        this.user_name = user_name;
        this.password=password;
        this.phone = phone;
        this.response=response;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) { this.password = password; }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }

}
