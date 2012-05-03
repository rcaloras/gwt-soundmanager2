package com.chj.gwt.client.soundmanager2;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * SMSound objects are created everytime SoundManager creates a sound. You can
 * retrieve SMSound objects from SoundManager by calling getSoundById and
 * passing in the id that was passed to SoundManager to create the sound.
 * SMSound is used to collect data on the sound loaded up by SoundManager. To
 * use callbacks on a particular sound use SoundOptions callbacks when creating
 * the sound initially.
 * 
 * @author JMILLER
 * @author RCALORAS
 * 
 */
public class SMSound {

	private JavaScriptObject obj;

	SMSound(JavaScriptObject obj) {
		this.obj = obj;
	}

	public String getSID() {
		return sID();
	}

	private native String sID()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.sID;
	 }-*/;

	public String getURL() {
		return url();
	}

	private native String url()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.url;
	 }-*/;

	/**
	 * Need to abstract out again to make ID3 an actual object
	 * 
	 * @return ID3
	 */
	public ID3 getID3() {
		return new ID3(id3());
	}

	private native JavaScriptObject id3()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.id3;
	 }-*/;

	public int getBytesLoaded() {
		return bytesLoaded();
	}

	private native int bytesLoaded()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.bytesLoaded;
	 }-*/;

	public int getBytesTotal() {
		return bytesTotal();
	}

	private native int bytesTotal()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.bytesTotal;
	 }-*/;

	public int getPosition() {
		try {
			return position() / 1000;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	private native int position()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.position;
	 }-*/;

	public int getDuration() {
		try {
			return duration() / 1000;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	private native int duration()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.duration;
	 }-*/;

	public int getDurationEstimate() {
		try {
			int estimate = durationEstimate();
			if(estimate == -1){
				return estimate;
			}
			else{
				return durationEstimate() / 1000;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	/*
	 * Use check due to this error:
	 * Something other than an int was returned from JSNI method 
	 * '@com.chj.gwt.client.soundmanager2.SMSound::durationEstimate()': 
	 * JS value of type null, expected int.
	 */
	private native int durationEstimate()/*-{
	 var test = this.@com.chj.gwt.client.soundmanager2.SMSound::obj.durationEstimate;
	 if(test != null){
	 	return test;
	 }
	 else{
	 	return -1;
	 	}
	 
	 }-*/;

	public boolean getLoaded() {
		return loaded();
	}

	private native boolean loaded()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.loaded;
	 }-*/;

	/**
	 * Numeric value indicating the current playing state of the sound.
	 * 
	 * Note that a 1 may not always guarantee that sound is being heard, given buffering and autoPlay status.
	 * @return 0 for stopped/uninitialised, 1 for playing or buffering sound.
	 */
	public int getPlayState() {
		return playState();
	}

	/**
	 * 0 = stopped/uninitialised
	 * 
	 * 1 = playing or buffering sound (play has been called, waiting for data
	 * etc.)
	 * 
	 * @return play state
	 */
	private native int playState()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.playState;
	 }-*/;

	public int getReadyState() {
		return readyState();
	}

	/**
	 * 0 = uninitialised
	 * 
	 * 1 = loading
	 * 
	 * 2 = failed/error
	 * 
	 * 3 = loaded/success
	 * 
	 * @return ready state
	 */
	private native int readyState()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.readyState;
	 }-*/;

	public boolean getDidBeforeFinish() {
		return didBeforeFinish();
	}

	private native boolean didBeforeFinish()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.didBeforeFinish;
	 }-*/;

	public boolean getDidJustBeforeFinish() {
		return didJustBeforeFinish();
	}

	private native boolean didJustBeforeFinish()/*-{
	 return this.@com.chj.gwt.client.soundmanager2.SMSound::obj.didJustBeforeFinish;
	 }-*/;
}
