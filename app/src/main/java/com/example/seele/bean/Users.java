package com.example.seele.bean;

/**
 * Created by SEELE on 2017/8/17.
 */

public class Users {
    private final String mFirstName;//必选
    private final String mLastName;//必选
    private final String mGender;//可选
    private final int mAge;//可选
    private final String mPhoneNumber;//可选
    private String mContry;

    public Users(UserBuilder builder) {
        mFirstName = builder.firstName;
        mLastName = builder.lastName;
        mGender = builder.gender;
        mAge = builder.age;
        mPhoneNumber = builder.phoneNumber;
        mContry = builder.contry;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public String getmGender() {
        return mGender;
    }

    public int getmAge() {
        return mAge;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmContry() {
        return mContry;
    }

    public void setmContry(String mContry) {
        this.mContry = mContry;
    }

    public static class UserBuilder{
        private final String firstName;//必选
        private final String lastName;//必选
        private String gender;//可选
        private int age;//可选
        private String phoneNumber;//可选
        private String contry;//可选

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        //设置好的默认的值，用户只需要设置是否添加这个默认值
        public UserBuilder contry(){
            this.contry = "中国";
            return this;
        }

        public Users build(){
            return new Users(this);
        }

    }
}
