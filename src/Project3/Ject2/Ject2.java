package Project3.Ject2;

public class Ject2 {
    public static void main(String[] args) {
        class Car {

            private String carModel = "Mitsibushi";
            private String yearMade = "2012";
            private int speed;

            public void changeSpeed(int newSpeed) {
                this.speed = newSpeed;
                System.out.println("New Speed of Car is " + newSpeed);
            }

            public void applyBrake() {
                System.out.println("Brakes Applied");
            }

            public void main(String args[]) {
                Car car1 = new Car();
                    System.out.println("Car Model is " + car1.carModel);
                System.out.println("Year Made is " + car1.yearMade);
                car1.changeSpeed(60);
                car1.applyBrake();
            }

        }
    }
}
