/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bluewhale;

/**
 *
 * @author Kavindi
 */
public class User {
    private String email;
    private String password;
    private String name;
    private String address;
    private String question;
    private String answer;

    public User(String email, String password, String name, String address, String question, String answer) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.question = question;
        this.answer = answer;
    }
 
    //getters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    //setters
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String adderss) {
        this.address = adderss;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
