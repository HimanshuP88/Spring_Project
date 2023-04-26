public class sample{
    public static list<Person> createPeople(){
        return arrays.asList(
                new Person("sara",Gender.FEMALE, 20),
                new Person("sara",Gender.FEMALE, 22),
                new Person("bob",Gender.MALE, 20),
                new Person("paula",Gender.FEMALE, 32),
                new Person("paul",Gender.MALE, 2),
                new Person("jack",Gender.MALE, 72)
                ,

        );
    }
    public static void main(String args[]){
        List<Person> people = createPeople();
    }
}