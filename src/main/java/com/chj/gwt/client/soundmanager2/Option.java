package com.chj.gwt.client.soundmanager2;

/*
 * Copyright 2006 Robert Hanson <iamroberthanson AT gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Lifted from gwt-widgets-library.  It's a good implementation, what can I say.
 */

/**
 * <p>
 * Effect options parametrise a scriptaculous effect, for available effects and
 * options please consult the <a
 * href="http://wiki.script.aculo.us/scriptaculous/tags/effects">scriptaculous
 * wiki</a>.
 * </p>
 * 
 * @author rhanson
 * @author george georgovassilis
 * 
 */
public class Option {
	private String name;

	private Object value;

	public Option(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public Option(String name, double value) {
		this.name = name;
		this.value = Double.toString(value);
	}
	
	public Option(String name, boolean value) {
		this.name = name;
		this.value = Boolean.toString(value);
	}
	
	public Option(String name, int value) {
		this.name = name;
		this.value = Integer.toString(value);
	}
	
	public Option(String name, float value) {
		this.name = name;
		this.value = Float.toString(value);
	}

	public Option(String name, Callback callback) {
		this.name = name;
		this.value = callback;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

}
