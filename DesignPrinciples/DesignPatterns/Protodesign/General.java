package DesignPattern;

public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                ", = "+getPosition() +
                '}';
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("general not supported");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException("generals are unique");
    }
}
