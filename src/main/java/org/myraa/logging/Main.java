package org.myraa.logging;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessorObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessorObj.log(LogProcessor.ERROR, "Exception occurred");
        logProcessorObj.log(LogProcessor.DEBUG, "Debug logs");
        logProcessorObj.log(LogProcessor.INFO, "Info logs");
    }
}