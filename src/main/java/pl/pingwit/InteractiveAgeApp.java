package pl.pingwit;


import pl.pingwit.service.AgeService;

public class InteractiveAgeApp {
    public static void main(String[] args) {
        AgeService ageService = new AgeService();
        ageService.startTheGame();
    }
}
