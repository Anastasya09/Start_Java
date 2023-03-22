package Homeworks_Java;

public class Instructor {
                private String name;
                private String specialization;
                private int experienceYears;

                public Instructor(String name, String specialization, int experienceYears) {
                        this.name = name;
                        this.specialization = specialization;
                        this.experienceYears = experienceYears;
                }

                public String getName() {

                    return name;
                }

                public void setName(String name) {

                    this.name = name;
                }

                public String getSpecialization() {

                    return specialization;
                }

                public void setSpecialization(String specialization) {

                    this.specialization = specialization;
                }

                public int getExperienceYears() {

                    return experienceYears;
                }

                public void setExperienceYears(int experienceYears) {

                    this.experienceYears = experienceYears;
                }

                public void introduce() {
                        System.out.println("Hi, my name is " + name + ". I specialize in " + specialization
                                + " and have " + experienceYears + " years of experience.");
                }

    public boolean isAvailable() {
        return false;
    }
}