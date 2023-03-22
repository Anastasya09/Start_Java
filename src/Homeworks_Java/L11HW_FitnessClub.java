package Homeworks_Java;

public class L11HW_FitnessClub {
        private String name;
        private int maxClients;
        private int currentClients;
        private String address;

        public void FitnessClub(String name, int maxClients, String address) {
            this.name = name;
            this.maxClients = maxClients;
            this.currentClients = 0;
            this.address = address;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getMaxClients() {

            return maxClients;
        }

        public void setMaxClients(int maxClients) {

            this.maxClients = maxClients;
        }

        public int getCurrentClients() {

            return currentClients;
        }

        public void setCurrentClients(int currentClients) {

            this.currentClients = currentClients;
        }

        public String getAddress() {

            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public boolean canAddClients(int numClients) {

            return (currentClients + numClients <= maxClients);
        }

        public void addClients(int numClients) {
            if (canAddClients(numClients)) {
                currentClients += numClients;
                System.out.println("Added " + numClients + " clients. Total number of clients now: " + currentClients);
            } else {
                System.out.println("Could not add clients. Maximum number of clients reached.");
            }
        }
}
