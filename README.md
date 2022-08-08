![(Lime Logo)](https://raw.githubusercontent.com/zagdrath/storage/master/lime-logo.png)

[![](https://jitpack.io/v/zagdrath/lime.svg)](https://jitpack.io/#zagdrath/lime)
![GitHub](https://img.shields.io/github/license/zagdrath/lime)

### Description
Lime is a Kotlin/Java library that allows for ease of programming for the Limelight Vision camera for FIRST Robotics Competition.

### Usage

<details>
<summary>Groovy Gradle</summary>

1. Add the JitPack repository to your gradle build file.

```gradle
repositories {
	maven { url 'https://jitpack.io' }
}
```

2. Add the dependency to your gradle build file.

```gradle
dependencies {
	implementation 'com.github.zagdrath:lime:v1.0.0'
}
```
</details>

<details>
<summary>Kotlin Gradle</summary>

1. Add the JitPack repository to your gradle build file.

```gradle
repositories {
	maven { url = uri("https://jitpack.io") }
}
```

2. Add the dependency to your gradle build file.

```gradle
dependencies {
	implementation("com.github.zagdrath:lime:v1.0.0")
}
```
</details>

### Licensing
Copyright © 2022 Cody L. Wellman. All rights reserved. This work is licensed under the terms of the MIT license which can be found in the root directory of this project.