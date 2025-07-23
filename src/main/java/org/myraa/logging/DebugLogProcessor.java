package org.myraa.logging;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("ERROR: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}
