package ru.netology.services;

public class WorkCalcService {
    public int workCalculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                // System.out.println("Месяц "+month+". Денег "+money+". Буду отдыхать. Потратил -"+expenses+ ", затем еще -"+((money - expenses)/3)*2);

                money = (money - expenses) / 3;
            } else {
                // System.out.println("Месяц "+month+".Денег "+money+". Придется работать. Заработал +"+income+ ", потратил -"+expenses);
                money = money + income - expenses;

            }
        }
        return count;
    }
}
