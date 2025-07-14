# 1. public Modifier

**Accessible everywhere** (same package, other packages, subclasses, non-subclasses)

**Visual:** 🌍 Think "public park" — everyone can visit, even from out of town

## Example

```java
// File: animals/Lion.java
package animals;

public class Lion {
    public void roar() {
        System.out.println("Lion roars!");
    }
}
```

### a) Same package access

```java
// File: animals/Safari.java
package animals;

public class Safari {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.roar();
    }
}
```

### b) Other package - subclass access

```java
// File: creatures/AfricanLion.java
package creatures;
import animals.Lion;

public class AfricanLion extends Lion {
    public void demo() {
        roar(); // can access other package
    }
}
```

### c) Other package - non-subclass access

```java
// File: zoo/Show.java
package zoo;
import animals.Lion;

public class Show {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.roar(); // can access other package
    }
}
```

# 2. protected Modifier

**Accessible in:**

- Same package (any class)
- Subclasses in any package
- **Not accessible** in a non-subclass in a different package

**Visual:** 🏠 Family & neighbors in your city only, no outsiders if they move out.

## Example

```java
// File: animals/Tiger.java
package animals;

public class Tiger {
    protected void growl() {
        System.out.println("Tiger growls!");
    }
}
```

### a) Same package access

```java
// File: animals/Wildlife.java
package animals;

public class Wildlife {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.growl(); // can access same package
    }
}
```

### b) Other package - subclass access

```java
// File: jungle/BengalTiger.java
package jungle;
import animals.Tiger;

public class BengalTiger extends Tiger {
    public void demo() {
        growl(); // can access from other package
    }
}
```

### c) Other package - non-subclass access

```java
// File: safari/WildShow.java
package safari;
import animals.Tiger;

public class WildShow {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        // t.growl(); // error: not accessible, not same package
    }
}
```

# 3. default (Package-Private) Modifier

**Accessible in:**

- Same package (any class)
- **Not accessible in other packages, even by a subclass**

**Visual:** 🏠 Only people living in your house (package) can visit.

## Example

```java
// File: plants/Rose.java
package plants;

class Rose {
    void smell() {
        System.out.println("Smells good!");
    }
}
```

### a) Same package access

```java
// File: plants/Garden.java
package plants;

public class Garden {
    public static void main(String[] args) {
        Rose r = new Rose();
        r.smell(); // can access same package
    }
}
```

### b) Other package - subclass access

```java
// File: garden/FancyRose.java
package garden;
import plants.Rose;

public class FancyRose extends Rose {
    public void demo() {
        // smell(); // error: different package, even if subclass
    }
}
```

### c) Other package - non-subclass access

```java
// File: garden/Viewer.java
package garden;
import plants.Rose;

public class Viewer {
    public static void main(String[] args) {
        // Rose r = new Rose(); // error: not same class or all from another package
    }
}
```

# 4. private Modifier

**Accessible in:**

- Only in the class itself

**Visual:** 🚪 Only you can enter your bedroom (class).

## Example

```java
// File: hardware/Computer.java
package hardware;

public class Computer {
    private void boot() {
        System.out.println("Computer boots up!");
    }
    public void show() {
        boot(); // can access
    }
}
```

### a) Same package access

```java
// File: hardware/Lab.java
package hardware;

public class Lab {
    public static void main(String[] args) {
        Computer c = new Computer();
        // c.boot(); // error: boot() is private
        c.show(); // can call show which is public
    }
}
```

### b) Other package - subclass access

```java
// File: lab/Laptop.java
package lab;
import hardware.Computer;

public class Laptop extends Computer {
    public void demo() {
        // boot(); // error: boot() is private to Computer, not visible
    }
}
```

## 📊 Summary Table (with Codes)

| Modifier  | Same package | Other package subclass | Other package non-subclass |
| --------- | ------------ | ---------------------- | -------------------------- |
| public    | ✅           | ✅                     | ✅                         |
| protected | ✅           | ✅                     | ❌                         |
| default   | ✅           | ❌                     | ❌                         |
| private   | ❌           | ❌                     | ❌                         |
