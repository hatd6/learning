/*
 * GUMBOX BLUE CORPORATION.
 * Copyright (c) 2023-present Gumbox Blue, Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gumbox Blue Corporation.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered
 * into with Gumbox Blue Corporation.
 *
 */
package oracleCertifiedProfessional;

/**
 * Such blocks serve the same purpose as constructors during object creation The
 * syntax of an instance initializer block is the same as that of a local block
 * The code in the local block is executed every time an instance of the class
 * is created.
 */
public class InstanceInitializers {
    long[] squares = new long[10]; // (1) The array squares of specified length is first created at line

    // ...
    { // (2) Instance Initializer
	for (int i = 0; i < squares.length; i++) {
	    squares[i] = i * i;
	}
    }
    // ...
}