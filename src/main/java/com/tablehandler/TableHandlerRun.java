package com.tablehandler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class TableHandlerRun {
   public static void main(String[] args) throws Exception {
      if(args.length == 0 || args.length > 1) {
          System.err.println("ERROR: Expected a file!");
          System.out.println("\tUsage: java TableHandlerRun <file>");
          System.exit(0);
      }

      File file = new File(args[0]);
      FileInputStream fis = null;

      try {
        fis = new FileInputStream(file);

        // create a CharStream that reads from File:
        ANTLRInputStream input = new ANTLRInputStream(fis);
        // create a lexer that feeds off of input CharStream:
        TableHandlerLexer lexer = new TableHandlerLexer(input);
        // create a buffer of tokens pulled from the lexer:
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer:
        TableHandlerParser parser = new TableHandlerParser(tokens);

        // replace error listener:
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new ErrorHandlingListener());

        // begin parsing at main rule:
        ParseTree tree = parser.main();
        if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
             System.out.println(tree.toStringTree(parser));
            // listeners:
            
            THSemanticCheck semCheck = new THSemanticCheck();
            semCheck.visit(tree);

            if(!ErrorHandling.error()) {
                ParseTreeWalker walker = new ParseTreeWalker();
                Compiler listener0 = new Compiler();
                walker.walk(listener0, tree);
            }
        }
      }
      catch(Exception e){
        e.printStackTrace();
      }
   }
}
