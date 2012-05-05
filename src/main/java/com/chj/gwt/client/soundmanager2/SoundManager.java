package com.chj.gwt.client.soundmanager2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;

/**
 * SoundManager is created as a singleton and must be retrieved using
 * getInstance(). SoundManager controls all playback functionality including
 * play, stop, resume, pause, setting position and so forth.
 * 
 * DefaultOptions are used to set the default options on every SMSound object
 * created by SoundManager. Any option or callback set under DefaultOptions will
 * be set for every call to play or createSound.
 * 
 * @author JMILLER
 * @author RCALORAS
 * 
 */
public class SoundManager {

	public static SoundManager soundManager;

	public DefaultOptions defaultOptions = new DefaultOptions();
	
	/* Used for storing SMSound IDs that reference SMSounds that have been created */
	ArrayList<String> soundIDs = new ArrayList<String>();
	
	public class DefaultOptions {
		public void autoPlay(boolean auto) {
			setAutoPlay(auto);
		}

		private native void setAutoPlay(boolean auto)/*-{
		 $wnd.soundManager.defaultOptions.autoPlay = auto;
		 }-*/;

		public void autoLoad(boolean auto) {
			setAutoLoad(auto);
		}

		private native void setAutoLoad(boolean auto)/*-{
		 $wnd.soundManager.defaultOptions.autoLoad = auto;
		 }-*/;

		public void multiShot(boolean multishot) {
			setMultiShot(multishot);
		}
		
		private native void isMovieStar(boolean auto)/*-{
		 $wnd.soundManager.defaultOptions.isMovieStar = isMp4;
		 }-*/;
		/**
		 * "MovieStar" MPEG4 audio mode. This is a flash9 feature.
		 * 
		 * Null (default) = auto detect MP4, AAC etc. based on URL.
		 * @param isMp4 true = force on, ignore URL
		 */
		public void setMovieStar(boolean isMp4){
			isMovieStar(isMp4);
		}

		private native void setMultiShot(boolean multishot)/*-{
		 $wnd.soundManager.defaultOptions.multiShot = multishot;
		 }-*/;

		public void pan(int pan) {
			setPan(pan);
		}

		private native void setPan(int pan)/*-{
		 $wnd.soundManager.defaultOptions.pan = pan;
		 }-*/;

		public void volume(int volume) {
			setVolume(volume);
		}

		private native void setVolume(int volume) /*-{
		 $wnd.soundManagerdefaultOptions.volume(volume); 	
		 }-*/;

		public void whileLoading(Callback callback) {
			executeWhileLoading(callback);
		}

		private native boolean executeWhileLoading(Callback callback)/*-{
		 $wnd.soundManager.defaultOptions.whileloading = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void whilePlaying(Callback callback) {
			executeWhilePlaying(callback);
		}

		private native void executeWhilePlaying(Callback callback)/*-{
		 $wnd.soundManager.defaultOptions.whileplaying = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onLoad(Callback callback) {
			executeOnLoad(callback);
		}

		private native void executeOnLoad(Callback callback)/*-{
		 $wnd.soundManager.defaultOptions.onload = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onPlay(Callback callback) {
			executeOnPlay(callback);
		}

		private native void executeOnPlay(Callback callback)/*-{
		 $wnd.soundManager.defaultOptions.onplay = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onStop(Callback callback) {
			executeOnStop(callback);
		}

		private native void executeOnStop(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onstop = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onFinish(Callback callback) {
			executeOnFinish(callback);
		}

		private native void executeOnFinish(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onfinish = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onBeforeFinishComplete(Callback callback) {
			executeOnBeforeFinishComplete(callback);
		}

		private native void executeOnBeforeFinishComplete(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onbeforefinishcomplete = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onBeforeFinishTime(Callback callback) {
			executeOnBeforeFinishTime(callback);
		}

		private native void executeOnBeforeFinishTime(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onbeforefinishtime = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onBeforeFinish(Callback callback) {
			executeOnBeforeFinish(callback);
		}

		private native void executeOnBeforeFinish(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onbeforefinish = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onJustBeforeFinish(Callback callback) {
			executeOnJustBeforeFinish(callback);
		}

		private native void executeOnJustBeforeFinish(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onjustbeforefinish = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onJustBeforeFinishTime(Callback callback) {
			executeOnJustBeforeFinishTime(callback);
		}

		private native void executeOnJustBeforeFinishTime(Callback callback) /*-{
		 $wnd.soundManager.defaultOptions.onjustbeforefinishtime = function() {		
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;

		public void onID3(Callback callback) {
			executeOnID3(callback);
		}

		private native void executeOnID3(Callback callback)/*-{
		 $wnd.soundManager.defaultOptions.onid3 = function() {
		 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
		 }
		 }-*/;
	}

	private SoundManager() {
		soundManager2Constructor();
	}
	
	private static native void soundManager2Constructor() /*-{
    $wnd.soundManager = new $wnd.SoundManager();
    }-*/;
	
	
	private native void delayedInit() /*-{
    $wnd.soundManager.beginDelayedInit(); ; // start SM2 init.
    }-*/;
	
	private native void flashVersion(int version)/*-{
	 $wnd.soundManager.flashVersion = version;
	 }-*/;
	
	/**
	 * Flash build to use (8 or 9.) Some API features require 9.
	 * Default is 8.
	 * @param version
	 */
	public void setFlashVersion(int version){
		if((version ==9) || (version == 8)){
			flashVersion(version);
		}
	}
	
	/**
	 * Begin delayed init of SoundManager. Called to initialize
	 * the SoundManager instance after it's been configured.
	 * @return
	 */
	public void beginDelayedInit(){
		delayedInit();
	}
	
	private native void reboot() /*-{
    $wnd.soundManager.reboot();
}-*/;
	
	/**
	 * Returns a fully instantiated and initialized SoundManager object ready to use.
	 * 
	 * @return Instantiated and initialized SoundManager singleton.
	 */
	public static SoundManager quickStart(){
		if((soundManager != null) && soundManager.isOk()){
			Logger.getLogger(SoundManager.class.getName()).log(Level.WARNING, "SoundManager2 is already started! Returning current instance.");
			return soundManager;
		}
		SoundManager sm = getInstance();
		sm.beginDelayedInit();
		return sm;
	}
	
	/**
	 * Returns a fully instantiated and initialized SoundManager object ready to use.
	 * 
	 * @param swfPath Optional constructor arg, path to swf objects, or null.
	 * @param flashversion The version of flash to use, 8 or 9.
	 * @param debug debug mode enabled.
	 * @return Instantiated and initialized SoundManager singleton.
	 */
	public static SoundManager quickStart(String swfPath, int flashversion, boolean debug){
		if((soundManager != null) && soundManager.isOk()){
			Logger.getLogger(SoundManager.class.getName()).log(Level.WARNING, "SoundManager2 is already started! Returning current instance.");
			return soundManager;
		}
		SoundManager sm = getInstance();
		if(swfPath != null){
			sm.setSoundManagerURL(swfPath);
		}
		sm.setFlashVersion(flashversion);
		sm.setDebugMode(debug);
		sm.beginDelayedInit();
		return sm;
	}
	
	/**
	 * A singleton instance of SoundManager.
	 * smURL defaults to GWT.getModuleBaseURL().
	 * 
	 * If this instance has not been initialized, beginDelayedInit() must be called after configuration
	 * but prior to use.
	 * 
	 * @return SoundManager singleton
	 */
	public static SoundManager getInstance() {
		if (soundManager == null){
			soundManager = new SoundManager();
			soundManager.setSoundManagerURL(GWT.getModuleBaseURL());
		}
		return soundManager;
	}

	public DefaultOptions getDefaultOptions() {
		return defaultOptions;
	}
	
	/**
	 * Msec to wait for flash movie to load before failing (0 = infinity)
	 * @param milliseconds
	 */
	public void setFlashLoadTimeout(int milliseconds) {
		flashLoadTimeout(milliseconds);
	}

	private native void flashLoadTimeout(int milliseconds) /*-{
	 $wnd.soundManager.flashLoadTimeout(milliseconds); 	
	 }-*/;
	
	/**
	 * Path to SWF files. 
	 * @param url
	 */
	public void setSoundManagerURL(String url) {
		soundManagerURL(url);
	}

	private native void soundManagerURL(String url)/*-{
	 $wnd.soundManager.url=url;
	 }-*/;

	/**
	 * enable debugging output (div#soundmanager-debug, OR console..)
	 */
	public void setDebugMode(boolean debug) {
		debugMode(debug);
	}

	private native void debugMode(boolean debug)/*-{
	 $wnd.soundManager.debugMode=debug;
	 }-*/;
	
	/**Returns a boolean indicating whether soundManager has attempted to and succeeded in initialising.
	 * Useful when you want to create or play a sound without knowing SM2's current state.
	 * 
	 * @return false if called before initialisation, true otherwise.
	 */
	public boolean ok() {
		return isOk();
	}

	private native boolean isOk()/*-{
	 return $wnd.soundManager.ok();
	 }-*/;

	/**
	 * use firebug/safari console.log()-type debug console if available
	 */
	public void setUseConsole(boolean console) {
		useConsole(console);
	}

	private native void useConsole(boolean console)/*-{
	 $wnd.soundManager.useConsole=console;
	 }-*/;

	/**
	 * if console is being used, do not create/write to #soundmanager-debug
	 */
	public void setConsoleOnly(boolean only) {
		consoleOnly(only);
	}

	private native void consoleOnly(boolean only)/*-{
	 $wnd.soundManager.consoleOnly=only;
	 }-*/;

	/**
	 * allow flash to poll for status update..
	 */
	public void setAllowPolling(boolean polling) {
		allowPolling(polling);
	}
	
	

	private native void allowPolling(boolean polling)/*-{
	 $wnd.soundManager.allowPolling=polling;
	 }-*/;

	/**
	 * URL of silent/blank MP3 to use when unloading/canceling a loaded/loading
	 * sound
	 */
	public void setNullURL(String url) {
		nullURL(url);
	}

	private native void nullURL(String url)/*-{
	 $wnd.soundManager.nullURL=url;
	 }-*/;
	
	/**
	 * Defaults to true.
	 * 
	 * Use HTML5 Audio() where API is supported (most Safari, Chrome versions), Firefox (no MP3/MP4.) 
	 * Ideally, transparent vs. Flash API where possible.
	 * 
	 * @param useHTML5
	 */
	public void setUseHtml5Audio(boolean useHTML5) {
		useHTML5Audio(useHTML5);
	}

	private native void useHTML5Audio(boolean useHTML5)/*-{
	 $wnd.soundManager.useHTML5Audio = useHTML5;
	 }-*/;
	
	
	/**
	 * Overrides useHTML5audio. Defaults to true. 
	 * 
	 * If true and flash support present, will try to use flash for MP3/MP4 
	 * as needed since HTML5 audio support is still quirky in browsers.
	 * 
	 * @param preferFlash
	 */
	public void setPreferFlash(boolean preferFlash) {
		preferFlash(preferFlash);
	}

	private native void preferFlash(boolean flashPreference)/*-{
	 $wnd.soundManager.preferFlash = flashPreference;
	 }-*/;
	
	/**
	 * If true, appends ?ts={date} to break aggressive SWF caching.
	 * 
	 * @param noCache
	 */
	public void setNoSWFCache(boolean noCache) {
		noSWFCache(noCache);
	}

	private native void noSWFCache(boolean noCache)/*-{
	 $wnd.soundManager.noSWFCache = noCache
	 }-*/;

	/**
	 * Creates a sound using an array of SoundOptions. ID and URL are required
	 * when using this method. If that isn't already implicitly implied.
	 * 
	 * @param opts
	 */
	public void createSound(Option[] opts) {
		try {
			executeCreateSound(OptionUtility.buildOptions(opts));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private native void executeCreateSound(JavaScriptObject obj)/*-{
	 $wnd.soundManager.createSound(obj);
	 }-*/;

	/**
	 * 
	 * @param id
	 *            of the sound to be created.
	 * @param path
	 *            to the sound.
	 */
	public void createSound(String id, String path) {
		executeCreateSound(id, path);
	}

	private native void executeCreateSound(String id, String path)/*-{
	 $wnd.soundManager.createSound(id, path);
	 }-*/;

	/**
	 * destroys any sound created and removed it from SoundManager.
	 * 
	 * @param id
	 *            of the sound to be destroyed
	 */
	public void destroySound(String id) {
		executeDestroySound(id);
	}

	private native void executeDestroySound(String id)/*-{
	 $wnd.soundManager.destroySound(id); 	
	 }-*/;

	/**
	 * Used after a call to createSound. For example you can create a sound,
	 * then wait for it to load before calling this play method.
	 * 
	 * @param id
	 *            of the sound to play.
	 */
	public void play(String id) {
		executePlay(id);
	}

	private native void executePlay(String id) /*-{
	 $wnd.soundManager.play(id, {}); 	
	 }-*/;

	public void play(String id, Option[] opts) {
		executePlay(id, OptionUtility.buildOptions(opts));
	}

	private native void executePlay(String id, JavaScriptObject obj) /*-{
	 $wnd.soundManager.play(id, obj); 	
	 }-*/;

	public void setPosition(String id, int milliseconds) {
		position(id, milliseconds);
	}

	private native void position(String id, int milliseconds) /*-{
	 $wnd.soundManager.setPosition(id, milliseconds); 	
	 }-*/;

	/**
	 * Volume is adjusted from 0-100
	 * 
	 * @param id
	 *            of the sound.
	 * @param volume
	 *            to set.
	 */
	public void setVolume(String id, int volume) {
		volume(id, volume);
	}

	private native void volume(String id, int volume) /*-{
	 $wnd.soundManager.volume(id, volume); 	
	 }-*/;

	/**
	 * Simplest way to play a sound.
	 * 
	 * @param id
	 *            of the sound to play.
	 * @param path
	 *            to the sound.
	 */
	public void play(String id, String path) {
		executePlay(id, path);
	}
	

	private native void executePlay(String id, String path) /*-{
	 $wnd.soundManager.play(id, path); 	
	 }-*/;

	/**
	 * Stop playing sound.
	 * 
	 * @param id
	 *            of the sound to stop playing.
	 */
	public void stop(String id) {
		executeStop(id);
	}

	private native void executeStop(String id)/*-{
	 $wnd.soundManager.stop(id);
	 }-*/;

	/**
	 * Stops all sounds from playing. If you enable multishot and layer sounds
	 * this will stop them all from playing.
	 * 
	 */
	public void stopAll() {
		executeStopAll();
	}

	private native void executeStopAll() /*-{
	 $wnd.soundManager.stopAll(); 	
	 }-*/;

	/**
	 * Stops loading any currently loading sound.
	 * 
	 * @param id
	 *            of the sound to unload.
	 */
	public void unload(String id) {
		executeUnload(id);
	}

	private native void executeUnload(String id)/*-{
	 $wnd.soundManager.unload(id); 	
	 }-*/;

	/**
	 * Pauses the sound if it isn't already paused.
	 * 
	 * @param id
	 *            of the sound to pause.
	 */
	public void pause(String id) {
		executePause(id);
	}

	private native void executePause(String id)/*-{
	 $wnd.soundManager.pause(id);
	 }-*/;

	/**
	 * Resumes the sound if it was paused.
	 * 
	 * @param id
	 *            of the sound to resume.
	 */
	public void resume(String id) {
		executeResume(id);
	}

	private native void executeResume(String id)/*-{
	 $wnd.soundManager.resume(id);
	 }-*/;

	/**
	 * Toggles between pause and resume based on the state of the sound.
	 * 
	 * @param id
	 *            of the sound to toggle.
	 */
	public void togglePause(String id) {
		executeTogglePause(id);
	}

	private native void executeTogglePause(String id)/*-{
	 $wnd.soundManager.togglePause(id);
	 }-*/;

	/**
	 * @param Id of the sound.
	 *           
	 * @return the SMSound of a sound created by SoundManager, null if one doesn't exist.
	 */
	public SMSound getSoundById(String id) {
		if(getSMSound(id) == null){
			return null;
		}
		return new SMSound(getSMSound(id));
	}

	private native JavaScriptObject getSMSound(String id)/*-{
	 return $wnd.soundManager.getSoundById(id);
	 }-*/;

	/**
	 * Load sounds from XML. Only the defaultOptions will be loaded into each
	 * sound. Impossible to explicitly set properties and callbacks on XML
	 * otherwise.
	 * 
	 * @param XMLURL
	 */
	public void loadFromXML(String XMLURL) {
		executeLoadFromXML(XMLURL);
	}

	private native void executeLoadFromXML(String XMLURL) /*-{
	 $wnd.soundManager.loadFromXML(XMLURL); 	
	 }-*/;

	/**
	 * fired when Sound Manager is ready to use.
	 * 
	 * @param callback
	 */
	public void onLoad(Callback callback) {
		executeOnLoad(callback);
	}

	private native void executeOnLoad(Callback callback)/*-{
	 $wnd.soundManager.onload = function() {
	 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
	 }
	 }-*/;

	/**
	 * fired when Sound Manager fails to successfully load or initialize.
	 * 
	 * @param callback
	 */
	public void onError(Callback callback) {
		executeOnError(callback);
	}

	private native void executeOnError(Callback callback) /*-{
	 $wnd.soundManager.onerror = function() {
	 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
	 }
	 }-*/;
	
	/**
	 * Gets the list of currently created sounds.
	 * @return The list of SMSound objects currently created
	 */
	public List<SMSound> getSounds(){
		ArrayList<SMSound> sounds = new ArrayList<SMSound>();
		for(String soundID: getSoundIDs()){
			SMSound found = getSoundById(soundID);
			if(found != null){
				sounds.add(getSoundById(soundID));
			}
		}
		return sounds;
	}
	
	public List<String> getSoundIDs() {
		soundIDs.clear();
		soundIDs();
		return soundIDs;
	}
	
	private native void soundIDs()/*-{
		var ids = $wnd.soundManager.soundIDs;
		for(var i = 0; i < ids.length; i++) {
			this.@com.chj.gwt.client.soundmanager2.SoundManager::addSoundID(Ljava/lang/String;)(ids[i]);
		}
	}-*/;
	
	private void addSoundID(String id) {
		soundIDs.add(id);
	}
}
