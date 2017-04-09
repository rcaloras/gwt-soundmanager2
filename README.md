

# GWT-SoundManager2
GWT-SoundManager2 is a wrapper for the SoundManager2 library to allow easy use with GWT (Google Web Toolkit). 

Its aim is to take a proven, well supported, and mature solution for playing audio (SoundManager2) in the browser  and provide a robust, updated, and easy to use GWT interface. Ideally, it's the quickest way to add audio to your GWT application!

## Why another SoundManager2 wrapper for GWT?
After reviewing other wrappers and audio libraries such as: 
[gwt-sound](http://code.google.com/p/gwt-sound/) [gwt-sm](http://code.google.com/p/gwtsm/) [gwt-voice](http://code.google.com/p/gwt-voices/)  
It looked like the state of audio in GWT applications was being neglected and not supported. Most of the aforementioned libraries are either dated, not supported, or don't provide the full range of functionality that is capable with SoundManager2.

This wrapper was created as a fork of gwt-sound, originally written by Jeffery Miller. It's now based on GWT 2.4 and the latest version of SoundManager2 (Which now has killer support for all kinds of browsers. Horray for Android and Iphone!) It was developed for, and currently being used by, [Coolhandjuke](http://www.coolhandjuke.com).

Follow us on [Twitter](http://www.twitter.com/coolhandjuke)! Any issues or questions are more than welcome.
## Working Example
There's also a small example project [Gwt-SoundManager2 Example](https://github.com/rcaloras/gwt-soundmanager2-example).

# Quick Start using GWT-SoundManager2
##Add it to your project

Reference the jar file in your classpath. The latest release .jar can be found here [gwt-soundmanager2-0.1.4.jar](http://bit.ly/1iDAxoL), in the [Downloads](https://github.com/rcaloras/gwt-soundmanager2/downloads) tab, or in the [Maven-Repo](https://github.com/rcaloras/rcaloras-mvn-repo/tree/master/releases/com/chj/gwt-soundmanager2). Snapshots can be found in the [Maven-Sanpshot-Repo](https://github.com/rcaloras/rcaloras-mvn-repo/tree/master/snapshots/com/chj/gwt-soundmanager2).
### If you're using maven
#### Add the repository
```xml
<repositories>
     <repository>
        <id>gwt-soundmanager2-releases</id>
        <url>https://raw.github.com/rcaloras/rcaloras-mvn-repo/master/releases</url>
    </repository>
</repositories>
```
...add the dependency to your pom.xml.   
```xml
      <dependency>
         <groupId>com.chj</groupId>
         <artifactId>gwt-soundmanager2</artifactId>
         <version>0.1.4</version>
      </dependency>
```

### Inherit it in your gwt.xml
```xml
 <inherits name="GwtSoundManager2"/>
```


## Use it to make some noise!
```java
   final String SOUND_ID = 'soundID';
   final SoundManager sm = SoundManager.quickStart();
   //Play our sound once SoundManager2 has loaded
   sm.onReady(new com.chj.gwt.client.soundmanager2.Callback(){
   
       public void execute() {
	sm.play(SOUND_ID,"/path/to/some/.mp3");
      }
   });
```

### Need to configure SoundManager2?
Obtain an SM2 instance, configure it, and then beginDelayedInit.
```java
  SoundManager soundManager = SoundManager.getInstance();
  soundManager.setUseHtml5Audio(true)
  soundManager.setFlashVersion(9);
  soundManager.setNoSWFCache(true);
  soundManager.setFlashLoadTimeout(1000);
  //SoundManager must be init'd before it can be used.
  soundManager.beginDelayedInit();
```
  
## Official SoundManager2 Documentation
SoundManager2 documentation and resources can be found at [Schillmania](http://www.schillmania.com/projects/soundmanager2/doc/). Much thanks to Scott Schiller for the awesome SoundManager2 project.
http://www.schillmania.com/projects/soundmanager2/
