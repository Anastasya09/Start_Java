package Homeworks_Java;

public class Abonement {
        private int cost;
        private int duration;
        private int visitsLeft;

        public Abonement(int cost, int duration, int visitsLeft) {
            this.cost = cost;
            this.duration = duration;
            this.visitsLeft = visitsLeft;
        }

        public int getCost() {

            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getDuration() {

            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getVisitsLeft() {
            return visitsLeft;
        }

        public void setVisitsLeft(int visitsLeft) {
            this.visitsLeft = visitsLeft;
        }

        public boolean isActive() {

            return (duration > 0 && visitsLeft > 0);
        }

        public int getTimeLeft() {

            return duration;
        }
}
