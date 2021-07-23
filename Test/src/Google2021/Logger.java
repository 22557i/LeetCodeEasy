package Google2021;

import java.util.HashMap;

public class Logger {
    /** Initialize your data structure here. */
    HashMap<String,Integer> map = new HashMap<>();
    public Logger() {

    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!this.map.containsKey(message)){
            this.map.put(message, timestamp);
            return true;
        }

        int old = this.map.get(message);

        if(timestamp - old >=10){
            this.map.put(message, timestamp);
            return true;
        }else return false;
    }
}
