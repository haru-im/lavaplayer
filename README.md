# LavaPlayer
[![image](https://img.shields.io/jitpack/v/github/haru-im/lavaplayer?style=flat-square)](https://github.com/haru-im/lavaplayer/releases)
[![image](https://img.shields.io/github/license/haru-im/lavaplayer?style=flat-square)](https://github.com/haru-im/lavaplayer/blob/master/LICENSE)

This is modified lavaplayer, I merge PRs that are useful but not merged in [sedmelluq's branch](https://github.com/sedmelluq/lavaplayer).
## Usage
Gradle
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'im.haru:lavaplayer:1.0'
}
```
Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>im.haru</groupId>
        <artifactId>lavaplayer</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```
