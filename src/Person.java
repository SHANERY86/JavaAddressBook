//This class sets the structure for the Person object with fields that stores their personal information.

public class Person {
        private String firstName;
        private String lastName;
        private String gender;
        private String DOB;


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setDOB(String DOB) {
            this.DOB = DOB;
        }

        public void setGender(String gender) {
            if(gender.equals("M") || gender.equals("F") || gender.equals("m") || gender.equals("f")){
                this.gender = gender.toUpperCase();
            }
            else{
                this.gender = "Unspecified";
            }
        }

        public String getName() {
            return firstName + " " + lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getDOB() { return DOB; }

        public String getGender() {
            return gender;
        }

        public Person(String firstName,String lastName, String gender, String DOB) {
            setFirstName(firstName);
            setLastName(lastName);
            setGender(gender);
            this.DOB = DOB;
        }

        public String toString(){
            return " Name: " + firstName + " " + lastName
                    + "\n D.O.B: " + DOB
                    + "\n Gender: " + gender;
        }
    }


