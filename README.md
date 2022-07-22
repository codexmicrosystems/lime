![(Lime Logo)](https://raw.githubusercontent.com/codexmicrosystems/brand-guidelines/main/logo/lime-logo.png)

### Description
Lime is a Kotlin/Java library that allows for ease of programming for the Limelight Vision camera for FIRST Robotics Competition.

### Usage
<details>
<summary>Groovy</summary>
Step 1, add the JitPack repository to your gradle build file.
<br>
```gradle
repositories {
	maven { url 'https://jitpack.io' }
}
```
<br>
Step 2, add the dependency to your gradle build file.
<br>
```gradle
dependencies {
	implementation 'com.github.codexmicrosystems:lime:main-SNAPSHOT'
}
```
</details>

<details>
<summary>Kotlin</summary>
Step 1, add the JitPack repository to your gradle build file.
<br>
```gradle
repositories {
	maven { url = uri("https://jitpack.io") }
}
```
<br>
Step 2, add the dependency to your gradle build file.
<br>
```gradle
dependencies {
	implementation("com.github.codexmicrosystems:lime:main-SNAPSHOT")
}
```
</details>

### Licensing
Copyright © 2022 Codex Microsystems. All rights reserved. This work is licensed under the terms of the MIT license which can be found in the root directory of this project.