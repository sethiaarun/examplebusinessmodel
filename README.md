# examplebusinessmodel
This repo contains various business models written in Scala and can be used along with Spark or any other Scala project.

One of the use cases is you can use this repo release along with [Custome DataSource](https://github.com/sethiaarun/customdatasource)

## Installing

### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

```
```xml
<dependency>
    <groupId>com.github.sethiaarun</groupId>
    <artifactId>examplebusinessmodel</artifactId>
    <version>Tag</version>
</dependency>
```

### SBT

```
resolvers += "jitpack" at "https://jitpack.io"
```

```
libraryDependencies += "com.github.sethiaarun" % "examplebusinessmodel" % "Tag"		
```

### Gradle

```json
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

```json
dependencies {
  implementation 'com.github.sethiaarun:examplebusinessmodel:Tag'
}
```
