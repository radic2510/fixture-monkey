---
title: "Requirements"
images: []
menu:
docs:
  parent: "get-started"
  identifier: "requirements"
weight: 10
---

## Prerequisites
* Java 8 or higher
* JUnit 5 platform
* jqwik 1.3.9

--------

## Dependencies
| Dependency | Description |
|--|--|
| fixture-monkey | Core library |
| fixture-monkey-starter | Starter dependency for fixture monkey |
| fixture-monkey-kotlin | Kotlin support |
| fixture-monkey-starter-kotlin | Starter dependency for fixture monkey kotlin |

**fixture-monkey-starter** is a starter dependency that comes with pre-configured dependencies required to use fixture monkey.

For Kotlin environments, you can use **fixture-monkey-starter-kotlin**

#### Gradle
```groovy
testImplementation("com.navercorp.fixturemonkey:fixture-monkey-starter:0.6.2")
```

#### Maven
```xml
<dependency>
  <groupId>com.navercorp.fixturemonkey</groupId>
  <artifactId>fixture-monkey-starter</artifactId>
  <version>0.6.2</version>
  <scope>test</scope>
</dependency>
```

--------

## Third party library support
| Dependency | Description |
|--|--|
| fixture-monkey-jackson | Jackson support |
| fixture-monkey-jakarta-validation | Jakarta validation support |
| fixture-monkey-javax-validation | Javax validation support |
| fixture-monkey-mockito | Mockito support |
| fixture-monkey-autoparams | Autoparams support |