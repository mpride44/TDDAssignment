package com.gaurav.gcd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

public class GCDtest {
    GCDoftwonumber gcd= new GCDoftwonumber();

    @Mock
    FileInput fin;

    @Spy
    FileInput fin2;

    @Before
    public void setup(){
        fin=mock(FileInput.class);
        gcd.setFin(fin);
        fin2=spy(new FileInput());
    }

    @Test
    public void exampleTest() throws IOException{
        String[] str={"2","3"};
        when(fin.input()).thenReturn(str);
        int x=gcd.fun();
        Assert.assertEquals(1, x);
    }

    @Test
    public void checkNegative() throws IOException {
        String[] str={"-2","3"};
        when(fin.input()).thenReturn(str);
        int x=gcd.fun();
        Assert.assertEquals(-1,x);
    }

    @Test
    public void checkInteger() throws IOException{
        String[] str={"hello","2"};
        doReturn(str).when(fin2).input();
        int x=gcd.fun();
        Assert.assertEquals(0,x);
    }
}
