package com.tablehandler;

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

    /**
    * Deletes a column.
    *
    * Precondition:
    * idx >= 0 && idx < numColumns()
    *
    * idx Column index
    */
    public void removeCol(int idx)
    {
        assert idx >= 0 && idx < numColumns();
        
        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            tmp.remove(idx);
            table.set(i, tmp);
        }
    }

    /**
    * Clears a field from the table.
    *
    * Precondition:
    * row >= 0 && row < numRows()
    * col >= 0 && col < numColumns()
    *
    * row Row index
    * col Column index
    */
    public void clearField(int row, int col)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();

        table.get(row).set(col, "");
    }

    /**
    * Gets the number of columns in the table
    *
    * Precondition:
    * table != null
    *
    * Number of columns in table.
    */
    public int numColumns()
    {
        assert table != null;

        return table.get(0).size();
    }

    /**
    * Gets the number of rows from the table
    *
    * Precondition:
    * table != null
    *
    *
    * Number of table rows.
    */
    public int numRows()
    {
        assert table != null;

        return table.size();
    }

    /**
    * Gets a given column with no repeated values.
    *
    * Precondition:
    * idx >= 0 && idx < numColumns()
    *
    *
    * idx Column index
    * The column with no repeated values
    */
    public List<String> getUnique(int idx)
    {
        assert idx >= 0 && idx < numColumns();
        
        List<String> res = new ArrayList<>(), tmp = getColumn(idx, false);
        Set<String> tmpSet = new LinkedHashSet<>();

        for(int i = 0; i < tmp.size(); i++)
            tmpSet.add(tmp.get(i));
        
        res.addAll(tmpSet);
        return res;
    }

    /**
    * Get a given column, with or without the
    * header (first line).
    *
    * Precondition:
    * idx >= 0 && idx < numColumns()
    *
    * idx column index
    * header With (true) or without (false) the header
    * The given column with or without the header
    */
    public List<String> getColumn(int idx, boolean header)
    {
        assert idx >= 0 && idx < numColumns();
        
        List<String> tmp = new ArrayList<>();
        for(int i = (header) ? 0 : 1; i < numRows(); i++)
            tmp.add(getValue(i, idx));
        return tmp;
    }

    /**
    * Get a line given an index.
    *
    * Precondition:
    * idx >= 0 && idx <= numRows()
    *
    * idx Row index
    * The row at the given index
    */
    public List<String> getRow(int idx)
    {
        assert idx >= 0 && idx <= numRows();
        
        return table.get(idx);
    }

    /**
    * Gets the column index given the header value
    *
    * Precondition:
    * s != null
    *
    * s Value to be searched for
    * Index of the column where the value is
    */
    public int getHeaderIndex(String s)
    {
        assert s != null;

        for(int i = 0; i < numColumns(); i++){
            if(table.get(0).get(i).equalsIgnoreCase(s))
                return i;
        }
        return -1;
    }

    /**
    * Get a sub-table between two columns
    *
    * Precondition:
    * startIdx >= 0 && startIdx <= endIdx
    * endIdx < numColumns()
    *
    * startIdx start index
    * endIdx End index (included)
    * 
    * Return: The sub-table
    */
    public List<List<String>> subTableCol(int startIdx, int endIdx)
    {
        assert startIdx >= 0 && startIdx <= endIdx;
        assert endIdx < numColumns();
        
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getColumn(i, true));
        
        return switchColRow(tmp);
    }

    /**
    * Get a sub-table from a column
    *
    * Precondition:
    * table != null
    * startIdx >= 0
    *
    * startIdx -- Initial index
    * return -- The sub-table
    */
    public List<List<String>> subTableCol(int startIdx)
    {
        assert table != null;
        assert startIdx >= 0 && startIdx < numColumns();

        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numColumns(); i++)
            tmp.add(getColumn(i, true));
        
        return switchColRow(tmp);
    }

    /**
    * Get a sub-table between two rows
    *
    * Precondition:
    * startIdx >= 0 && startIdx <= endIdx
    * endIdx < numRows()
    *
    * startIdx -- Beginning index
    * endIdx -- End index (inclusive)
    * return -- The sub-table
    */
    public List<List<String>> subTableRow(int startIdx, int endIdx)
    {
        assert startIdx >= 0 && startIdx <= endIdx;
        assert endIdx < numRows();

        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /**
    * Get a sub-table from a line
    *
    * Precondition:
    * startIdx >= 0 && startIdx < numRows()
    * table != null
    *
    *
    * startIdx -- Initial index
    * return -- The sub-table
    */
    public List<List<String>> subTableRow(int startIdx)
    {
        assert table != null;
        assert startIdx >= 0 && startIdx < numRows();

        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numRows(); i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /**
    * Get a transposed table, that is, swap
    * the rows with the columns
    *
    * Precondition:
    * list != null
    *
    * list -- The table
    * return -- The already modified table
    */
    public List<List<String>> switchColRow(List<List<String>> list)
    {
        assert list != null;

        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = 0; i < list.get(0).size(); i++){
            List<String> tmpList = new ArrayList<>();
            for(List<String> row : list)
                tmpList.add(row.get(i));
            tmp.add(tmpList);
        }
        return tmp;
    }

    /**
    * Sum between two tables
    * (adds the columns of the two tables together)
    *
    * Precondition: 
    * table != null && t != null 
    *  
    *
    * t The table to be added
    * return --A table resulting from the operation
    */
    public Table addTable(Table t)
    {
        assert table != null && t != null;

        Table res = new Table(this);
        for(int i = 0; i < t.numColumns(); i++){
            res.addCol(t.getColumn(i, true));
        }
        return res;
    }

    /**
    * Subtraction between two tables
    * (removes columns if header is equal)
    *
    * Precondition: 
    * table != null && t != null 
    *  
    *
    * t The table to be subtracted
    * return --A table resulting from the operation
    */
    public Table subTable(Table t)
    {
        assert table != null && t != null;
        
        Table res = new Table(this);
        for(int i = 0; i < numColumns(); i++){
            for(int j = 0; j < t.numColumns(); j++){
                if(getColumn(i,true).equals(t.getColumn(j,true))){
                    res.removeCol(i);
                }
            }
        }
        return res;
    }

    /**
    * Sorts the rows of the table (ascending)
    *
    */
    public void sort()
    {
        for(int i = 0; i < numRows(); i++)
            Collections.sort(getRow(i));
    }

    /**
    * Sorts the rows of the table (descending)
    */
    public void sortDesc()
    {
        for(int i = 0; i < numRows(); i++){
            Collections.sort(getRow(i));
            Collections.reverse(getRow(i));
        }
    }

    /**
    * Checks if two tables are equal
    *
    * Precondition: 
    * t != null 
    *  
    *
    * t Table to be compared
    * return --Result (true/false)
    */
    public boolean isEqual(Table t)
    {
        assert t != null;

        return table.containsAll(t.table);
    }

    /**
    * Exports the table to a CSV file to be created
    * in the folder where this file is located
    *
    * Precondition: 
    * filename != null 
    *  
    *
    * filename CSV file name
    */
    public void export(String filename)
    {
        assert filename != null;
        
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new File(filename + ".csv"));
        }
        catch(FileNotFoundException e){
            System.err.println("ERROR: Unable to create file " + filename + ".csv");
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows(); i++){
            for(int j = 0; j < numColumns(); j++){
                sb.append(getValue(i, j));
                
                if(j < numColumns()-1)
                    sb.append(",");
            }
            sb.append("\n");
        }
        pw.write(sb.toString());
        pw.close();
    }

    /**
    * Prints the table
    */
    public void printTable()
    {
        for(int i = 0; i < numRows(); i++){
            System.out.println(getRow(i));
        }
    }

    /**
    * Prints the first "n" lines
    *
    * Precondition: 
    * num > 0 && num < numRows() 
    *  
    *
    * num Number of rows
    */
    public void head(int num)
    {
        assert num > 0 && num < numRows();
        
        for(int i = 0; i < num; i++){
            System.out.println(getRow(i));
        }
    }

    /**
    * Prints the last "n" lines
    *
    * Precondition: 
    * num >= 0 && num < numRows() 
    *  
    *
    * num Number of rows
    */
    public void tail(int num)
    {
        assert num >= 0 && num < numRows();

        for(int i = num; i < numRows(); i++){
            System.out.println(getRow(i));
        }
    }

    /**
    * Gets the maximum value of a list (row / column)
    *
    * Precondition: 
    * list.size() > 0 
    *  
    *
    * csv String
    * return --The maximum value of the list
    */
    public Double max(String csv)
    {
        List<String> list = Arrays.asList(csv.split(","));
        assert list.size() > 0;

        Double aux, max;
        try {
            max = Double.parseDouble(list.get(1));
            for(int i = 1; i < list.size(); i++){
                aux = Double.parseDouble(list.get(i));
                max = aux > max ? aux : max;
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return max;
    }

    /**
    * Gets the minimum value from a list (row / column)
    *
    * Precondition: 
    * list.size() > 0 
    *  
    *
    * csv String
    * return --The minimum value of the list
    */
    public Double min(String csv)
    {
        List<String> list = Arrays.asList(csv.split(","));
        assert list.size() > 0;

        Double aux, min;
        try {
            min = Double.parseDouble(list.get(1));
            for(int i = 1; i < list.size(); i++){
                aux = Double.parseDouble(list.get(i));
                min = aux < min ? aux : min;
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return min;
    }

    /**
    * Gets the sum value of a list (row / column)
    *
    * Precondition: 
    * list.size() > 0 
    *  
    *
    * csv -- String
    * return --the sum value of the list
    */
    public Double sum(String csv)
    {
        List<String> list = Arrays.asList(csv.split(","));
        assert list.size() > 0;

        Double sum = 0.0;
        try {
            for(int i = 0; i < list.size(); i++){
                sum += Double.parseDouble(list.get(i));
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return sum;
    }

    /**
    * Gets the average value of a list (row / column)
    *
    * Precondition: 
    * list.size() > 0 
    *  
    *
    * csv -- String
    * return --The average value of the list
    */
    public Double avg(String csv)
    {
        List<String> list = Arrays.asList(csv.split(","));
        assert list.size() > 0;

        Double sum = 0.0;
        int aux = 0;
        try {
            for(int i = 0; i < list.size(); i++){
                sum += Double.parseDouble(list.get(i));
                aux++;
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return sum/aux;
    }
}
