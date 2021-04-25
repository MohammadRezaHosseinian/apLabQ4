/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import me.moallemi.persiandate.PersianDate;

public class Main {

        public static void main(String[] args) {

                PersianDate pd = PersianDate.now();
                System.out.println(pd);
                VottingSystem vottingSystem = new VottingSystem();
                ArrayList<Person> personList = new ArrayList<>();
                String[] names = {"mohammadReza", "Amir", "Hamed", "Hassan", "Yaghoob", "Jamal", "Reza", "Mahdi", "Karim", "Roozbeh"};
                Person p;
                Scanner input = new Scanner(System.in);

                System.out.println("1.Presidential Election(RANDOM)");
                System.out.println("2.Parliament election(RANDOM");
                System.out.println("3.Presidential election");
                System.out.println("4.Parliament election");
                int choose = input.nextInt();
                switch (choose) {
                        case 1:
                                for (int i = 0; i < names.length; i++) {
                                        p = new Person(names[i], String.valueOf(i));
                                        personList.add(p);
                                }
                                String question = "What is the best team?";
                                ArrayList<String> options = new ArrayList<>();
                                options.add("1) RealMadrid");
                                options.add("2) Barca");
                                options.add("3) Juventus");
                                options.add("4) AC Milan");
                                options.add("5) Man unt");
                                vottingSystem.creatVotting(question, 1, options);
                                int choice;
                                Random rand = new Random();
                                ArrayList<String> optionVote = new ArrayList<>(1);
                                for (int i = 0; i < names.length; i++) {
                                        choice = rand.nextInt(options.size()) + 1;
                                        optionVote.add(options.get(i % choice));
                                        vottingSystem.vote(0, personList.get(i), optionVote);
                                        optionVote.remove(options.get(i % choice));

                                }
                                vottingSystem.printResult(0);
                                for (Person person : personList) {
                                        System.out.println(person);
                                }

                                vottingSystem.getVoting(0).printVotes();
                                break;
                        case 2:
                                for (int i = 0; i < names.length; i++) {
                                        p = new Person(names[i], String.valueOf(i));
                                        personList.add(p);
                                }
                                String question2 = "What is the best team?";
                                ArrayList<String> options2 = new ArrayList<>();
                                options2.add("1) RealMadrid");
                                options2.add("2) Barca");
                                options2.add("3) Juventus");
                                options2.add("4) AC Milan");
                                options2.add("5) Man unt");
                                vottingSystem.creatVotting(question2, 1, options2);
                                int choice2;
                                Random rand2 = new Random();
                                ArrayList<String> optionVote2 = new ArrayList<>(1);
                                for (int i = 0; i < names.length; i++) {
                                        choice2 = rand2.nextInt(options2.size()) + 1;
                                        optionVote2.add(options2.get(i % choice2));
                                        vottingSystem.vote(0, personList.get(i), optionVote2);
                                        optionVote2.remove(options2.get(i % choice2));
                                        choice2 = rand2.nextInt(options2.size()) + 1;
                                        optionVote2.add(options2.get(i % choice2));
                                        vottingSystem.vote(0, personList.get(i), optionVote2);
                                        optionVote2.remove(options2.get(i % choice2));
                                        choice2 = rand2.nextInt(options2.size()) + 1;
                                        optionVote2.add(options2.get(i % choice2));
                                        vottingSystem.vote(0, personList.get(i), optionVote2);
                                        optionVote2.remove(options2.get(i % choice2));

                                }
                                vottingSystem.printResult(0);
                                for (Person person : personList) {
                                        System.out.println(person);
                                }
                                vottingSystem.getVoting(0).printVotes();
                                break;
                        case 3:
                                for (int i = 0; i < names.length; i++) {
                                        p = new Person(names[i], String.valueOf(i));
                                        personList.add(p);
                                }
                                String question3 = "What is the best team?";
                                ArrayList<String> options3 = new ArrayList<>();
                                options3.add("1) RealMadrid");
                                options3.add("2) Barca");
                                options3.add("3) Juventus");
                                options3.add("4) AC Milan");
                                options3.add("5) Man unt");
                                vottingSystem.creatVotting(question3, 1, options3);
                                int choice3;
                                Random rand3 = new Random();
                                ArrayList<String> optionVote3 = new ArrayList<>(1);
                                for (int i = 0; i < names.length; i++) {
                                        System.out.println("What is the best team?");
                                        System.out.println("1) RealMadrid\n2) Barca\n3)Juventus\n4) AC Milan\n5) Man unt");
                                        choice3 = input.nextInt();

                                }
                                for (int i = 0; i < names.length; i++) {
                                        choice3 = rand3.nextInt(options3.size()) + 1;
                                        optionVote3.add(options3.get(i % choice3));
                                        vottingSystem.vote(0, personList.get(i), optionVote3);
                                        optionVote3.remove(options3.get(i % choice3));

                                }
                                vottingSystem.printResult(0);
                                for (Person person : personList) {
                                        System.out.println(person);
                                }

                                vottingSystem.getVoting(0).printVotes();
                                break;
                        case 4:
                                for (int i = 0; i < names.length; i++) {
                                        p = new Person(names[i], String.valueOf(i));
                                        personList.add(p);
                                }
                                String question4 = "What is the best team?";
                                ArrayList<String> options4 = new ArrayList<>();
                                options4.add("1) RealMadrid");
                                options4.add("2) Barca");
                                options4.add("3) Juventus");
                                options4.add("4) AC Milan");
                                options4.add("5) Man unt");
                                vottingSystem.creatVotting(question4, 1, options4);
                                int choice4;
                                Random rand4 = new Random();
                                ArrayList<String> optionVote4 = new ArrayList<>(1);
                                for (int i = 0; i < names.length; i++) {
                                        System.out.println("What is the best team?");
                                        System.out.println("1) RealMadrid\n2) Barca\n3)Juventus\n4) AC Milan\n5) Man unt");
                                        choice4 = input.nextInt();

                                }
                                for (int i = 0; i < names.length; i++) {
                                        choice4 = rand4.nextInt(options4.size()) + 1;
                                        optionVote4.add(options4.get(i % choice4));
                                        vottingSystem.vote(0, personList.get(i), optionVote4);
                                        optionVote4.remove(options4.get(i % choice4));
                                        choice4 = rand4.nextInt(options4.size()) + 1;
                                        optionVote4.add(options4.get(i % choice4));
                                        vottingSystem.vote(0, personList.get(i), optionVote4);
                                        optionVote4.remove(options4.get(i % choice4));
                                }
                                vottingSystem.printResult(0);
                                for (Person person : personList) {
                                        System.out.println(person);
                                }

                                vottingSystem.getVoting(0).printVotes();
                                break;
                }

        }
}
