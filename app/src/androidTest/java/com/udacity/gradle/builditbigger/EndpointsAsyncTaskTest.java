package com.udacity.gradle.builditbigger;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnitRunner;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Pair;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)

public class EndpointsAsyncTaskTest extends ApplicationTest {

    @Test
    public void testOnPostExecute() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        assertNotNull(endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), "test")));
    }
}