/**
 * Settings for app including URLS and other features. 
 */

package it.radiomusichiamo.app;

public class Settings {
	/********ALL EDITABLE SETTINGS ARE HERE *****/

	//Name of radio station
	private final String radioName = "RadioMusischiamo";

	//URL of the radio stream
	private String radioStreamURL = "http://listen.radionomy.com/RadioMusichiamo1";
	
	//URL of webcam (or YouTube link maybe) 
	private String radioWebcamURL = "http://ustream.com/";

	//URL for the advertising / message banner. For no banner leave blank, i.e: ""
	private String adBannerURL = "http://www.aironair.co.uk/wp-content/uploads/2013/09/App-Banner.png";
	
	//Contact button email address
	private String emailAddress = "diretta@radiomusichiamo.ml";
	
	//Contact button phone number
	private String phoneNumber = "#";

	//Contact button website URL
	private String websiteURL = "http://radiomusichiamo.ml";
	
	//Contact button SMS number
	private int smsNumber = 66777;
	
	//Message to be shown in notification center whilst playing
	private String mainNotificationMessage = "Stai ascoltando RadioMuschiamo";

	//TOAST notification when play button is pressed
	private String playNotificationMessage = "Caricamento in corso...";
	
	//Play store URL (not known until published
	private String playStoreURL = "http://play.google.com/";
	
	//Enable console output for streaming info (Buffering etc) - Disable = false
	private boolean allowConsole = true;
	
	/********END OF EDITABLE SETTINGS**********/
	
	
	
	/********DO NOT EDIT BELOW THIS LINE*******/
	public String getRadioName(){
		return radioName;
	}
	
	public String getRadioStreamURL(){
		return radioStreamURL;
	}
	
	public String getRadioWebcamURL(){
		return radioWebcamURL;
	}
	
	public String getAdBannerURL(){
		return adBannerURL;
	}

	public String getEmailAddress(){
		return emailAddress;
	}
	
	public String getPhoneNumber(){
		String appendPhoneNumber = "tel:"+phoneNumber;
		return appendPhoneNumber;
	}
	
	public String getWebsiteURL(){
		return websiteURL;
	}
	
	public int getSmsNumber(){
		return smsNumber;
	}
	
	public String getMainNotificationMessage(){
		return mainNotificationMessage;
	}
	
	public String getPlayNotificationMessage(){
		return playNotificationMessage;
	}

	public String getPlayStoreURL(){
		return playStoreURL;
	}
	
	public boolean getAllowConsole(){
		return allowConsole;
	}
}



