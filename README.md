# Some news about Java - 16 to 20

#### [Referencies - Java 20 | What’s new in JDK 20?](https://www.youtube.com/watch?v=r-BoIi2RnMo)

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