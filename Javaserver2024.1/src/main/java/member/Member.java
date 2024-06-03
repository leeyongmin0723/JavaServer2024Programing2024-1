package member;

import java.sql.Date;

public class Member {

   private int id;
   private String username;
   private String company;
   private Date birthday;
   private String email;
   
   public void setId(int Id) {
      this.id = id;
   }
   
   public int getid() {
      return this.id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public Date getBirthday() {
      return birthday;
   }

   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   
}