// https://cucumber.io/blog/open-source/announcing-cucumber-jvm-3-0-0/
// https://www.baeldung.com/cucumber-data-tables
// https://github.com/cucumber/cucumber-jvm/issues/1950

package co.com.choucair.academy.model;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class RegisterData {
    private String firstName, lastName, email, month, day, year, language;
    private String city, zipNode, country;
    private String os, osVersion, osLanguage;
    private String mobileBrand, mobileModel, mobileOS;
    private String newPassword;

    @DataTableType
    public static RegisterData mapRegisterData(Map<String, String> row) {
        return new RegisterData(
                row.get("firstName"),
                row.get("lastName"),
                row.get("email"),
                row.get("month"),
                row.get("day"),
                row.get("year"),
                row.get("language"),
                row.get("city"),
                row.get("zipCode"),
                row.get("country"),
                row.get("os"),
                row.get("osVersion"),
                row.get("osLanguage"),
                row.get("mobileBrand"),
                row.get("mobileModel"),
                row.get("mobileOS"),
                row.get("newPassword")

        );
    }

    public RegisterData(String firstName, String lastName, String email, String month, String day, String year, String language, String city, String zipNode, String country, String os, String osVersion, String osLanguage, String mobileBrand, String mobileModel, String mobileOS, String newPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.language = language;
        this.city = city;
        this.zipNode = zipNode;
        this.country = country;
        this.os = os;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.mobileOS = mobileOS;
        this.newPassword = newPassword;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipNode() {
        return zipNode;
    }

    public void setZipNode(String zipNode) {
        this.zipNode = zipNode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsLanguage() {
        return osLanguage;
    }

    public void setOsLanguage(String osLanguage) {
        this.osLanguage = osLanguage;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileOS() {
        return mobileOS;
    }

    public void setMobileOS(String mobileOS) {
        this.mobileOS = mobileOS;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
