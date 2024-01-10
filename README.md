# Some news about Java - 16 to 20

#### [Referencies - Java 20 | What’s new in JDK 20?](https://www.youtube.com/watch?v=r-BoIi2RnMo)

##### [I'm here](https://youtu.be/r-BoIi2RnMo?t=673)

---

## Java 16

- ### Instance Of
- Instead of use this
```javascript
     @Deprecated
    public void oldInstanceOf(Object obj) {
        if (obj instanceof String) {
            String value = (String) obj;
            System.out.println("\nThe value " + value + "is a String");
        } else {
            System.out.println("\nThe value " + obj.toString() + "isn`t a String");
        }
    }
```
- Use like this
```javascript
    public void newInstanceOf(Object obj) {
        if (obj instanceof String value) {
            System.out.println("\nThe value " + value + "is a String");
        } else {
            System.out.println("\nThe value " + obj.toString() + "isn`t a String");
        }
    }
```
---

- ### Records
- Instead of use this
```javascript
@Data
@Builder
public class PersonClass {
    private final String name;
}
```
```javascript
    personClass oldPersonDto = PersonClass.builder().name("angelo 1.0").build();
    System.out.println("\nThis is an old Person NAME: " + oldPersonDto.getName());
```
- Use like this
```javascript
public record PersonRecord(String name) {
}
```
```javascript
    var newPerson = new PersonRecord("angelo 2.0");
    System.out.println("\nThis is  a new Person NAME: " + newPerson.name());
```
---

- ### [Virtual Threads](https://www.youtube.com/watch?v=6zr4h7a7ALA)

```javascript
Instant start = Instant.now();
virtualThread.execute(1000, Executors.newVirtualThreadPerTaskExecutor());
Instant end = Instant.now();
System.out.printf("\n Finished with %d", ChronoUnit.SECONDS.between(start, end));
```

```javascript
public class VirtualThread {

    private final AtomicInteger count = new AtomicInteger(0);

    public void execute(int taskQuantity, ExecutorService executorService) throws InterruptedException {
        for (int x = 0; x < taskQuantity; x++) {
            executorService.execute(createTask());
        }
        executorService.shutdown();
        executorService.awaitTermination(180, TimeUnit.MINUTES);
    }

    private Runnable createTask() {
        long id = count.incrementAndGet();
        long timeout = (long) (Math.random() * 1000 + 100);
        return () -> {
            try {
                System.out.printf("\nTask %d is executing - %s", id, timeout);
                Thread.sleep(timeout);
                System.out.printf("Task %d finished \n", id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
```

---
