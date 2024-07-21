package javaTask.JavaMethodOverriding;

public class Main {
    public static void main(String[] args) {

        Sports sports = new Sports();
        Sports soccer = new Soccer();

        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
