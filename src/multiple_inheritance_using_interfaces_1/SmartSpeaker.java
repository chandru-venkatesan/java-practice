package multiple_inheritance_using_interfaces_1;

public class SmartSpeaker implements WiFiEnabled,VoiceControl{
    @Override
    public void connectToWiFi(){
        System.out.println( "Smart Speaker Connected to WiFi");
    }
    @Override
    public void activateVoiceCommand() {
        System.out.println("Listening for Voice Command");
    }
}
