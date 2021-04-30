package com.tablehandler;

import static java.lang.System.*;
import java.io.PrintStream;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Error handling module for uniform error handling within ANTLR4
 *
 */
public class ErrorHandling
{
   /**
    * Log a new line.
    */
   public static void newLine()
   {
      logFile.println();
      logFile.flush();
   }

   /**
    * Log a new message.
    *
    * text != null && text.length() > 0
    *
    * text message
    */
   public static void printInfo(String text)
   {
      assert text != null && text.length() > 0;

      printMessage(text, 1);
   }

   /**
    * Log a new warning.
    *
    * text != null && text.length() > 0
    *
    * text message
    */
   public static void printWarning(String text)
   {
      assert text != null && text.length() > 0;

      warningCount++;
      printMessage(text, 2);
   }

   /**
    * Log a new error.
    *
    * text != null && text.length() > 0
    *
    * text message
    */
   public static void printError(String text)
   {
      assert text != null && text.length() > 0;

      errorCount++;
      printMessage(text, 3);
   }

   /**
    * Log a new message.
    *
    * line > 0
    * text != null && text.length() > 0
    *
    * line line number
    * text message
    */
   public static void printInfo(int line, String text)
   {
      assert line > 0;
      assert text != null && text.length() > 0;

      printMessage(line, text, 1);
   }

   /**
    * Log a new warning.
    *
    * line > 0
    * text != null && text.length() > 0
    *
    * line line number
    * text message
    */
   public static void printWarning(int line, String text)
   {
      assert line > 0;
      assert text != null && text.length() > 0;

      warningCount++;
      printMessage(line, text, 2);
   }

   /**
    * Log a new error.
    *
    * line > 0
    * text != null && text.length() > 0
    *
    * line line number
    * text message
    */
   public static void printError(int line, String text)
   {
      assert line > 0;
      assert text != null && text.length() > 0;

      errorCount++;
      printMessage(line, text, 3);
   }

   /**
    * Log a new message.
    *
    * ctx != null
    * text != null && text.length() > 0
    *
    * ctx parser tree node reference
    * text message
    */
   public static void printInfo(ParserRuleContext ctx, String text)
   {
      assert ctx != null;
      assert text != null && text.length() > 0;

      printMessage(ctx, text, 1);
   }

   /**
    * Log a new warning.
    *
    * ctx != null
    * text != null && text.length() > 0
    *
    * ctx parser tree node reference
    * text message
    */
   public static void printWarning(ParserRuleContext ctx, String text)
   {
      assert ctx != null;
      assert text != null && text.length() > 0;

      warningCount++;
      printMessage(ctx, text, 2);
   }

   /**
    * Log a new error.
    *
    * ctx != null
    * text != null && text.length() > 0
    *
    * parser tree node reference
    * text message
    */
   public static void printError(ParserRuleContext ctx, String text)
   {
      assert ctx != null;
      assert text != null && text.length() > 0;

      errorCount++;
      printMessage(ctx, text, 3);
   }

   /**
    * Register a new error.
    *
    */
   public static void registerError() {
      errorCount++;
   }

   /**
    * Exists at least one error?
    *
    * boolean -- true, in the presence of a registered error
    */
   public static boolean error()
   {
      return errorCount > 0;
   }

   /**
    * Number of registered errors.
    *
    * int -- number of errors
    */
   public static int errorCount()
   {
      return errorCount;
   }

   /**
    * Number of registered warnings.
    *
    * int -- number of warnings
    */
   public static int warningCount()
   {
      return warningCount;
   }

   /**
    * Redirect log to a new stream file
    *
    * logFile != null
    *
    * logFile stream
    */
   public static void redirectLogFile(PrintStream logFile)
   {
      assert logFile != null;

      ErrorHandling.logFile = logFile;
   }

   /**
    * Reset register of all errors and warnings.
    */
   public static void reset()
   {
      errorCount = 0;
      warningCount = 0;
   }

   public static final String RED="\033[0;31m";
   public static final String GREEN="\033[0;32m";
   public static final String YELLOW="\033[0;33m";
   public static final String BLUE="\033[0;34m";
   public static final String BOLD="\033[1;38m";
   public static final String RESET="\033[0m";

   /*
    * 1: info
    * 2: warning
    * 3: error
    */
   protected static final String[] prefixMsg = {"INFO", "WARNING", "ERROR"};
   protected static final String[] prefixFormat = {BLUE, YELLOW, RED};

   protected static void printMessage(String text, int type)
   {
      logFile.printf("[%s%s%s] %s\n", prefixFormat[type-1], prefixMsg[type-1], RESET, text);
      logFile.flush();
   }

   protected static void printMessage(int line, String text, int type)
   {
      logFile.printf("[%s%s%s at line %d] %s\n", prefixFormat[type-1], prefixMsg[type-1], RESET, line, text);
      logFile.flush();
   }
   protected static void printMessage(ParserRuleContext ctx, String text, int type)
   {
      printMessage(ctx.getStart().getLine(), text, type);
   }

   protected static PrintStream logFile = out; // default
   protected static int errorCount = 0;
   protected static int warningCount = 0;
}

