package builder;

public abstract class Builder {

    public abstract Builder buildBorad(String borad);

    public abstract Builder buildDisplay(String display);

    public abstract Builder buildOS();

    public abstract Computer create();

}
