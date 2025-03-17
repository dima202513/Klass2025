package Homework.homework11_03_2025;

import java.util.ArrayList;
import java.util.List;
public class Team {
    private double price;
    private List<Worker> workersList = new ArrayList<>();

    public void addWorkers(Worker... workers) {
        for (Worker worker : workers) {
            workersList.add(worker);
        }
    }

    public List<Worker> getWorkersList() {
        return workersList;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Team{" +
                "price=" + price +
                ", workersList=" + workersList +
                '}';
    }
}