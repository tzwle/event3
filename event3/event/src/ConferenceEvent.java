public class ConferenceEvent extends event {  
    private boolean breakfastRequired;  
    private double breakfastCost;  
    private boolean lunchRequired;  
    private double lunchCost;  
    private boolean dinnerRequired;  
    private double dinnerCost;  
  
     
    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,  
                           double eventCost, int totalParticipants, int totalEventDays,  
                               boolean breakfastRequired, double breakfastCost,  
                               boolean lunchRequired, double lunchCost,  
                               boolean dinnerRequired, double dinnerCost) {  
        super(eventPointOfContact, eventPointOfContact, eventPointOfContact, eventPointOfContact, dinnerCost, totalEventDays, totalEventDays);  
        this.breakfastRequired = breakfastRequired;  
        this.breakfastCost = breakfastCost;  
        this.lunchRequired = lunchRequired;  
        this.lunchCost = lunchCost;  
        this.dinnerRequired = dinnerRequired;  
        this.dinnerCost = dinnerCost;  
    }  
  
    
    @Override
    public double calculateEventCost(){
         return  ((breakfastRequired?breakfastCost:0)+(lunchRequired?lunchCost:0)+(dinnerRequired?dinnerCost:0))*getTotalParticipants()*getTotalEventDays()+getEventCost();
    }
    public String toString() {
        return "Conference Event details:"+'\n'+
                "Event ID: "+getEventID()+'\n'+
                "Event Name: "+getEventName()+'\n'+
                "Event Location: "+getEventLocation()+'\n'+
                "Total Participants: "+getTotalParticipants()+'\n'+
                "Total Event Cost:"+calculateEventCost()+'\n';
    }
}

