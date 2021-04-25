/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.ArrayList;

/**
 *
 * @author mohammadreza
 */
public class VottingSystem {

        private ArrayList<Votting> vottingList;

        public VottingSystem() {
                this.vottingList = new ArrayList<>();
        }

        public ArrayList<Votting> getVottingList() {

                return vottingList;
        }

        public void creatVotting(String question, int type, ArrayList<String> options) {
                Votting votting = new Votting(type, question);
                for (String option : options) {
                        votting.creatChoice(option);
                }
                this.vottingList.add(votting);
        }

        public Votting getVoting(int index) {
                return vottingList.get(index);
        }

        public void vote(int index, Person person, ArrayList<String> options) {

                Votting votting = this.vottingList.get(index);
                votting.vote(person, options);
        }

        public void printResult(int i) {
                Votting votting = this.vottingList.get(i);
                if (votting != null) {
                        votting.printResult();
                }
        }

        @Override
        public String toString() {
                return "VottingSystem{" + "vottingList=" + vottingList + '}';
        }

}
