/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.Objects;
import me.moallemi.persiandate.PersianDate;

/**
 *
 * @author mohammadreza
 */
public class Vote {

    private final PersianDate date;
    private final Person person;

    public PersianDate getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }

    public Vote(Person person) {
        this.person = person;
        this.date = PersianDate.now();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.date);
        hash = 23 * hash + Objects.hashCode(this.person);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Vote other = (Vote) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vote{" + "date=" + date + ", person=" + person + '}';
    }

}
