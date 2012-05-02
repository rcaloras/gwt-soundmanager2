package com.chj.gwt.client.soundmanager2;

/**
 * SoundOptions is a wrapper around every option you can pass into SoundManager.
 * Each of these options are set on the SMSound object being created.
 * 
 * @author JMILLER
 * 
 */
public class SoundOptions {

	private SoundOptions() {

	}

	public static Option id(String id) {
		return new Option("id", id);
	}

	public static Option url(String url) {
		return new Option("url", url);
	}

	public static Option autoPlay(boolean auto) {
		return new Option("autoPlay", "" + auto);
	}

	public static Option autoLoad(boolean auto) {
		return new Option("autoLoad", "" + auto);
	}

	public static Option multiShot(boolean multishot) {
		return new Option("multiShot", multishot);
	}

	public static Option pan(int pan) {
		return new Option("pan", pan);
	}

	public static Option volume(int volume) {
		return new Option("volume", volume);
	}

	public static Option whileLoading(Callback callback) {
		return new Option("whileloading", callback);
	}

	public static Option whilePlaying(Callback callback) {
		return new Option("whileplaying", callback);
	}

	public static Option onLoad(Callback callback) {
		return new Option("onload", callback);
	}

	public static Option onPlay(Callback callback) {
		return new Option("onplay", callback);
	}

	public static Option onStop(Callback callback) {
		return new Option("onstop", callback);
	}

	public static Option onFinish(Callback callback) {
		return new Option("onfinish", callback);
	}

	public static Option onBeforeFinishComplete(Callback callback) {
		return new Option("onbeforefinishcomplete", callback);
	}

	public static Option onBeforeFinishTime(Callback callback) {
		return new Option("onBeforeFinishTime", callback);
	}

	public static Option onBeforeFinish(Callback callback) {
		return new Option("onBeforeFinish", callback);
	}

	public static Option onJustBeforeFinish(Callback callback) {
		return new Option("onjustbeforefinish", callback);
	}

	public static Option onJustBeforeFinishTime(Callback callback) {
		return new Option("onjustbeforefinishtime", callback);
	}

	public static Option onID3(Callback callback) {
		return new Option("onid3", callback);
	}
}
