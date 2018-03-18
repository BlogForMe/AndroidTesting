package com.jon.test;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

/**
 * Created by jon on 3/18/18.
 */

public class TestBase {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

}
