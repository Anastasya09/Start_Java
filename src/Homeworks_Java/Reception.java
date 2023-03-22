package Homeworks_Java;

public class Reception {
        private FitnessClub fitnessClub;

        public Reception(FitnessClub fitnessClub) {
            this.fitnessClub = fitnessClub;
        }

        public void registerNewClient(Client client) {
            if (fitnessClub.isClientLimitReached()) {
                System.out.println("Unable to register a new client. Client limit reached.");
            } else {
                fitnessClub.addClient(client);
                System.out.println("New client registered successfully.");
            }
        }

        public void removeClient(Client client) {
            if (fitnessClub.removeClient(client)) {
                System.out.println("Client removed successfully.");
            } else {
                System.out.println("Unable to remove client. Client not found.");
            }
        }

        public void enrollClientToClass(Client client, Instructor instructor, Schedule schedule) {
            if (client.isAbonementValid() && schedule.isSlotAvailable() && instructor.isAvailable()) {
                schedule.addClientToSlot(client);
                System.out.println("Client enrolled to the class successfully.");
            } else {
                System.out.println("Unable to enroll client to the class. Please check abonement, " +
                        "schedule and instructor availability.");
            }
        }

        public void cancelClientFromClass(Client client, Instructor instructor, Schedule schedule) {
            if (schedule.removeClientFromSlot(client)) {
                System.out.println("Client cancelled from the class successfully.");
            } else {
                System.out.println("Unable to cancel client from the class. Client not found in the schedule.");
            }
        }
        public class FitnessClub {
            public boolean isClientLimitReached() {

                return false;
            }

        public void addClient(Client client) {

        }

        public boolean removeClient(Client client) {

            return false;
        }
    }

}
