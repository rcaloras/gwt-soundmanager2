package com.chj.gwt.client.soundmanager2;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ID3 class wraps the ID3 properties that Flash can interpret within a MP3
 * file. There maybe more ID3 tags that will or won't work.
 * 
 * @author JMILLER
 * 
 */
public class ID3 {

	private V1 v1 = new V1();

	private V2 v2 = new V2();

	public class V1 {
		public String getComment() {
			return getProperty("COMM");
		}

		public String getAlbum() {
			return getProperty("TALB");
		}

		public String getGenre() {
			return getProperty("TCON");
		}

		public String getSongName() {
			return getProperty("TIT2");
		}

		public String getArtist() {
			return getProperty("TPE1");
		}

		public String getTrack() {
			return getProperty("TRCK");
		}

		public String getYear() {
			return getProperty("TYER");
		}
	}

	public class V2 {
		public String getFileType() {
			return getProperty("TLFT");
		}

		public String getTime() {
			return getProperty("TIME");
		}

		public String getContentGroupDescription() {
			return getProperty("TIT1");
		}

		public String getTitleSongNameContentDescription() {
			return getProperty("TIT2");
		}

		public String getSubtitleDescriptionRefinement() {
			return getProperty("TIT3");
		}

		public String getInitialKey() {
			return getProperty("TKEY");
		}

		public String getLanguages() {
			return getProperty("TLAN");
		}

		public String getLength() {
			return getProperty("TLEN");
		}

		public String getMediaType() {
			return getProperty("TMED");
		}

		public String getOriginalAlbumMovieShowTitle() {
			return getProperty("TOAL");
		}

		public String getOriginalFileName() {
			return getProperty("TOFN");
		}

		public String getOriginalLyricistTextWriter() {
			return getProperty("TOLY");
		}

		public String getOriginalArtistPerformer() {
			return getProperty("TOPE");
		}

		public String getOriginalReleaseYear() {
			return getProperty("TORY");
		}

		public String getFileOwnerLicensee() {
			return getProperty("TOWN");
		}

		public String getLeadPerformersSoloist() {
			return getProperty("TPE1");
		}

		public String getBandOrchestraAccompaniment() {
			return getProperty("TPE2");
		}

		public String getConductorPerformerRefinement() {
			return getProperty("TPE3");
		}

		public String getInterpretedRemixedOrOtherwiseModified() {
			return getProperty("TPE4");
		}

		public String getPartOfSet() {
			return getProperty("TPOS");
		}

		public String getPublisher() {
			return getProperty("TPUB");
		}

		public String getTrackNumberPositionInSet() {
			return getProperty("TRCK");
		}

		public String getRecordingdates() {
			return getProperty("TRDA");
		}

		public String getInternetRadioStationName() {
			return getProperty("TRSN");
		}

		public String getSize() {
			return getProperty("TSIZ");
		}

		public String getISRC() {
			return getProperty("TSRC");
		}

		public String getSoftwareHardwareAndSettingsUsedForEncoding() {
			return getProperty("TSSE");
		}

		public String getYear() {
			return getProperty("TYER");
		}

		public String getURLLinkFrame() {
			return getProperty("WXXX");
		}
	}

	private JavaScriptObject obj;

	ID3(JavaScriptObject obj) {
		this.obj = obj;
	}

	public V1 getV1() {
		return v1;
	}

	public V2 getV2() {
		return v2;
	}

	private String getProperty(String property) {
		try {
			return property(property);
		} catch (Exception e) {
			return "Not Found";
		}
	}

	private native String property(String prop)/*-{
	 return this.@com.chj.gwt.client.soundmanager2.ID3::obj[prop];
	 }-*/;
}
