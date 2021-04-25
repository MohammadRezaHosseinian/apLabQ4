/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author mohammadreza
 */
public class Votting {

        private int type;
        private String question;
        private ArrayList<Person> voters;
        private HashMap<String, HashSet<Vote>> polls;

        public Votting(int type, String question) {
                this.type = type;
                this.question = question;
                this.polls = new HashMap<>();
                this.voters = new ArrayList<>();
        }

        public int getType() {
                return type;
        }

        public String getQuestion() {
                return question;
        }

        public ArrayList<Person> getVoters() {
                return voters;
        }

        public HashMap<String, HashSet<Vote>> getPolls() {
                return polls;
        }

        public void creatChoice(String option) {
                this.polls.put(option, new HashSet<>());
        }

        public void vote(Person person, ArrayList<String> options) {
                if (!this.voters.contains(person)) {
                        this.voters.add(person);
                }
                if (this.type == 0) {
                        ArrayList<String> firstVote = new ArrayList<>();
                        firstVote.add(options.get(0));
                        this.polls.get(options.get(0)).add(new Vote(person));
                        return;
                }

                for (String option : options) {
                        HashSet<Vote> hashSet = this.polls.get(option);
                        hashSet.add(new Vote(person));
                }
        }

        @Override
        public String toString() {
                return "Votting{" + "type=" + type + ", question=" + question + ", voters=" + voters + ", polls=" + polls + '}';
        }

        public void printResult() {
                for (String option : this.polls.keySet()) {
                        System.out.format("[+] %s   :   %d \n", option, this.polls.get(option).size());
                }
        }

        public void printVotes() {
                for (String key : polls.keySet()) {
                        System.out.println(polls.get(key));
                }
        }

}
