package builderpattern;

public class People {
    private String name;
    private String gender;
    private int age;


    private People(Builder builder){
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public static class Builder{
        protected final String name;
        protected final String gender;
        protected final int age;

        public Builder(String name) {
            this.name = name;
            gender = "M";
            age = 10;
        }

        public People build(){
            return new People(this);
        }
    }


}
