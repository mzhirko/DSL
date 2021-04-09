import java.io.*;
import java.util.*;
import java.util.stream.*;

import java.lang.System.*;


/**
* Table Class
* Class that implements a Table and its manipulative operations,
* for columns, rows or even the entire table.
*
*/

public class Table
{
    /**  
    * The actual table
    */
    private List<List<String>> table;

    /**
    * Creates a Table from a path to a CSV file.
    *
    * path absolute_path_to_the_CSV_file
    */
    public Table(String path){
        this.table = readCSV(path);
    }

    /**
    * Creates a Table from an existing Table (object) 
    *
    * other existing_table
    */
    public Table(Table other)
    {
        this.table = other.table;
    }

    /**
    * Creates a Table from an existing List
    *
    * table table(list)
    */
    public Table(List<List<String>> table)
    {
        this.table = table;
    }
    
    /**
    * Main func
    * Used for functionality testing.
    *
    * args Argument sequence when executing the file 
    */
    public static void main(String[] args){
        /*Table tbl = new Table("~/temp/eziql/examples/example.csv");
        System.out.println(tbl.table.toString());
        
        System.out.println("\n(Add row 1 to the end)");
        tbl.addRow(tbl.getRow(1));
        
        System.out.println("\nLast row: \n" + tbl.getRow(tbl.numRows()-1));

        printTable(tbl);

        System.out.println("\n(Add cloumn 1 to the table)");
        tbl.addCol(tbl.getColumn(1, false));

        System.out.println("\n(Table tbl)");
        printTable(tbl);

        Table t2 = new Table(tbl);
        t2.addCol(tbl.getColumn(3, true));
        t2.removeRow(2);
        t2.removeCol(0);
        t2.removeCol(1);

        System.out.println("\n(Table t2)");
        printTable(t2);

        System.out.println("\n(Table t2 + tbl)");
        printTable(t2.addTable(tbl));*/

        /*Table t1 = new Table("~/temp/eziql/examples/csv1.csv");
        Table t2 = new Table("~/temp/eziql/examples/csv2.csv");
        
        System.out.println("\n(Table t1)");
        t1.printTable();

        System.out.println("\n(Table t2)");
        t2.printTable();
    
        List<String> col = t1.getColumn(0, true);
        

        Table t3;
        System.out.println("\n(Table t2 - t1)");
        t3 = t2.subTable(t2);
        t3.printTable();

        System.out.println("\n(Table t2 == t2)");
        System.out.println(t2.isEqual(t2));

        System.out.println("\n(Maximum of column 0 and column 1)");
        System.out.println(t1.max(t1.getColumn(0, true)));

        System.out.println("\n(Minimum of column 0 and column 1)");
        System.out.println(t1.min(t1.getColumn(0, true)));

        System.out.println("\n(Sum of column 0 and 1)");
        System.out.println(t1.sum(t1.getColumn(0, false)));

        System.out.println("\n(Average of column 0 and 1)");
        System.out.println(t1.avg(t1.getColumn(0, false)));

        Table tAux = new Table(t1);

        System.out.println("\nTable t1 ascending sort");
        t1.sort();
        t1.printTable();

        System.out.println("\nTable t1 descending sort");
        tAux.sortDesc();
        tAux.printTable();*/
    }

    /**
    * Function that will parse the given file as an argument.
    *
    * Precondition:
    * path != null
    *
    *
    * path Absolute path to the CSV file
    * List<List<String>> List with data taken from the file
    */
    public List<List<String>> readCSV(String path)
    {
        assert path != null;

        List<List<String>> table = new ArrayList<List<String>>();
        List<String> row = new ArrayList<String>();
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while((line = br.readLine()) != null){
                // PARSING
                String[] tmp = line.split(",");
                row = Arrays.asList(tmp);
                table.add(row);
            }
        }
        catch (IOException e){
            System.err.println("ERROR: Unable to read the file you provided (maybe doesn't exist):\n" + path);
            System.exit(0);
        }
        return table;
    }

    /**
    * Change a specific value in the table
    *
    * Precondition:
    *   row >= 0 && row < numRows()
    *   col >= 0 && col < numColumns()
    * 
    * row -- Row
    * col -- Column
    * value -- The new value
    */
    public void setValue(int row, int col, String value)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        
        table.get(row).set(col, value);
    }
    
    /**
    * Get a specific value from the table.
    *
    * Precondition:
    *   row >= 0 && row < numRows()
    *   col >= 0 && col < numColumns()
    *
    * row -- Row
    * col -- Column
    * String -- The value, given the row and column
    */
    public String getValue(int row, int col)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        
        return table.get(row).get(col);
    }

    /**
    * Adds a row at the end of the Table, and gives a listing of the contents to be saved
    *
    * Precondition:
    *   l.size() > 0 && l.size() <= numColumns()
    *
    * l -- List with the content to be placed.
    */
    public void addRow(List<String> l)
    {
        assert l.size() > 0 && l.size() <= numColumns();
        
        table.add(l);
    }

    public void addRow(String csv)
    {
        List<String> l = Arrays.asList(csv.split(","));
        assert l.size() > 0 && l.size() <= numColumns();
        
        table.add(l);
    }

    /**
    * Adds a row to the given row index, 
    * gives a list with the contents to be saved.
    * It does not replace the previous line, it places it down.
    *
    * Precondition:
    *   l.size() > 0 && l.size() <= numColumns()
    *   idx > 0 && idx < numRows()
    *
    *
    * idx -- Line index
    * l -- List with the content to be placed.
    */
    public void addRow(int idx, List<String> l)
    {
        assert l.size() > 0 && l.size() <= numColumns();
        assert idx > 0 && idx < numRows();
        
        table.add(idx, l);
    }

    public void addRow(int idx, String csv)
    {
        List<String> l = Arrays.asList(csv.split(","));
        assert l.size() > 0 && l.size() <= numColumns();
        assert idx > 0 && idx < numRows();
        
        table.add(idx, l);
    }

    /**
    * Clears the given line.
    *
    * Precondition:
    *   idx >= 0 && idx < numRows()
    *
    * idx -- Line index
    */
    public void clearRow(int idx)
    {
        assert idx >= 0 && idx < numRows();
        
        for(int i = 0; i < numColumns(); i++)
            table.get(idx).set(i, "");
    }

    /**
    * Deletes the given line.   
    *
    * Precondition:
    *   idx >= 0 && idx < numRows()
    *
    * idx -- Line index
    */
    public void removeRow(int idx)
    {
        assert idx >= 0 && idx < numRows();
        
        table.remove(idx);
    }

    /**
    * Adds a column to the right of the last one of the already existing given list with the content to be saved.
    *
    * Precondition:
    *   l.size() > 0
    *
    * l -- List with the content to be placed
    */
    public void addCol(List<String> l)
    {
        assert l.size() > 0;

        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            if(i < l.size())
                tmp.add(l.get(i));
            else
                tmp.add("");
            table.set(i, tmp);
        }
    }

    public void addCol(String csv)
    {
        List<String> l = Arrays.asList(csv.split(","));
        assert l.size() > 0;

        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            if(i < l.size())
                tmp.add(l.get(i));
            else
                tmp.add("");
            table.set(i, tmp);
        }
    }

    

    /**
    * Adds a column to the given column index, 
    * gives a list with the contents to be stored.
    * It does not replace the previous column, it moves it down. 
    * 
    * Precondition:
    *   idx >= 0 && idx < numColumns()
    *
    * idx -- Column index
    * l -- List with the contents to be placed.
    */
    public void addCol(int idx, List<String> l)
    {
        assert idx >= 0 && idx < numColumns();
        
        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            if(i < l.size())
                tmp.add(idx, l.get(i));
            else
                tmp.add(idx, "");
            table.set(i, tmp);
        }
    }

    public void addCol(int idx, String csv)
    {
        List<String> l = Arrays.asList(csv.split(","));
        assert idx >= 0 && idx < numColumns();
        
        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            if(i < l.size())
                tmp.add(idx, l.get(i));
            else
                tmp.add(idx, "");
            table.set(i, tmp);
        }
    }