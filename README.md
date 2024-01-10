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