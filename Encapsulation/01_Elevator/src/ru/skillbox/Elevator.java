package ru.skillbox;
public class Elevator {
        private int currentFloor = 1;
        private int minFloor;
        private int maxFloor;
        public int floor;


        public Elevator(int minFloor, int maxFloor) {
            this.minFloor = minFloor;
            this.maxFloor = maxFloor;

        }

        public int getCurrentFloor() {
            return currentFloor;
        }
        public void moveDown(){
            currentFloor = currentFloor >= minFloor ? currentFloor - 1 : currentFloor;
        }
        public void moveUp(){
            currentFloor = currentFloor <= maxFloor ? currentFloor + 1 : currentFloor;
        }
        public void move(int floor){
            while(currentFloor != floor){

                if(currentFloor >= floor){
                    moveDown();
                }
                else {
                    moveUp();
                }
                System.out.println("Этаж номер: " + currentFloor);
            }
            System.out.println("Вы приехали.");

        }

    }


