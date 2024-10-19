package functionalInterface;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

class OndemandExecution {
    final String name;
    private final LocalDate dateOfBirth;
    private final Supplier<LocalDate> currentDate;

    // Used by regular production code
    OndemandExecution(String name, LocalDate dateOfBirth) {
        this(name, dateOfBirth, ()-> LocalDate.now());
    }

    // Visible for test
    OndemandExecution(String name, LocalDate dateOfBirth, Supplier<LocalDate> currentDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.currentDate = currentDate;
    }

    long getAge() {
        return ChronoUnit.SECONDS.between(dateOfBirth, currentDate.get());
    }

    public static void main(String... args) throws InterruptedException {
        // current date 2016-02-11
        OndemandExecution person = new OndemandExecution("John Doe", LocalDate.parse("2010-02-12"));
        printAge(person);
        TimeUnit.MILLISECONDS.sleep(1000*1);
        printAge(person);
    }

    private static void printAge(OndemandExecution person) {
        System.out.println(person.name + " is " + person.getAge());
    }
}