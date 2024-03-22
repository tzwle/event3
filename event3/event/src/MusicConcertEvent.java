public class MusicConcertEvent extends event{
    private boolean merchandiseRequired;
    private double merchandiseCost;

    
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants,int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        super(eventID,eventName, eventLocation, eventPointOfContact,eventCost, totalParticipants,totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }
    
    @Override
    public double calculateEventCost(){
        return merchandiseRequired?merchandiseCost*getTotalParticipants()*getTotalEventDays()+getEventCost():getEventCost();
    }
    public String toString() {
      return "Music Concert Event details:"+'\n'+
              "Event ID: "+getEventID()+'\n'+
              "Event Name: "+getEventName()+'\n'+
              "Event Location: "+getEventLocation()+'\n'+
              "Total Participants: "+getTotalParticipants()+'\n'+
              "Total Event Cost:"+calculateEventCost()+'\n';
    }
}
