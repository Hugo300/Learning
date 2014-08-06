package com.yougo.firstmod.utility;

import com.yougo.firstmod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {

    public static void log (Level loglevel, Object obj ) {
        FMLLog.log(Reference.NAME, loglevel, String.valueOf(obj));
    }

    public static void all(Object obj) { log(Level.ALL, obj); }

    public static void debug(Object obj) { log(Level.DEBUG, obj); }

    public static void error(Object obj) { log(Level.ERROR, obj); }

    public static void fatal(Object obj) { log(Level.FATAL, obj); }

    public static void info(Object obj) { log(Level.INFO, obj); }

    public static void off(Object obj) { log(Level.OFF, obj); }

    public static void trace(Object obj) { log(Level.TRACE, obj); }

    public static void warn(Object obj) { log(Level.WARN, obj); }
}
