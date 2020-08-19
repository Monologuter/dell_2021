package dell.Day13.Test03;

import java.util.Objects;

public class Pander {
    private  double weight;
    private  char sex;

    public Pander() {
    }

    public Pander(double weight, char sex) {
        this.weight = weight;
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pander)) return false;
        Pander pander = (Pander) o;
        return Double.compare(pander.getWeight(), getWeight()) == 0 &&
                getSex() == pander.getSex();
    }
}

