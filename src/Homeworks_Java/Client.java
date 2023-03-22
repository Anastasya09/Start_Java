package Homeworks_Java;

public class Client {

        private String name;
        private int age;
        private String gender;
        private int visitsCount;
        private Abonement abonement;

        public Client(String name, int age, String gender, int visitsCount, Abonement abonement) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.visitsCount = visitsCount;
            this.abonement = abonement;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getAge() {

            return age;
        }

        public void setAge(int age) {

            this.age = age;
        }

        public String getGender() {

            return gender;
        }

        public void setGender(String gender) {

            this.gender = gender;
        }

        public int getVisitsCount() {

            return visitsCount;
        }

        public void setVisitsCount(int visitsCount) {

            this.visitsCount = visitsCount;
        }

        public Abonement getAbonement() {

            return abonement;
        }

        public void setAbonement(Abonement abonement) {

            this.abonement = abonement;
        }

        public boolean isAbonementValid() {
            // check if client's abonement is still valid
            if (abonement != null) {
                return abonement.getTimeLeft() > 0;
            } else {
                return false;
            }
        }
}
