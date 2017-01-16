/*
 * 
 * Created by Umberto Ferracci from urania's PC
 * email: umberto.ferracci@gmail.com
 * Project: FleaPark
 * Package: com.fleaPark.utility
 * Type: Message4Debug
 * Last update: 23-giu-2016 22.15.30
 * 
 */
package com.fleaPark.tools.debug;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message4Debug {
    private static int id;
    private static List<String> stack = new ArrayList();

    private static boolean debug = true;

    /**
     * Adds the trace.
     *
     * @param message the message
     */
    public static void addTrace(String message) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        stack.add(timeStamp.toString() + "\t" + message);
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * Gets the stack.
     *
     * @return the stack
     */
    public static List<String> getStack() {
        return stack;
    }

    /**
     * Checks if is debug.
     *
     * @return true, if is debug
     */
    public static boolean isDebug() {
        return debug;
    }

    /**
     * Log.
     *
     * @param message the message
     */
    public static void log(String message) {
        stack.add(message);
        if (debug)
            System.out.println("Message4debug " + (id++) + ":\t" + message);
    }

    /**
     * Prints the stack trace.
     */
    public static void printStackTrace() {
        if (debug) {
            System.out.println("Message4debug Stack:");
            for (String s : stack)
                System.out.println("\t" + s);
        }
    }

    /**
     * Sets the debug.
     *
     * @param debug the new debug
     */
    public static void setDebug(boolean debug) {
        Message4Debug.debug = debug;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public static void setId(int id) {
        Message4Debug.id = id;
    }

    /**
     * Sets the stack.
     *
     * @param stack the new stack
     */
    public static void setStack(List<String> stack) {
        Message4Debug.stack = stack;
    }

}
