package com.java4rohit.DesignPattern.CreationalPattern.Builder;

public class TestBuilder {
    public static void main(String[] args) {
        User user = new  User.UserBuilder()
                .setUserId("userId123")
                .setUserName("Java$rohit")
                .setEmailId("Rohit@gamil.com").build();
        System.out.println(user);
        User user2 = User.UserBuilder.builder().setUserId("ik").setEmailId("ss").build();
        System.out.println(user2);
    }
}