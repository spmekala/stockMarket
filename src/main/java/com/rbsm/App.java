package com.rbsm;

import com.jimmoores.quandl.classic.*;
import com.jimmoores.quandl.tablesaw.*;
import com.jimmoores.quandl.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassicQuandlSession session = ClassicQuandlSession.create(SessionOptions.Builder.withAuthToken("-R5snzzsHJ9iSN4xjgSv").build());
        TabularResult tabularResult = session.getDataSet(
                DataSetRequest.Builder.of("WIKI/AAPL").build());
        System.out.println(tabularResult.toPrettyPrintedString());
    }
}
