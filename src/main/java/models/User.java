package models;

import java.util.List;

public class User {
    private int gender;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean offersEmailCheck;
    private boolean privacyCheck;
    private boolean newsletterCheck;
    private boolean psgdprCheck;


    public User() {
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOffersEmailCheck() {
        return offersEmailCheck;
    }

    public void setOffersEmailCheck(boolean offersEmailCheck) {
        this.offersEmailCheck = offersEmailCheck;
    }

    public boolean isPrivacyCheck() {
        return privacyCheck;
    }

    public void setPrivacyCheck(boolean privacyCheck) {
        this.privacyCheck = privacyCheck;
    }

    public boolean isNewsletterCheck() {
        return newsletterCheck;
    }

    public void setNewsletterCheck(boolean newsletterCheck) {
        this.newsletterCheck = newsletterCheck;
    }

    public boolean isPsgdprCheck() {
        return psgdprCheck;
    }

    public void setPsgdprCheck(boolean psgdprCheck) {
        this.psgdprCheck = psgdprCheck;
    }

    public static final class Builder {
        private int gender;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private boolean offersEmailCheck;
        private boolean privacyCheck;
        private boolean newsletterCheck;
        private boolean psgdprCheck;

        public Builder gender(int gender) {
            this.gender = gender;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder offersEmailCheck(Boolean offersEmailCheck) {
            this.offersEmailCheck = offersEmailCheck;
            return this;
        }

        public Builder privacyCheck(Boolean privacyCheck) {
            this.privacyCheck = privacyCheck;
            return this;
        }

        public Builder newsletterCheck(Boolean newsletterCheck) {
            this.newsletterCheck = newsletterCheck;
            return this;
        }

        public Builder psgdprCheck(Boolean psgdprCheck) {
            this.psgdprCheck = psgdprCheck;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public User build(){

            User user = new User();
            user.gender = this.gender;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.email = this.email;
            user.password = this.password;
            user.offersEmailCheck = this.offersEmailCheck;
            user.privacyCheck = this.privacyCheck;
            user.newsletterCheck = this.newsletterCheck;
            user.psgdprCheck = this.psgdprCheck;
            return user;
        }
    }
}
