package com.chj.gwt.client.soundmanager2;

import com.google.gwt.core.client.JavaScriptObject;

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
 * Code lifted from gwt-widgets-library, good implementation.  I wrapped 
 * it in a utility helper class to make it a little bit more portable.
 */
public class OptionUtility {
	public static JavaScriptObject buildOptions(Option[] opts) {
		JavaScriptObject jso = createJsObject();
		for (int i = 0; i < opts.length; i++) {
			Object value = opts[i].getValue();
			if (value instanceof Callback)
				addCallback(jso, opts[i].getName(), (Callback) value);
			else
				addOption(jso, opts[i].getName(), (String) value);
		}
		return jso;
	}

	private static native void addCallback(JavaScriptObject jso, String name,
			Callback callback) /*-{
	 jso[name] = function()
	 {
	 callback.@com.chj.gwt.client.soundmanager2.Callback::execute()();
	 };
	 }-*/;

	private static native void addOption(JavaScriptObject jso, String name,
			String value) /*-{
	 jso[name] = value;
	 }-*/;

	private static native JavaScriptObject createJsObject() /*-{
	 return new Object();
	 }-*/;
}
