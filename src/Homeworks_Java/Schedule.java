package Homeworks_Java;

public class Schedule {
        private String type;
        private int numSlots;

        public Schedule(String type, int numSlots) {
            this.type = type;
            this.numSlots = numSlots;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getNumSlots() {
            return numSlots;
        }

        public void setNumSlots(int numSlots) {
            this.numSlots = numSlots;
        }

        public boolean isOpenAtTime(int time) {
            // check if club is open at the given time
            if (type.equals("weekday")) {
                return (time >= 9 && time <= 21);
            } else if (type.equals("weekend")) {
                return (time >= 10 && time <= 18);
            } else {
                return false;
            }
        }
    public boolean isSlotAvailable() {
        return false;
    }

    public void addClientToSlot(Client client) {
    }

    public boolean removeClientFromSlot(Client client) {
        return false;
    }
}
